/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_42_PhepChiaDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        long m = sc.nextLong();
        long x = 0;
        for(int i = 0; i < n.length(); i++){
            x = x*10 + 1l*(n.charAt(i)- '0');
            x %= m;
        }
        System.out.println(x);
    }
}
