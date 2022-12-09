/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_46_ChiaMangThanhKmangConLienTiepCoTongNhoNhat {
    private static boolean f(int[] A, int n, int k, long m){
        int cnt = 0;
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += A[i];
            if(sum > m){
                cnt++;
                sum = A[i];
            }
        }
        if(sum != 0) cnt++;
        return cnt <= k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = 0, r = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int x:A) r += x;
        for(int x:A) l = Math.max(x, l);
        long ans = -1;
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
