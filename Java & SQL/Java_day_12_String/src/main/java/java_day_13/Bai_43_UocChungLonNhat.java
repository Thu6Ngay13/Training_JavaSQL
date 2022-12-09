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
public class Bai_43_UocChungLonNhat {
    private static long mod(String n, long m){
        long x = 0;
        for(int i = 0; i < n.length(); i++){
            x = x*10 + 1l*(n.charAt(i)- '0');
            x %= m;
        }
        return x;
    }
    private static long gcd(long a, long b){
        while(b != 0){
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        long m = sc.nextLong();
        long k = mod(n, m);
        System.out.println(gcd(m, k));
    }
}
