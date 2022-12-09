/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_43_MangConChiaHetChoK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        long cnt = 0;
        for(int i = 0; i < n; i++){
            sum += A[i];
            long c = (sum%n + n)%n;
            if(sum % n == 0) cnt++;
            if(map.containsKey(c)){
                int y = map.get(c);
                cnt += y;
                map.put(c, ++y);
            }
            else map.put(c, 1);
        }
        System.out.println(cnt);
    }
}
