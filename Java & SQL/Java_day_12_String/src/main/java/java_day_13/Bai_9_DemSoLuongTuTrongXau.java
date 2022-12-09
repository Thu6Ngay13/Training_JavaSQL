/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wwhac
 */
public class Bai_9_DemSoLuongTuTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = "";
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))) x += s.charAt(i);
            else x += " ";
        }
        StringTokenizer st = new StringTokenizer(x, " ");
        while(st.hasMoreTokens()){
            set.add(st.nextToken());
        }
        System.out.println(set.size());
    }
}
