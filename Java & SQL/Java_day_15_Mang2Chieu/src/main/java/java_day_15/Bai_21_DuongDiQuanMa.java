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
public class Bai_21_DuongDiQuanMa {
    private static int n = 0, m = 0, ok = -1;
    private static int[][] A = new int[102][102];
    
    private static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    
    private static void check(int s, int t, int u, int v){
        if(s == u && t == v) ok = 1;
        else{
            for(int k = 0; k < 8; k++){
                int i1 = s + dx[k];
                int j1 = t + dy[k];
                if(i1 > 0 && j1 > 0 
                    && i1 <= n && j1 <= m 
                    && A[i1][j1] == 1)
                    check(i1, j1, u, v);
                if(ok == 1) return;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = n;
        int s = sc.nextInt();
        int t = sc.nextInt();
        int u = sc.nextInt();
        int v = sc.nextInt();
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= m; j++)
                A[i][j] = sc.nextInt();
        check(s, t, u, v);
        if(ok == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
