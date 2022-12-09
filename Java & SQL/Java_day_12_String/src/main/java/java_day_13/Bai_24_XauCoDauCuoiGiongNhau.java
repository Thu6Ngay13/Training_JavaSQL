/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author wwhac
 */
public class Bai_24_XauCoDauCuoiGiongNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map  = new HashMap<>();
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int y = map.get(s.charAt(i));
                map.put(s.charAt(i), ++y);
            }
            else map.put(s.charAt(i), 1);
        }
        long sum = s.length();
        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        for(Map.Entry<Character, Integer> x:entry){
            if(x.getValue() > 1) sum += 1l*x.getValue()*(x.getValue()-1)/2;
        }
        System.out.println(sum);
    }
}
