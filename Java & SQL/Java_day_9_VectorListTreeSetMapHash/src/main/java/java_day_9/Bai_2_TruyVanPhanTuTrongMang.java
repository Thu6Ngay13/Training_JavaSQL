/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author wwhac
 */
public class Bai_2_TruyVanPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        int q = sc.nextInt();
        while(q-- != 0){
            int x = sc.nextInt();
            if(set.contains(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
