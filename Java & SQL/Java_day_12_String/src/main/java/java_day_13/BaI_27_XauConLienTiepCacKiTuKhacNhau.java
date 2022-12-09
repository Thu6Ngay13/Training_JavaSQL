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
public class BaI_27_XauConLienTiepCacKiTuKhacNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s += s.charAt(s.length()-1);
        String ans = String.valueOf(s.charAt(0));
        int cnt = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) != s.charAt(i)){
                String a = String.valueOf(s.charAt(i-1));
                int b = 1;
                while(s.charAt(i-1) != s.charAt(i)){
                    a += s.charAt(i);
                    b++;
                    i++;
                }
                if(b > cnt || (b == cnt && a.compareTo(ans) > 0)){
                    ans = a;
                    cnt = b;
                }
            }
        }
        System.out.println(ans);
    }
}
