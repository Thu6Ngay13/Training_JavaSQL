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
public class Bai_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(), N = sc.nextInt();
        if (M < 2) {
            System.out.println((N / 2) * M);
        } else {
            System.out.println((long)(M / 2) * N + (long)(N / 2)*(M - M/2*2));
        }
    }
}
