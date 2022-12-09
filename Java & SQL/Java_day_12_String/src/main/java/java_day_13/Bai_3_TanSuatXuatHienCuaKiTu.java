/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_3_TanSuatXuatHienCuaKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedHashMap<Character, Integer> map_1 = new LinkedHashMap<>();
        TreeMap<Character, Integer> map_2 = new TreeMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map_1.containsKey(s.charAt(i))){
                int y = map_1.get(s.charAt(i));
                y++;
                map_1.put(s.charAt(i), y);
                map_2.put(s.charAt(i), y);
            }
            else{
                map_1.put(s.charAt(i), 1);
                map_2.put(s.charAt(i), 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entry_1 = map_1.entrySet();
        Set<Map.Entry<Character, Integer>> entry_2 = map_2.entrySet();
        for(Map.Entry<Character, Integer> x:entry_2)
            System.out.println(x.getKey() + " " + x.getValue());
        System.out.println("");
        for(Map.Entry<Character, Integer> x:entry_1)
            System.out.println(x.getKey() + " " + x.getValue());
                
    }
}
