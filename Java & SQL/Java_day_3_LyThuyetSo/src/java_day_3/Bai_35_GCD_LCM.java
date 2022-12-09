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
public class Bai_35_GCD_LCM {
    private static long gcd(long a, long b){
        while(b != 0){
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }
    private static long lcm(long a, long b){
        return a/gcd(a, b)*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b; 
        a = sc.nextLong();
        b = sc.nextLong();
        System.out.println(gcd(a, b) + " " + lcm(a, b));
    }
}
