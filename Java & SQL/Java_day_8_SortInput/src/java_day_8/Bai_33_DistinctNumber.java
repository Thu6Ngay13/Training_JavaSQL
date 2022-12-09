/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_33_DistinctNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        System.out.println(set.size());
    }
}
