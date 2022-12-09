/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author wwhac
 */
public class Bai_12_DemTanSuatSoNguyenTo {
    private static boolean nTo(int x){
        if(x < 2) return false;
        for(int i = 2; i <= Math.sqrt(x); i++)
            if(x % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(nTo(x)){
                if(map.containsKey(x)){
                    int y = map.get(x);
                    map.put(x, ++y);
                }
                else map.put(x, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        for(Map.Entry<Integer, Integer> x:entry){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
