/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_36_HoaNhac {
    private static int bS(int n, ArrayList<Integer> list, int x){
        int l = 0, r = n-1;
        int res = -1;
        while(l <= r){
            int m = (l+r)/2;
            if(list.get(m) <= x){
                res = m;
                l = m+1;
            }
            else r = m-1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int[] B = new int[m];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            list.add(x);
        }
        for(int i = 0; i < m; i++) B[i] = sc.nextInt();
        Collections.sort(list);
        for(int i = 0; i < m; i++){
            int x = bS(n, list, B[i]);
            if(x != -1){
                System.out.println(list.get(x));
                list.remove(x);
                n--;
            }
            else System.out.println("-1");
        }
    }
}
