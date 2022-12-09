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
public class Bai_11_LietKeDemFibo {
    private static boolean fibo(long n){
        if(n == 0 || n == 1) return true;
        long f2 = 1;
        long f1 = 1;
        long f = 1;
        while(f < n){
            f = f1 + f2;
            f2 = f1;
            f1 = f;
        }   
        return f == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        long[] A = new long[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextLong();
        for(long x:A){
            if(fibo(x)){
                System.out.print(x + " ");
                k++;
            }
        }
        if(k == 0) System.out.println("NONE");
    }
}
