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
public class Bai_28_SoLonhatXuatHienTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); s += "*";
        String ans = "0";
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)) && s.charAt(i) != '0'){
                String x = "";
                while(Character.isDigit(s.charAt(i))){
                    x += s.charAt(i);
                    i++;
                }
                if(x.length() > ans.length()) ans = x;
                else if(x.length() == ans.length() && x.compareTo(ans) > 0) ans = x;
            }
        }
        System.out.println(ans);
    }
}
