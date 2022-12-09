/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_11_DemCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        int[] C = new int[1005];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int x:A) C[x]++;
        long ans = C[k/2]*(C[k/2+1]);
        if(k%2 == 0) ans = C[k/2]*(C[k/2]-1)/2;
        for(int i = 0; i < k/2; i++)
                ans += C[i]*C[k-i];
        System.out.println(ans);
    }
}
