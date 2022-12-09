/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_41_MangConCoTongBangX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int l = 0;
        for(int i = 0; i < n; i++){
            sum += A[i];
            if(sum < x) continue;
            while(l < n && sum > x)
                sum -= A[l++];
            if(sum == x) cnt++;
        }
        System.out.println(cnt);
    }
}
