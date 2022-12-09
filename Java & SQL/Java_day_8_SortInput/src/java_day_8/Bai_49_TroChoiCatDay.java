/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_49_TroChoiCatDay {
    private static boolean f(int n, int[] A, int k, double x){
        int cnt = 0;
        for(int i = 0; i < n; i++)
            cnt += (int)(A[i]/x);
        return cnt >= k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        double l = Long.MAX_VALUE, r = Long.MIN_VALUE, ans = -1;
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int x:A) r = Math.max(r, x);
        for(int x:A) l = Math.min(l, 1.0*x/k);
        for(int i = 1; i <= 100; i++){
            double m = (l+r)/2;
            if(f(n, A, k, m)){
                ans = m;
                l = m;
            }
            else r = m;
        }
        System.out.printf("%.6f", ans);
    }
}
