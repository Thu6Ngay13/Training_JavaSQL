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
public class Bai_34_SoDep3 {
    private static boolean check(String s){
        boolean ok1 = false;
        boolean ok2 = false;
        for(int i = 1; i < s.length(); i++)
            if(s.charAt(i-1) > s.charAt(i))
                ok1 = true;
        for(int i = 1; i < s.length(); i++)
            if(s.charAt(i-1) < s.charAt(i))
                ok2 = true;
        return (ok1 != ok2) || (ok1 == false && ok2 == false);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
