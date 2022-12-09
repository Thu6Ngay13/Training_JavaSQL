/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_13_Nhan2MaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        long[][] A = new long[n][m];
        long[][] B = new long[m][p];
        long[][] C = new long[n][p];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                A[i][j] = sc.nextLong();
        for(int i = 0; i < m; i++)
            for(int j = 0; j < p; j++)
                B[i][j] = sc.nextLong();
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < p; j++){
                long sum = 0;
                for(int k = 0; k < m; k++)
                    sum += 1l*A[i][k]*B[k][j];
                C[i][j] = sum;
            }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++)
                System.out.print(C[i][j] + " ");
            System.out.println("");
        }
    }
}
