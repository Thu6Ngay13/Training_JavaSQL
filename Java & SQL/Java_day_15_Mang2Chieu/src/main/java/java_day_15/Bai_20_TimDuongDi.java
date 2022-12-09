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
public class Bai_20_TimDuongDi {
    private static int n = 0, m = 0, ok = -1;
    private static long[][] A = new long[102][102];
    
    private static int[] dx = {-1, 0, 0, 1};
    private static int[] dy = {0, 1, -1, 0};
    
    private static void check(int s, int u, int t, int v){
        if(s == t && u == v) ok = 1;
        else{
            A[s][u] = 0;
            for(int k = 0; k < 4; k++){
                int i1 = s + dx[k];
                int j1 = u + dy[k];
                if(i1 > 0 && j1 > 0 
                    && i1 <= n && j1 <= m 
                    && A[i1][j1] == 1)
                    check(i1, j1, t, v);
                if(ok == 1) return;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int s = sc.nextInt();
        int u = sc.nextInt();
        int t = sc.nextInt();
        int v = sc.nextInt();
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= m; j++)
                A[i][j] = sc.nextLong();
        check(s, u, t, v);
        if(ok == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
