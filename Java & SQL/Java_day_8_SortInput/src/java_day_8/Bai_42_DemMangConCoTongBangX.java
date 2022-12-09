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
public class Bai_42_DemMangConCoTongBangX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        HashMap<Long, Integer> map = new HashMap<>();
        long cnt = 0;
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += A[i];
            if(sum == x) cnt++;
            if(map.containsKey(sum-x)) cnt += map.get(sum-x);
            if(map.containsKey(sum)){
                int y = map.get(sum);
                map.put(sum, ++y);
            }
            else map.put(sum, 1);
        }
        System.out.println(cnt);
    }
}
