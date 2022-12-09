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
public class Bai_37_CuaHangBanRon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] A = new Integer[2*n][2];
        for(int i = 0; i < 2*n; i++){
            A[i][0] = sc.nextInt();
            if(i % 2 == 0) A[i][1] = 1;
            else A[i][1] = -1;
        }
        Arrays.sort(A, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] t, Integer[] t1) {
                return t[0] - t1[0];
            }
        });
        int cnt = 0;
        int k = 0;
        for(int i = 0; i < 2*n; i++){
            cnt += A[i][1];
            k = Math.max(cnt, k);
        }
        System.out.println(k);
    }
}
