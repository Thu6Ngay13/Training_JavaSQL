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
public class Bai_2_InHoaThuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "", b = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                if(Character.isUpperCase(s.charAt(i))){
                    a += s.charAt(i);
                    b += (char)(s.charAt(i) + 32);
                }
                else{
                    b += s.charAt(i);
                    a += (char)(s.charAt(i) - 32);
                }
            }
            else{
                a += s.charAt(i);
                b += s.charAt(i);
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
