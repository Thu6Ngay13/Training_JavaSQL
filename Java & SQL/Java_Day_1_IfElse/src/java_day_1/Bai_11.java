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
public class Bai_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if(a+b <= c || b+c <= a || c+a <= b)System.out.println("INVALID");
        else if(a == c && a == b) System.out.println("1");
        else if(a == b || a == c || b == c) System.out.println("2");
        else if(a*a + b*b == c*c || a*a + c*c == b || b*b + c*c == a*a) System.out.println("3");
        else System.out.println("4");
    }
}
