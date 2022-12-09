/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_1_2_TangDanGiamDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] A = new Integer[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        for(int x:A) System.out.print(x + " ");
        System.out.println("");
        Arrays.sort(A, Collections.reverseOrder());
        for(int x:A) System.out.print(x + " ");
    }
}
