/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_5;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_21_KiemTraMangDX {
    
    private static boolean check(int n, int A[], int i, int j){
        if(i >= j) return true;
        return A[i] == A[j] && check(n, A, i+1, j-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc. nextInt();
        if(check(n, A, 0, n-1)) System.out.println("YES");
        else System.out.println("NO");
    }
}
