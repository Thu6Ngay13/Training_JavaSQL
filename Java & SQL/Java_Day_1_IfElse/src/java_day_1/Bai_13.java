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
public class Bai_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N; N = sc.nextInt();
        System.out.print(N/365);
        System.out.print(" ");
        System.out.print((N - N/365*365)/7);
        System.out.print(" ");
        System.out.print(N - N/365*365 - (N-N/365*365)/7*7);
    }
}
