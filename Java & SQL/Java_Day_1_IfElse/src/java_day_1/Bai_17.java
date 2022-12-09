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
public class Bai_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), 
                    b = sc.nextDouble(), 
                    c = sc.nextDouble(), 
                    d = sc.nextDouble();
        double tb = (a + b + c * 2 + d * 3) / 7;
        if (tb >= 8.0) {
            System.out.println("GIOI");
        } else if (tb >= 6.5) {
            System.out.println("KHA");
        } else if (tb >= 5.0) {
            System.out.println("TRUNG BINH");
        } else {
            System.out.println("YEU");
        }
    }
}
