/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_3_PhanTuRiengBiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        for(int x:set)
            System.out.print(x + " ");
    }
}
