/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_17_CapSoCoTongBangK {
    private static int find(int n, int A[],  int x){
        int l = 0, r = n-1;
        while(l <= r){
            int m = (l+r) /2;
            if(A[m] >= x) r = m-1;
            else l = m+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < n && A[i] <= k; i++)
            ans += find(n, A, k-A[i]);
        System.out.println(ans);
    }
}
