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
public class Bai_16_LietKe {
    private static boolean nTo(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
    private static boolean tNghich(int n){
        int m = 0;
        int tmp = n;
        while(tmp != 0){
            m = m*10 + tmp%10;
            tmp /= 10;
        }
        return m == n;
    }
    private static boolean cPhuong(int n){
        return ((int)(Math.sqrt(n)+0.05))*((int)(Math.sqrt(n)+0.05)) == n;
    }
    private static boolean tongNto(int n){
        int m = 0;
        while(n != 0){
            m = m + n%10;
            n /= 10;
        }
        return nTo(m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        for(int x:A){
            if(nTo(x)) cnt1++;
            if(tNghich(x)) cnt2++;
            if(cPhuong(x)) cnt3++;
            if(tongNto(x)) cnt4++;
        }
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);   
        System.out.println(cnt4);
    }
}
