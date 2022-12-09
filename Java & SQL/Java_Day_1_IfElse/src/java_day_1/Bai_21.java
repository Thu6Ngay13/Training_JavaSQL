/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_1;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        int a, b;
        n = sc.nextLong();
        a = sc.nextInt();
        b = sc.nextInt();
        if(b < 2*a) System.out.println((long)n/2*b + (long)(n%2)*a);
        else System.out.println((long)n*a);
    }
}
