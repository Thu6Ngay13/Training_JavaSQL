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
public class Bai_4_DieHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc. nextInt();
         int[] A = new int[n];
         for(int i = 0; i < n; i++) A[i] = sc.nextInt();
         int cnt = 0;
         for(int i = 0; i < n && cnt >= 0; i++){
             if(A[i] == 25) cnt++;
             else if(A[i] == 50) cnt--;
             else cnt -= 3;
         }
         if(cnt < 0) System.out.println("NO");
         else System.out.println("YES");
    }
}
