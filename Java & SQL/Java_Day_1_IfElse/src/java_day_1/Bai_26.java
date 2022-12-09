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
public class Bai_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, d;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();
        System.out.print(Math.max(Math.max(a, b), Math.max(c, d)));
        System.out.print(" ");
        System.out.print(Math.min(Math.min(a, b), Math.min(c, d)));
    }
}
