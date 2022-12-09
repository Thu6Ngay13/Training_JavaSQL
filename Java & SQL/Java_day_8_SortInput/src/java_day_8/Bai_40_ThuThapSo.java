/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_40_ThuThapSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][2];
        for(int i = 0; i < n; i++){
            A[i][0] = sc.nextInt();
            A[i][1] = i;
        }
        Arrays.sort(A, new Comparator<int[]>(){
            @Override
            public int compare(int[] t, int[] t1) {
                return t[0] - t1[0];
            }
        });
        int cnt = 1;
        for(int i = 1; i < n; i++){
            if(A[i-1][1] > A[i][1]) cnt++;
        }
        System.out.println(cnt);
    }
}
