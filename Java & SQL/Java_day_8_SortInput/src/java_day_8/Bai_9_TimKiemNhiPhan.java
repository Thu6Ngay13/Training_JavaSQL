/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_9_TimKiemNhiPhan {
    private static void bS(int n, int A[], int x){
        int l = 0, r = n-1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] == x){
                System.out.println("YES");
                return;
            }
            else if(A[m] > x) r = m-1;
            else l = m+1;
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        int q = sc.nextInt();
        while(q-- != 0){
            int x = sc.nextInt();
            bS(n, A, x);
        }
    }
}
