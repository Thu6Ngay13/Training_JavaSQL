/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_6_KiTuXuatHienNhieuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i = 0; i < a.length(); i++) map.put(a.charAt(i), 1);
        for(int i = 0; i < b.length(); i++){
            if(map.containsKey(b.charAt(i)) && (map.get(b.charAt(i)) == 1 || map.get(b.charAt(i)) == 3)) 
                map.put(b.charAt(i), 3);
            else 
                map.put(b.charAt(i), 2);
        }
        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        for(Map.Entry<Character, Integer> x:entry)
            if(x.getValue() == 1) System.out.print(x.getKey());
        System.out.println("");
        for(Map.Entry<Character, Integer> x:entry)
            if(x.getValue() == 2) System.out.print(x.getKey());
    }
}
