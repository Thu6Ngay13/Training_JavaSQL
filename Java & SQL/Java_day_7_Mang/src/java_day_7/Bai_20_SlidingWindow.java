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
public class Bai_20_SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long s = 0;
        long as = 0;
        int[] A = new int[n];
        int[] B = new int[k];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < k; i++){
            s += 1l*A[i];
            B[i] = A[i];
        }
        as = s;
        for(int i = k; i < n; i++){
            s = s + A[i] - A[i-k];
            if(s > as){
                as = s;
                for(int j = 0; j < k; j++)
                    B[j] = A[i-k+j+1];
            }
            
        }
        System.out.println(as);
        for(int i = 0; i < k; i++) System.out.print(B[i] + " ");
            
        
    }
}
