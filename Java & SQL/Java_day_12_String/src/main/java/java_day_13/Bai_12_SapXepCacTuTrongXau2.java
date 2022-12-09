/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wwhac
 */
public class Bai_12_SapXepCacTuTrongXau2 {
    private static boolean check(String x){
        int l = 0, r = x.length()-1;
        while(l < r){
            if(x.charAt(l++) != x.charAt(r--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            String x = st.nextToken();
            if(check(x) && !list.contains(x))
                list.add(x);
        }
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                return t.length() - t1.length();
            }
        });
        for(String k:list){
            System.out.print(k + " ");
        }
    }
}
