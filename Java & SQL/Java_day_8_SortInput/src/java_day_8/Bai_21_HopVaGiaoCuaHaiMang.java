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
public class Bai_21_HopVaGiaoCuaHaiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < m; i++) B[i] = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int x:A) map.put(x, 1);
        for(int x:B){
            if(map.containsKey(x)){
                int y = map.get(x);
                map.put(x, ++y);
            }
            else map.put(x, 1);
        }
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        for(Map.Entry<Integer, Integer> x:entry)
            if(x.getValue() == 2) System.out.print(x.getKey() + " ");
        System.out.println("");
        for(Map.Entry<Integer, Integer> x:entry)
            System.out.print(x.getKey() + " ");
    }
}
