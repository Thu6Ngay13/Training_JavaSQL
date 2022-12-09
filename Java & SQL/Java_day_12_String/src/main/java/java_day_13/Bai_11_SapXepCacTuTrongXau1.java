/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author wwhac
 */
public class Bai_11_SapXepCacTuTrongXau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> list_1 =  new ArrayList<>();
        ArrayList<String> list_2 =  new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            list_1.add(tmp);
            list_2.add(tmp);
        }
        
        Collections.sort(list_1, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                return t.compareTo(t1);
            }
        });
        
        Collections.sort(list_2, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                if(t.length() == t1.length()) return t.compareTo(t1);
                return t.length() - t1.length();
            }
        });
        
        for(String k:list_1)
            System.out.print(k + " ");
        System.out.println("");
        for(String k:list_2)
            System.out.print(k + " ");
    }
}
