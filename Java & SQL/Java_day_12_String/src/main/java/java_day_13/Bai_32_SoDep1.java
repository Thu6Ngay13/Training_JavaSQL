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
public class Bai_32_SoDep1 {
    private static boolean check(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7')
                return false;
            else sum += (s.charAt(i) - '0');
        if(sum < 1) return false;
        for(int i = 2; i <= Math.sqrt(sum); i++)
            if(sum % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
