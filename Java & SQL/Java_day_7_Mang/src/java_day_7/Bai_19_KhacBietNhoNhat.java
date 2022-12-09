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
public class Bai_19_KhacBietNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A, 0, n);
        int m =  10000000;
        for(int i = 0; i < n-1; i++)
            m = Math.min(A[i+1]-A[i], m);
        System.out.println(m);
    }
}
