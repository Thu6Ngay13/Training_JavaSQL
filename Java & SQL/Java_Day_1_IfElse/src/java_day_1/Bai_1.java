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

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x; x = sc.nextInt();
        long ans = (long)x*x*x + (long)3*x*x + x + 1;
        System.out.println(ans);
    }
}