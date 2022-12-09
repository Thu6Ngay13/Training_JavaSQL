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
public class Bai_34_SoLCMxyz {
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
        long x, y, z, n;
        x = sc.nextLong();
        y = sc.nextLong();
        z = sc.nextLong();
        n = sc.nextLong();
        long ans = ((long)Math.pow(10, n-1)/lcm(lcm(x, y), z)+1)*lcm(lcm(x, y), z);
        if(ans != 0) System.out.println(ans);
        else System.out.println(-1);
    }
}
