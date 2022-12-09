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
public class Bai_12_KhieuVu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < m; i++) B[i] = sc.nextInt();
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;
        int cnt = 0;
        while(i < n && j < m){
            if(A[i] > B[j]){
                cnt++;
                i++;
                j++;
            }
            else i++;
        }
        System.out.println(cnt);
    }
}
