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
public class Bai_31_TOngChuSoCuaSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
        for(int i = 0; i < s.length(); i++)
            ans += (s.charAt(i) - '0');
        System.out.println(ans);
    }
}
