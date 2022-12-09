/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_23_SapXepTheoTanSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            
            if(map.containsKey(x)){
                int y = map.get(x);
                map.put(x, ++y);
            }
            else {
                map.put(x, 1);
                A.add(x);
                B.add(x);
            }
        }
        
        Collections.sort(A, new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                if(map.get(t) == map.get(t1))  return t - t1;
                return map.get(t1) - map.get(t);            }
        });
        for(int x:A){
            int y = map.get(x);
            for(int i = 0; i < y; i++)
                System.out.print(x + " ");
        }
        System.out.println("");
        
        Collections.sort(B, new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                return map.get(t1) - map.get(t);            }
        });
        for(int x:B){
            int y = map.get(x);
            for(int i = 0; i < y; i++)
                System.out.print(x + " ");
        }
    }
}
