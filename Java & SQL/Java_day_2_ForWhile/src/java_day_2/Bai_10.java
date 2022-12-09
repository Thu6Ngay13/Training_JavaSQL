/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_2;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0f;
        for(int i = 1; i <= n; i++)
            ans += 1.0/(2*i);
        System.out.printf("%.5f", ans);
    }
}
