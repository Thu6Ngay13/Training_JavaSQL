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
public class Bai_25_BinarySearch {
    private static int f(int l, int r, int x, int A[]){
        if(l > r) return 0;
        int m = (l+r)/2;
        if(A[m] == x) return 1;
        if(A[m] > x) return f(m+1, r, x, A);
        else return f(l, m-1, x, A);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(f(0, n-1, x, A));
    }
}
