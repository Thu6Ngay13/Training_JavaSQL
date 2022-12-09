/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_3;
import java.util.Scanner;
/**
 *
 * @author wwhac
 */
public class Bai_16_SoSmith {
    private static boolean checkNto(long n){
        if(n < 2) return false;
        for(long i = 2; i <= Math.sqrt(n); i++)
            if(n%i == 0) return false;
        return true;
    }
    private static long res(long n){
        long ans = 0;
        while(n != 0){
            ans += n%10;
            n /= 10;
        }
        return ans;
    }
    private static boolean checkSmith(long n){
        if(checkNto(n)) return false;
        long sum1 = res(n), sum2 = 0;
        for(long i = 2; i <= Math.sqrt(n); i++){
            while(n!= 1 && n % i == 0){
                n /= i;
                sum2 += res(i);
            }
        }
        if(n != 1) sum2 += res(n);
        return (sum1 == sum2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; n = sc.nextLong();
        if(checkSmith(n)) System.out.println("YES");
        else    System.out.println("NO");
    }
}
