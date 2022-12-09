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
public class Bai_33_SoDep2 {
    private static boolean check(String s){
        boolean ok1 = false;
        boolean ok2 = true;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '6'){
                ok1 = true;
                break;
            }
        int l = 0, r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                ok2 = false;
                break;
            }
            l++; r--;
        }
        return ok1 && ok2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
