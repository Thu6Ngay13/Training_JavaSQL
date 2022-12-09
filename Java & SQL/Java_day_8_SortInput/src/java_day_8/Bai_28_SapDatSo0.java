/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_28_SapDatSo0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] A = new Integer[n];
        ArrayList<Integer> list_1 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x != 0) list_1.add(x);
            else list_2.add(x);
        }
        for(int x:list_1) System.out.print(x + " ");
        for(int x:list_2) System.out.print(x + " ");
    }
}
