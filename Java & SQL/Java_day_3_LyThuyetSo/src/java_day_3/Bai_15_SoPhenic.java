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
public class Bai_15_SoPhenic {
    private static int check(long n){
        if(n < 30) return 0;
        int cnt = 0;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                n /= i;
                cnt++;
                if(n/i % i == 0) return 0;
            }
        }
        if((n != 1 && cnt == 2) || (n == 1 && cnt == 3)) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; n = sc.nextLong();
        System.out.println(check(n));
    }
}
