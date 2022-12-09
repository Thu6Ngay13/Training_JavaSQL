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
public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C; C = sc.nextInt();
        double F = (double)(C * 1.0*9 / 5) + 32;
        System.out.printf("%.2f", F);
        
    }
}
