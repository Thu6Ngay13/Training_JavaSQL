/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_1;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, u1, d;
        n = sc.nextInt();
        u1 = sc.nextInt();
        d = sc.nextInt();
        long ans = (long)(n*(2*u1 + (long)(n-1)*d))/2;
        System.out.println(ans);
    }
}
