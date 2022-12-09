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
public class Bai_2_TongHangCotTrenMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();
        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = 0; j < m; j++)
                sum += 1l*A[i][j];
            System.out.print(sum + " ");
        }
        System.out.println("");
        for(int j = 0; j < m; j++){
            long sum = 0;
            for(int i = 0; i < n; i++)
                sum += 1l*A[i][j];
            System.out.print(sum + " ");
        }
    }
}
