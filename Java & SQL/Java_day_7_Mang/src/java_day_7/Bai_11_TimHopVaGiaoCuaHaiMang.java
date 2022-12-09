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
public class Bai_11_TimHopVaGiaoCuaHaiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        int[][] C = new int[2][10000005];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < m; i++) B[i] = sc.nextInt();
        
        for(int i = 0; i < n; i++) 
            if(A[i] < 0) C[0][(-A[i])] = 1;
            else C[1][A[i]] = 1;
        
        for(int i = 0; i < m; i++) 
            if(B[i] < 0){
                if(C[0][(-B[i])] == 1 || C[0][(-B[i])] == 2) C[0][(-B[i])] = 2;
                else C[0][(-B[i])] = 3;
            }
            else{
                if(C[1][B[i]] == 1 || C[1][B[i]] == 2) C[1][B[i]] = 2;
                else C[1][B[i]] = 3;
            }
        
        for(int i = 0; i < 2; i++)
            for(int j = i; j < 10000005; j++){
                if(i == 0 && C[i][10000004-j] != 0) System.out.print(-(10000004-j) + " ");
                else if(i == 1 && C[i][j] != 0) System.out.print(j + " ");
            }
        System.out.println("");
        for(int i = 0; i < 2; i++)
            for(int j = i; j < 10000005; j++){
                if(i == 0 && C[i][10000004-j] == 2) System.out.print(-(10000004-j) + " ");
                else if(i == 1 && C[i][j] == 2) System.out.print(j + " ");
            }
    }
}

