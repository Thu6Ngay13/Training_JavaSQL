/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_21_TapTuChungCua2Xau {
    private static String lower(String s){
        String tmp = "";
        for(int i = 0; i < s.length(); i++)
            tmp += Character.toLowerCase(s.charAt(i));
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        TreeMap<String, Integer> map = new TreeMap<>();
        StringTokenizer a = new StringTokenizer(s, " ");
        StringTokenizer b = new StringTokenizer(t, " ");
        while(a.hasMoreTokens()){
            String tmp = lower(a.nextToken());
            map.put(tmp, 1);
        }
        while(b.hasMoreTokens()){
            String tmp = lower(b.nextToken());
            if(map.containsKey(tmp) && (map.get(tmp) == 1 || map.get(tmp) == 3))
                map.put(tmp, 3);
            else 
                map.put(tmp, 2);
        }
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for(Map.Entry<String, Integer> x:entry){
            if(x.getValue() == 3) 
                System.out.print(x.getKey() + " ");
        }
    }
}

