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
public class Bai_17_InSoNguyen {
    private static void in1(long n){
        if(n < 10) System.out.print(n + " ");
        else{
            in1(n/10);
            System.out.print(n%10 + " ");
        }
    }
    private static void in2(long n){
        if(n < 10) System.out.print(n + " ");
        else{
            System.out.print(n%10 + " ");
            in2(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; n = sc.nextLong();
        in1(n);
        System.out.println("");
        in2(n);
    }
}
