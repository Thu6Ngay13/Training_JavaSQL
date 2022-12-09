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
public class Bai_12_TPhanTo16 {

    private static void to16(long n) {
        if(n == 0) return;
        to16(n / 16);
        long x = n % 16;
        if (x > 9) {
            System.out.print((char) ('A' + x % 10));
        } else {
            System.out.print(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0) System.out.println("0") ;
        else to16(n);
    }
}
