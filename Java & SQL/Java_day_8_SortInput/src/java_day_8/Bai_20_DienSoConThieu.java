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
public class Bai_20_DienSoConThieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        Arrays.sort(A);
        int cnt = 0;
        for(int i = 1; i < n; i++)
            if(A[i]-A[i-1] > 1) cnt += (A[i] - A[i-1] - 1);
        System.out.println(cnt);
    }
}
