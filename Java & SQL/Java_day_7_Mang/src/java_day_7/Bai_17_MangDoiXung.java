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
public class Bai_17_MangDoiXung {
    private static void check(int n, int A[]){
        int l = 0, r = n-1;
        while(l < r){
            if(A[l] != A[r]){
                System.out.println("NO");
                return;
            }
            l++; r--;
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        check(n, A);
    }
}
