/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_44_LuyThuaVoiCoSoLon {
    private static long mod(String n, long m){
        long x = 0;
        for(int i = 0; i < n.length(); i++){
            x = x*10 + 1l*(n.charAt(i)- '0');
            x %= m;
        }
        return x;
    }
    private static long bS(long a, long b){
        long m = 1000000000+7;
        long ans = 1;
        while(b != 0){
            if(b%2 != 0) ans *= a;
            ans %= m;
            a = ((a%m)*(a%m))%m;
            b /= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = mod(s, 1000000000+7);
        long m = sc.nextLong();
        System.out.println(bS(n, m));
    }
}
