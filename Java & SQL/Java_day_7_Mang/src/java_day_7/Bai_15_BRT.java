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
public class Bai_15_BRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        int m = Integer.MAX_VALUE;
        int cnt = 0;
        for(int i = 1; i < n; i++){
            if(A[i]-A[i-1] < m){
                m = A[i]-A[i-1];
                cnt = 1;
            }
            else if(m == A[i]-A[i-1])
                cnt++;
        }
        System.out.println(m + " " + cnt);
    }
}
