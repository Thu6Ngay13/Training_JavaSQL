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
public class Bai_10_TimKiemNhiPhanBienDoi {
    private static int tTac1(int n, int A[], int x){
        int l = 0, r = n-1, res = -1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] == x){
                res = m;
                r = m-1;
            }
            else if(A[m] > x) r = m-1;
            else l = m+1;
        }
        return res;
    }
    private static int tTac2(int n, int A[], int x){
        int l = 0, r = n-1, res = -1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] == x){
                res = m;
                l = m+1;
            }
            else if(A[m] > x) r = m-1;
            else l = m+1;
        }
        return res;
    }
    private static int tTac3(int n, int A[], int x){
        int l = 0, r = n-1, res = -1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] >= x){
                res = m;
                r = m-1;
            }
            else l = m+1;
        }
        return res;
    }
    private static int tTac4(int n, int A[], int x){
        int l = 0, r = n-1, res = -1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] > x){
                res = m;
                r = m-1;
            }
            else l = m+1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        int t1 = tTac1(n, A, x);
        int t2 = tTac2(n, A, x);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(tTac3(n, A, x));
        System.out.println(tTac4(n, A, x));
        if(t1 != -1) System.out.println(t2-t1+1);
        else System.out.println(0);
    }
}
