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
public class Bai_3_SapXepTheoTongChuSo {
    private static int sum(int n){
        int x = 0;
        while(n != 0){
            x += n%10;
            n /= 10;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            list.add(x);
        }
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer t, Integer t1) {
                if(sum(t) == sum(t1)) return t - t1;
                return sum(t) - sum(t1);
            }
        });
        for(int x:list) System.out.print(x + " ");
    }
}
