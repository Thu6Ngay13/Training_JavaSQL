/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_13_TanSuatCacTuXuatHienTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeMap<String, Integer> map_1 = new TreeMap<>();
        LinkedHashMap<String, Integer> map_2 = new LinkedHashMap<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            String x = st.nextToken();
            if(map_1.containsKey(x)){
                int y = map_1.get(x);
                ++y;
                map_1.put(x, y);
                map_2.put(x, y);
            }
            else{
                map_1.put(x, 1);
                map_2.put(x, 1);
            }
        }
        Set<Map.Entry<String, Integer>> entry_1 = map_1.entrySet();
        Set<Map.Entry<String, Integer>> entry_2 = map_2.entrySet();
        for(Map.Entry<String, Integer> x:entry_1)
            System.out.println(x.getKey() + " " + x.getValue());
        System.out.println("");
        for(Map.Entry<String, Integer> x:entry_2)
            System.out.println(x.getKey() + " " + x.getValue());
        
    }
}
