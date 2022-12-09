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
public class Bai_9_DemTanSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[10000005];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < n; i++) B[A[i]]++;
        for(int i = 0; i < 10000005; i++)
            if(B[i] != 0) System.out.println(i + " " + B[i]);
        System.out.println("");
        for(int i = 0; i < n; i++)
            if(B[A[i]] != 0){
                System.out.println(A[i] + " " + B[A[i]]);
                B[A[i]] = 0;
            }
    }
}