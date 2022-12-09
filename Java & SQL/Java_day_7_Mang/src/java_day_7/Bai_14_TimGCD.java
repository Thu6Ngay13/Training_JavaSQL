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
public class Bai_14_TimGCD {
    private static int gcd(int a, int b){
        while(b != 0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        int ans = A[0];
        for(int x:A) ans = gcd(ans, x);
        System.out.println(ans);
    }
}
