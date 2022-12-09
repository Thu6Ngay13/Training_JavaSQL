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
public class Bai_14_VatSuaBo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] A = new Integer[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A, Collections.reverseOrder());
        long cnt = 0;
        for(int i = 0; i < n; i++){
            if(A[i] - i <= 0) break;
            cnt += (A[i]-i);
        }
        System.out.println(cnt);
    }
}
