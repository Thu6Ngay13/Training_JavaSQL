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
public class Bai_22_InMang {

    private static void in1(int i, int A[]) {
        if (i == 0) {
            System.out.print(A[0] + " ");
        } else {
            System.out.print(A[i] + " ");
            in1(i - 1, A);
        }
    }
        
    private static void in2(int i, int A[]) {
        if (i == 0) {
            System.out.print(A[0] + " ");
        } else {
            in2(i - 1, A);
            System.out.print(A[i] + " ");
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        in2(n-1, A);
        System.out.println("");
        in1(n-1, A);
    }
}
