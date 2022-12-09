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
public class Bai_25_Mang012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] A = new int[n];
         for(int i = 0; i < n; i++) A[i] = sc.nextInt();
         int[] B = new int[3];
         for(int x:A) B[x]++;
         for(int i = 0; i < 3; i++)
             for(int j = 0; j < B[i]; j++) 
                 System.out.print(i + " ");
         
    }
}
