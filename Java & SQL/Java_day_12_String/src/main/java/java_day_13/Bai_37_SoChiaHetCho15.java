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
public class Bai_37_SoChiaHetCho15 {
    private static boolean check(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
            sum += (s.charAt(i) - '0');
        return (s.charAt(s.length()-1) - '0')%5 == 0 && sum % 3 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
 