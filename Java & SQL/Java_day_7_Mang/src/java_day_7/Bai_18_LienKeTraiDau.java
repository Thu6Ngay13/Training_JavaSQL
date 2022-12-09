/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_18_LienKeTraiDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        if(1l*A[0]*A[1] < 0) System.out.print(A[0] + " ");
        for(int i = 1; i < n-1; i++)
            if(1l*A[i]*A[i-1] < 0 || 1l*A[i]*A[i+1] < 0) System.out.print(A[i] + " ");
        if(1l*A[n-1]*A[n-2] < 0) System.out.print(A[n-1]);

    }
}
