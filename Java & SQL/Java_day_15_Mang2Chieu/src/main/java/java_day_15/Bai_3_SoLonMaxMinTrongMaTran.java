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
public class Bai_3_SoLonMaxMinTrongMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] C = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();
        int max = -1;
        int min = 1000000005;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(A[i][j] > max){
                    max = A[i][j];
                    B[i][j] = max;
                }
                else if(A[i][j] == max) B[i][j] = max;;
                if(A[i][j] < min){
                    min = A[i][j];
                    C[i][j] = min;
                }
                else if(A[i][j] == min) C[i][j] = min;;
            }
        }
        System.out.println(min);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                if(C[i][j] == min) System.out.println((i+1) + " " + (j+1));
        }
        System.out.println(max);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                if(B[i][j] == max) System.out.println((i+1) + " " + (j+1));
        }
    }
}
