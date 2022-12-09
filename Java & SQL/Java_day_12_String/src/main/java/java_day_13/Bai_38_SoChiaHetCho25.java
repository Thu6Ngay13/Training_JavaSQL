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
public class Bai_38_SoChiaHetCho25 {
    private static boolean check(String s){
        if(s.length() > 1){
            return ((s.charAt(s.length()-2) - '0')*10 
            + (s.charAt(s.length()-1) - '0'))
            %25 == 0;
        }
        return (s.charAt(s.length()-1) - '0') % 25 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
