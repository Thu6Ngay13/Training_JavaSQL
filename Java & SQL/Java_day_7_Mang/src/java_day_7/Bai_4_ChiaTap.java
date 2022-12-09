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
public class Bai_4_ChiaTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = 0;
        long l = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
            s += 1l*A[i];
        }
        Arrays.sort(A);
        for(int i = 0; i < Math.min(k, n-k); i++)
            l += 1l*A[i];
        System.out.println(s - 2*l);
    }
}
