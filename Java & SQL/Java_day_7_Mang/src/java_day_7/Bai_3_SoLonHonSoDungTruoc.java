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
public class Bai_3_SoLonHonSoDungTruoc {
    private static void solve(int n, int A[]){
        System.out.print(A[0] + " ");
        int m = A[0];
        for(int i = 1; i < n; i++)
            if(m < A[i]){
                System.out.print(A[i] + " ");
                m = A[i];
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        solve(n, A);
    }
}
