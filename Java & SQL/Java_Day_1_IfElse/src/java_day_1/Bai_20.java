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
public class Bai_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, k;
        a = sc.nextInt();
        b = sc.nextInt();
        k = sc.nextInt();
        long ans = (long)a*(k/2 + k%2) - (long)b*(k/2);
        System.out.println(ans);
    }
}
