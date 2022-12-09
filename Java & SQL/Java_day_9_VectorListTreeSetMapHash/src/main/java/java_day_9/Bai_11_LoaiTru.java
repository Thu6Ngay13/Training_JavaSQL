/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_11_LoaiTru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            map.put(x, 1);
        }
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        for(int x:set){
            if(map.containsKey(x)){
                int y = map.get(x);
                map.put(x, ++y);
            }
        }
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        for(Map.Entry<Integer, Integer> x:entry)
            if(x.getValue() == 1)System.out.print(x.getKey() + " ");
    }
}
