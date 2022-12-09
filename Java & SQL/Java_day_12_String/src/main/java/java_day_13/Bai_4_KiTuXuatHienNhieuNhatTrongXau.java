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
public class Bai_4_KiTuXuatHienNhieuNhatTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeMap<Character, Integer> map_1 = new TreeMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map_1.containsKey(s.charAt(i))){
                int y = map_1.get(s.charAt(i));
                map_1.put(s.charAt(i), ++y);
            }
            else map_1.put(s.charAt(i), 1);
        }
        Set<Map.Entry<Character, Integer>> entry_1 = map_1.entrySet();
        Character c1 = null;
        Character c2 = null;
        int fmax = 0;
        int fmin = 10000005;
        for(Map.Entry<Character, Integer> x:entry_1){
            if(x.getValue() >= fmax){
                fmax = x.getValue();
                c1 = x.getKey();
            }
            if(x.getValue() <= fmin){
                fmin = x.getValue();
                c2 = x.getKey();
            }
        }
        System.out.println(c1 + " " + fmax);
        System.out.println(c2 + " " + fmin);
    }
}