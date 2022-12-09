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
public class Bai_2_KiemTraMangTangDan {
    private static boolean check(int n, int A[]){
        for(int i = 0; i < n-1; i++)
            if(A[i+1] <= A[i])
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        if(check(n, A)) System.out.println("YES");
        else System.out.println("NO");
    }
}
