/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_15;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_10_DemSNTTrenCheoChinhVaPhu {
    private static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++)
            if(check(A[i][i]))
                set.add(A[i][i]);
        for(int i = 0; i < n; i++)
            if(check(A[i][n-1-i]))
                set.add(A[i][n-1-i]);
        System.out.println(set.size());
    }
}
