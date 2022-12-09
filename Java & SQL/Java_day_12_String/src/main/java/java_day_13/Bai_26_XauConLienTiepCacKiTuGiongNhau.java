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
public class Bai_26_XauConLienTiepCacKiTuGiongNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() + "@";
        String a = String.valueOf(s.charAt(0));
        int b = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                String x = String.valueOf(s.charAt(i-1));
                int y = 1;
                while(s.charAt(i-1) == s.charAt(i)){
                    x += s.charAt(i);
                    y++;
                    i++;
                }
                if(y > b || (y == b && x.compareTo(a) > 0)){
                    a = x;
                    b = y;
                }
                i--;
            }
            else if(b == 1 && s.charAt(i-1) > a.charAt(0))
                a = String.valueOf(s.charAt(i-1));
        }
        System.out.println(a);
    }
}
