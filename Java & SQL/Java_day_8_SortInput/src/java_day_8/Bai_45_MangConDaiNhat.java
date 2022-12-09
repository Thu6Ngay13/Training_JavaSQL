/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_45_MangConDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int k = 0;
        for(int i = 0; i < n; i++){
            while(map.containsKey(A[i])){
                map.remove(A[l]);
                l++;
            }
            map.put(A[i], 1);
            k = Math.max(map.size(), k);
        }
        System.out.println(k);
    }
}
