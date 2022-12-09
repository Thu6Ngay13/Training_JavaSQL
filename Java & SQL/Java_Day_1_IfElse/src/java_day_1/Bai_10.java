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
public class Bai_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a + b > c && b + c > a && c + a > b) System.out.println("YES");
        else System.out.println("NO");
    }
}
