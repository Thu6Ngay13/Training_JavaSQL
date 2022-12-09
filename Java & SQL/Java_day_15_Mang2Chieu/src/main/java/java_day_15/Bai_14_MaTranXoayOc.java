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
public class Bai_14_MaTranXoayOc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int c1 = 0, c2 = n-1, h1 = 0, h2 = n-1, cnt = 1;
        while(cnt <= n*n){
            for(int i = c1; i <= c2; i++)
                A[h1][i] = cnt++;
            h1++;
            for(int i = h1; i <= h2; i++)
                A[i][c2] = cnt++;
            c2--;
            for(int i = c2; i >= c1; i--)
                A[h2][i] = cnt++;
            h2--;
            for(int i = h2; i >= h1; i--)
                A[i][c1] = cnt++;
            c1++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(A[i][j] + " ");
            System.out.println("");
        }
    }
}
