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
public class Bai_29_TinhTongCacSoXuatHienTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); s += "*";
        long ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)) && s.charAt(i) != '0'){
                String x = "";
                while(Character.isDigit(s.charAt(i))){
                    x += s.charAt(i);
                    i++;
                }
                long tmp = 0;
                for(int j = 0; j < x.length(); j++) 
                    tmp = tmp*10 + (x.charAt(j) - '0');
                ans += tmp;
            }
        }
        System.out.println(ans);
    }
}
