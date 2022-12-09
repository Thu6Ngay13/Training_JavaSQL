/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_5_SoXuatHienNhieuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(map.containsKey(x)){
                int y = map.get(x);
                map.put(x, ++y);
            }
            else map.put(x, 1);
        }   
        int key = Integer.MIN_VALUE;
        int val = Integer.MIN_VALUE;
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        for(Map.Entry<Integer, Integer> x:entry)
            if(val < x.getValue()){
                val = x.getValue();
                key = x.getKey();
            }
        System.out.println(key + " " + val);
    }   
}
 