/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author wwhac
 */
public class Bai_23_GhepXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) arr[i] = sc.next();
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                String ab = t + t1;
                String ba = t1 + t;
                return ba.compareTo(ab);
                /*kiem tra xau ab co thu tu tu dien lon
                hon xau ba hay khong neu co thi a dung truoc b
                */
            }
        });
        for(int i = 0; i < n; i++)
            System.out.print(arr[i]);
    }
}
