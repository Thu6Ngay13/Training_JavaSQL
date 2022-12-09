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
public class Bai_16_DinhLyPytago {
    private static boolean pytago(int n, long A[]){
        for(int i = n-1; i > 1; i--){
            int l = 0, r = i-1;
            while(l < r){
                if(A[l] + A[r] == A[i]) return true;
                else if(A[l] + A[r] < A[i]) l++;
                else r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            A[i] = 1l*x*x;
        }
        Arrays.sort(A);
        if(pytago(n, A)) System.out.println("YES");
        else System.out.println("NO");
    }
}
