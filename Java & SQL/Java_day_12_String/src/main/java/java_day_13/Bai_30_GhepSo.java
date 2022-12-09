/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_30_GhepSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); s += "**";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                String x = "";
                while(Character.isDigit(s.charAt(i))){
                    x += s.charAt(i);
                    i++;
                }
                while(x.length() != 0 && x.charAt(0) == '0') x = x.replaceFirst("0", "");
                if(x.length() != 0) list.add(x);
                else list.add("0");
            }
        }
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String t, String t1){
                String ab = t + t1;
                String ba = t1 + t;
                return ba.compareTo(ab);
            }
        });
        for(String x:list)
            System.out.print(x);
    }
}
