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
public class Bai_11_DecToBin {
    private static void bin(long n){
        if(n == 0) return;
        bin(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0) System.out.println(n);
        else bin(n);
    }
}
