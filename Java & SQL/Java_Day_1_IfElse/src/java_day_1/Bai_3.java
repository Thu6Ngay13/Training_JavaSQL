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
public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        long tich = (long)a * b;
        System.out.println(tong);
        System.out.println(hieu);
        System.out.println(tich);
        if(b == 0)
            System.out.println("INVALID");
        else   
            System.out.printf("%.4f", 1.0*a / b);

    }
    
}
