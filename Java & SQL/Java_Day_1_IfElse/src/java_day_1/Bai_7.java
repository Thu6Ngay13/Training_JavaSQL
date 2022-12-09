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
public class Bai_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println((a/b)*b);
            System.out.println((a/b+1)*b);
        } 
        else {
            System.out.println(0);
            System.out.println(b);
        }
    }
}
