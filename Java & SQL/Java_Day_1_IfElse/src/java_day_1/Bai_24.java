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
public class Bai_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int ans = Math.min(a, b) + Math.min(a + b, c);
        if(a < b) ans += Math.min(b, a + c);
        else ans += Math.min(a, b + c);
        System.out.println(ans);
    }
}
