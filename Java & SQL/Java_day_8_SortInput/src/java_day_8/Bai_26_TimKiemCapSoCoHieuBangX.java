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
public class Bai_26_TimKiemCapSoCoHieuBangX {
    private static boolean p(int i, int n, int A[], int x){
        int l = i, r = n-1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] == x) return true;
            else if(A[m] > x) r = m-1;
            else l = m+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        Arrays.sort(A);
        boolean ok = false;
        for(int i = 0; i < n; i++)
            if(p(i, n, A, A[i] + k)){
                ok = true;
                break;
            }
        if(ok) System.out.println("1");
        else System.out.println("-1");
    }
}
