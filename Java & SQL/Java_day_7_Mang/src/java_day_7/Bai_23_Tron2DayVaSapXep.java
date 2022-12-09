/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * 
 * @author wwhac
 */
public class Bai_23_Tron2DayVaSapXep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        Integer[] B = new Integer[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < n; i++) B[i] = sc.nextInt();
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        for(int i = 0; i < n; i++){
          System.out.print(A[i] + " ");
            System.out.print(B[i] + " ");  
        }
    }
}
