/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_5;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_16_ChuSoMinMax {
    private static void f(long n, long ma, long mi){
        if(n <  10) System.out.println(Math.max(ma, n) + " " + Math.min(mi, n));
        else f(n/10, (long)Math.max(ma, n%10), (long)Math.min(mi, n%10));
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        f(n, -10, 10);
    }
}
