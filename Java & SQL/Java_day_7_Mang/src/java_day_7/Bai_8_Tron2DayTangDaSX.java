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
public class Bai_8_Tron2DayTangDaSX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] A = new int [n];
        int[] B = new int [m];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < m; i++) B[i] = sc.nextInt();
        int i = 0, j = 0;
        while(i < n && j < m){
            if(A[i] < B[j]) System.out.print(A[i++] + " ");
            else System.out.print(B[j++] + " ");
        }
        while(i < n) System.out.print(A[i++] + " ");
        while(j < m) System.out.print(B[j++] + " ");
    }
}
