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
public class Bai_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int r; r = sc.nextInt();
        double chuVi = (double)2*3.14*r;
        double dienTich = (double)3.14*r*r;
        System.out.printf("%.4f %.4f", chuVi, dienTich);
    }
    
}
