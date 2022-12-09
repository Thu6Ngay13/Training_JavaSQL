/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_15;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_5_InMaTranTheoMau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();
        System.out.println("Pattern 1:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(A[j][i] + " ");
            System.out.println("");
        }
        System.out.println("Pattern 2:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(A[n-1-i][n-1-j] + " ");
            System.out.println("");
        }
        System.out.println("Pattern 3:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(A[j][n-1-i] + " ");
            System.out.println("");
        }
        System.out.println("Pattern 4:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(A[i][n-1-j] + " ");
            System.out.println("");
        }
        
    }
}
