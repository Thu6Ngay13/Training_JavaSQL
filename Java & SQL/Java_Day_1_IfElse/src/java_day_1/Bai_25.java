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
public class Bai_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; n = sc.nextInt();
        int ans = n/100 + n%100/20 + n%100%20/10 + n%100%20%10/5 + n%100%20%10%5;
        System.out.println(ans);
    }
}
