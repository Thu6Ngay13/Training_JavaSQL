/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_47_FactoryMachine {
    private static boolean f(int[] A, int n, int k, long time){
        long product = 0;
        for(int i = 0; i <  n; i++){
            product += time/A[i];
            if(product >= k) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = Long.MAX_VALUE, r = Long.MIN_VALUE, ans = -1;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int x:A) r = Math.max(r, 1l*k*x);
        for(int x:A) l = Math.min(l, 1l*k/n*x);
        while(l <= r){
            long m = (l+r)/2;
            if(f(A, n, k, m)){
                ans = m;
                r = m-1;
            }
            else l = m+1;
        }
        System.out.println(ans);
    }
}
