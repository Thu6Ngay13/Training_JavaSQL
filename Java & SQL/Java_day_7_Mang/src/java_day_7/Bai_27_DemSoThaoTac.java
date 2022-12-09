/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_27_DemSoThaoTac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        long as = 0;
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 1; i < n; i++){
            if(A[i] <= A[i-1]){
                int x = (A[i-1] - A[i])/d+1;
                A[i] += x*d;
                as += x;
            }
        }
        System.out.println(as);
    }
}
