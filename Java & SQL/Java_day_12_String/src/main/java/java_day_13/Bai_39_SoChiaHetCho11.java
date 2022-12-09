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
public class Bai_39_SoChiaHetCho11 {
    private static boolean check(String s){
        int sumc = 0;
        int suml = 0;
        for(int i = 0; i < s.length(); i++)
            if(i % 2 == 0) sumc += (s.charAt(i) - '0');
            else suml += (s.charAt(i) - '0');
        return (sumc - suml) % 11 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}

