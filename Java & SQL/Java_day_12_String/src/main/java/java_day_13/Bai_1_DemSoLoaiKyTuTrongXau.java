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
public class Bai_1_DemSoLoaiKyTuTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = 0, y = 0, z = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))) x++;
            else if(Character.isDigit(s.charAt(i))) y++;
            else z++;
        }
        System.out.println(x + " " + y + " " + z);
    }
}
