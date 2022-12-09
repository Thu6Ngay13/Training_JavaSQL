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
public class Bai_18_DemSoCapBangNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        int[] C = new int[1000005];
        for(int x:A) C[x]++;
        long ans = 0;
        for(int i = 0; i < 1000005; i++)
            ans += 1l*C[i]*(C[i]-1)/2;
        System.out.println(ans);
    }
}
