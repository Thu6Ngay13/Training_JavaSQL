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
public class Bai_18_CapSoCoTongNhoHonK {
    private static int pos(int i, int n, int A[], int x){
        int l = i, r = n-1, res = -1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] < x){
                res = m;
                l = m+1;
            }
            else r = m-1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        Arrays.sort(A);
        long cnt = 0;
        for(int i = 0; i < n; i++){
            int p = pos(i+1, n, A, k-A[i]);
            if(p != -1) cnt += (p - i);
        }
        System.out.println(cnt);
    }
}
