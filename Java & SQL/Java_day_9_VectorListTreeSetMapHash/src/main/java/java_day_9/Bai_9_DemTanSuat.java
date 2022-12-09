/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_9_DemTanSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<Integer,Integer> map_1 = new LinkedHashMap<>();
        TreeMap<Integer,Integer> map_2 = new TreeMap<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(map_2.containsKey(x)){
                int y = map_2.get(x);
                map_2.put(x, ++y);
            }
            else{
                map_2.put(x, 1);
                map_1.put(x, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entry_2 = map_2.entrySet();
        for(Map.Entry<Integer, Integer> x:entry_2){
            map_1.put(x.getKey(), x.getValue());
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println("");
        Set<Map.Entry<Integer, Integer>> entry_1 = map_1.entrySet();
        for(Map.Entry<Integer, Integer> x:entry_1)
            System.out.println(x.getKey() + " " + x.getValue());
        
    }
}
