/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class BaI_1_1_Comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] A = new String[n];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            A[i] = sc.next();
            if(map.containsKey(A[i])){
                int y = map.get(A[i]);
                map.put(A[i], ++y);
            }
            else map.put(A[i], 1);
        }
        Arrays.sort(A, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                return t.compareTo(t1);
            }
        });
        for(int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println("");
        for(int i = 0; i < n; i++)
            System.out.print(A[n-1-i] + " ");
        System.out.println("");
        Arrays.sort(A, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                if(t.length() == t1.length())
                    return t.compareTo(t1);
                return t.length() - t1.length();
            }
        });
        for(int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println("");
        Arrays.sort(A, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                if(map.get(t) == map.get(t1))
                    return t.compareTo(t1);
                return map.get(t1) - map.get(t);
            }
        });
        for(int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
            
        }
    }
}
