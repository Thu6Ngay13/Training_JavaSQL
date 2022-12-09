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
public class Bai_25_CheckInSanBay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] A = new Integer[n][2];
        for(int i = 0; i < n; i++){
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }
        Arrays.sort(A, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] t, Integer[] t1) {
                return t[0] - t1[0];
            }
        });
        long as = 0;
        for(int i = 0; i < n; i++){
            as = Math.max(as, A[i][0]) + A[i][1];
        }
        System.out.println(as);
    }
}
