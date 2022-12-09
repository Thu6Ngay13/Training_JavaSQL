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
public class Bai_18_SoDiemCucDai {
    private static int[][] A = new int[102][102];
    private static int n = 0, m = 0;
    
    private static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static int[] dy = {-1, 1, 0, 1, -1, 0, -1, 1};
    
    private static boolean check(int i, int j){
        for(int k = 0; k < 8; k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(i1 <= n && i1 > 0 
                && j1 <= m && j1 > 0 
                && A[i][j] <= A[i1][j1]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= m; j++)
                A[i][j] = sc.nextInt();
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= m; j++)
                if(check(i, j)) count++;
        System.out.println(count);
    }
}
