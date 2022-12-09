/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_35_XepTre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        int l = 0, r = n-1;
        int cnt = 0;
        while(l < r){
            if(A[l] + A[r] <= x){
                cnt++;
                l++; r--;
            }
            else{
                cnt++;
                r--;
            }
        }
        if(l == r) cnt++;
        System.out.println(cnt);
    }
}
