/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_4_KhoangCachNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            list.add(x);
        }
        Collections.sort(list);
        int as = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++)
            as = Math.min(as, list.get(i) - list.get(i-1));
        System.out.println(as);
    }
}
