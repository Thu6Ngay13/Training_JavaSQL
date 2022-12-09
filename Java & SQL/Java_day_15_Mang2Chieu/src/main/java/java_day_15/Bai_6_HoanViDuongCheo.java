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
public class Bai_6_HoanViDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++){
                if(i == j)
                    A[i][m-1-i] = sc.nextInt();
                else if(j == m-1-i)
                    A[i][i] = sc.nextInt();
                else
                    A[i][j] = sc.nextInt();
            }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
              System.out.print(A[i][j] + " ");
            System.out.println("");
        }
    }
}
