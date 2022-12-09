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
public class Bai_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        c = sc.nextLine().charAt(0);
        if(Character.isUpperCase(c)) System.out.println(Character.toLowerCase(c));
        else System.out.println(Character.toUpperCase(c));
    }
}
