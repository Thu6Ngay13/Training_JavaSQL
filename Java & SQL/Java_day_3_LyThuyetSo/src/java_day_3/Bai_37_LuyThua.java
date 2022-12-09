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
public class Bai_37_LuyThua {
    private static long luyThua(long a, long b){
        long ans = 1;
        long m = 1000000007;
        while(b != 0){
            if(b % 2 != 0){
                ans = (ans*a)%m;
            }
            a = ((a%m)*(a%m))%m;
            b /= 2;
        }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextLong();
        b = sc.nextLong();
        System.out.println(luyThua(a, b));
    }
}
