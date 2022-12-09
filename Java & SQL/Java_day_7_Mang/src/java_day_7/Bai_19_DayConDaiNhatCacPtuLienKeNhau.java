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
public class Bai_19_DayConDaiNhatCacPtuLienKeNhau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        int[] B = new int[n];
        int[] C = new int[n];
        int k = 1;
        int h = 1;
        B[0] = A[0];
        for(int i = 1; i < n; i++){
            if(A[i-1] < A[i]){
                B[k] = A[i];
                k++;
            }
            else if(k >= h){
                h = k;
                for(int j = 0; j < h; j++)
                    C[j] = B[j];
                k = 1;
                B[0] = A[i];
            }
            else{
                k = 1;
                B[0] = A[i];
            }
        }
        if(k >= h){
            h = k;
            for(int j = 0; j < h; j++)
                C[j] = B[j];
        }
        System.out.println(h);
        for(int i = 0; i < h; i++) System.out.print(C[i] + " ");
    }
}
