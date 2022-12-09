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
public class Bai_24_KiemTraMangTangDan {
    private static boolean check(int i, int A[]){
        if(i == 0) return true;
        return A[i-1] < A[i] && check(i-1, A);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        if(check(n-1, A)) System.out.println("YES");
        else System.out.println("NO");
    }
}
