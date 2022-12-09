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
public class Bai_49_Xoa111 {
    private static void solve(StringBuilder t){
        for(int i = 1; i < t.length()-1; i++){
            while(t.length() >= 3 && i < t.length()-1
                && t.charAt(i-1) == '1' 
                && t.charAt(i) == '1' 
                && t.charAt(i+1) == '1'){
                t = t.delete(i-1, i+2);
            }
        }
        if(t.length() != 0) System.out.println(t);
        else System.out.println("EMPTY");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder t = new StringBuilder(sc.next());
        solve(t);
    }
}
