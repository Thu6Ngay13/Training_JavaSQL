/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

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
public class Bai_14_TuXuatHienNhieuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeMap<String, Integer> map = new TreeMap<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            String x = st.nextToken();
            if(map.containsKey(x)){
                int y = map.get(x);
                ++y;
                map.put(x, y);
            }
            else map.put(x, 1);
        }
        String a = null, b = null;
        int fmax = 0, fmin = 10000000;
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for(Map.Entry<String, Integer> x:entry){
            if(x.getValue() >= fmax){
                fmax = x.getValue();
                a = x.getKey();
            }
            if(x.getValue() <= fmin){
                fmin = x.getValue();
                b = x.getKey();
            }
        }
        System.out.println(a + " " + fmax);
        System.out.println(b + " " + fmin);
    }
}
