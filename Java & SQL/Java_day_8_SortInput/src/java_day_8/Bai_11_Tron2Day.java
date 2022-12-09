/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_11_Tron2Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] B = new int[n];
        int[] C = new int[m];
        for(int i = 0; i < n; i++) B[i] = sc.nextInt();
        for(int i = 0; i < m; i++) C[i] = sc.nextInt();
        int i = 0, j = 0;
        while(i < n && j < m){
            if(B[i] <= C[j]) System.out.print("b" + (1 + i++) + " ");
            else System.out.print("c" + (1 + j++) + " ");
        }
        while(i < n) System.out.print("b" + (1 + i++) + " ");
        while(j < m) System.out.print("c" + (1 + j++) + " ");
    }
}
