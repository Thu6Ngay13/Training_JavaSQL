/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_2;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 1; i <= Math.sqrt(n); i++)
              System.out.print((long)i*i + " ");
    }
}
