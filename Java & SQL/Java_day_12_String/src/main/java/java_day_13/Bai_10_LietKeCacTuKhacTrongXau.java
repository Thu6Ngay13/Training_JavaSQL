/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author wwhac
 */
public class Bai_10_LietKeCacTuKhacTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = "";
        TreeSet<String> set_1 = new TreeSet<>();
        LinkedHashSet<String> set_2 = new LinkedHashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))) x += s.charAt(i);
            else x += " ";
        }
        StringTokenizer st = new StringTokenizer(x, " ");
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            set_1.add(tmp);
            set_2.add(tmp);
        }
        for(String y:set_1)
            System.out.print(y + " ");
        System.out.println("");
        for(String y:set_2)
            System.out.print(y + " ");
    }
}
