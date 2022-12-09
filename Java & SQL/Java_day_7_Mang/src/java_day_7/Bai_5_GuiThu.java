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
public class Bai_5_GuiThu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        System.out.println((A[1] - A[0]) + " " + (A[n-1] - A[0]));
        for(int i = 1; i < n-1; i++)
            System.out.println(Math.min(A[i]-A[i-1], A[i+1]-A[i]) + " " + Math.max(A[i]-A[0], A[n-1]-A[i]));
        System.out.println((A[n-1] - A[n-2]) + " " + (A[n-1] - A[0]));
    }
}
