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
public class Bai_24_ViTriDauTienVaCuoiCung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] A = new int[n];
        int f = -1, l = -1;
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
            if(A[i] == x) l = i+1;
            if(A[i] == x && f == -1) f = i+1;
        }
        System.out.println(f + " " + l);
    }
}
