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
public class Bai_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        n = sc.nextInt();
        if (t <= 0 || t >= 13 || n <= 0) {
            System.out.println("INVALID");
        } else if (t == 2) {
            if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else if (t == 1 || t == 3 || t == 5 || t == 7 | t == 8 || t == 10 || t == 12) {
            System.out.println("31");
        } else {
            System.out.println("30");
        }
    }
}
