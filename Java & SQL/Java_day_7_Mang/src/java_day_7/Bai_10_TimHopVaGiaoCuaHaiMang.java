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
public class Bai_10_TimHopVaGiaoCuaHaiMang {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        int[] C = new int[10000005];
        Arrays.fill(C, 0);
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < m; i++) B[i] = sc.nextInt();
        for(int i = 0; i < n; i++) C[A[i]] = 1;
        for(int i = 0; i < m; i++) 
            if(C[B[i]] == 1 || C[B[i]] == 2) C[B[i]] = 2;
            else C[B[i]] = 3;
        
        for(int i = 0; i < 10000005; i++) if(C[i] == 2) System.out.print(i + " ");
        System.out.println("");
        for(int i = 0; i < 10000005; i++) if(C[i] != 0) System.out.print(i + " ");
    }
}
