/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_15;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_24_PhanTuXuatHienOMoiHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();
        for(int j = 0; j < n; j++)
            map.put(A[0][j], 1);
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++)
                if(map.containsKey(A[i][j]) && map.get(A[i][j]) == i){
                    int y = map.get(A[i][j]) + 1;
                    map.put(A[i][j], y);
                }
        }
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        boolean Ok = true;
        for(Map.Entry<Integer, Integer> x:entry){
            if(x.getValue() == n){
                System.out.print(x.getKey() + " ");
                Ok = false;
            }
        }
        if(Ok) System.out.println("NOT FOUND");
    }
}
