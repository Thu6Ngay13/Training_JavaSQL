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
public class Bai_29_TongNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i =  0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        long x = 0, y = 0;
        for(int i = 0; i < n; i++){
            if(i%2 == 0) y = y*10 + A[i];
            else x = x*10 + A[i];
        }
        System.out.println(x+y);
    }
}
