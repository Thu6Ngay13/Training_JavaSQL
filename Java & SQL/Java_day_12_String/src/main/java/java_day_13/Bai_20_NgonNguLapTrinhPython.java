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
public class Bai_20_NgonNguLapTrinhPython {
    private static boolean check(String a){
        String c = "python";
        int k = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == c.charAt(k)) k++;
            if(k == 6) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(check(a)) System.out.println("YES");
        else System.out.println("NO");
    }
}
