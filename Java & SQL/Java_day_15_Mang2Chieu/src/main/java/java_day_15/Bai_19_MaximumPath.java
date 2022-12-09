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
public class Bai_19_MaximumPath {
    private static int n = 0, m = 0;
    private static long[][] A = new long[102][102];
    private static long[][] B = new long[102][102];
    
    private static int[] dx = {-1, 0};
    private static int[] dy = {0, -1};
    
    private static void check(){
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= m; j++){
                for(int k = 0; k < 2; k++){
                    int i1 = i + dx[k];
                    int j1 = j + dy[k];
                    B[i][j] = Math.max(B[i][j], A[i][j] + B[i1][j1]);
                }
            }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= m; j++)
                A[i][j] = sc.nextLong();
        check();
        System.out.println(B[n][m]);
    }
}
