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
public class Bai_21_DemPhanPhoiSuDungMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[1005];
        int[] C = new int[1005];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int x:A) B[x]++;
        for(int x:A)
            if(B[x] != 0 && C[x] == 0){
                System.out.println(x + " " + B[x]);
                C[x] = 1;
            }
        System.out.println("");
        
        for(int i = 0; i < 1005; i++)
            if(B[i] != 0) System.out.println(i + " " + B[i]);
        System.out.println("");
        
        int minF = 1005;
        int vLueMin = 1005;
        int maxF = 0;
        int vLueMax = 0;
        
        for(int x:A){
            if(B[x] < minF || (B[x] == minF && x < vLueMin)){
                minF = B[x];
                vLueMin = x;
            }
            if(B[x] > maxF || (B[x] == maxF && x > vLueMax)){
                    maxF = B[x];
                    vLueMax = x;
            }
        }
        System.out.println(vLueMax);
        System.out.println(vLueMin);
    }
}
