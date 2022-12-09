/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_17;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author wwhac
 */
public class Bai_11_GiaTriXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int k = sc.nextInt(); sc.nextLine();
            String s = sc.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    int y = map.get(s.charAt(i)) + 1;
                    map.put(s.charAt(i), y);
                }
                else map.put(s.charAt(i), 1);
            }
            Queue<Integer> q = new PriorityQueue<>();
            Set<Map.Entry<Character, Integer>> entry = map.entrySet();
            for(Map.Entry<Character, Integer> x:entry)
                q.add(x.getValue()*-1);
            while(q.size() != 0 && k-- != 0){
                int top = q.poll() + 1;
                if(top < 0) q.add(top);
            }
            long sum = 0;
            while(q.size() != 0){
                int top = q.poll();
                sum += 1l*top*top;
            }
            System.out.println(sum);
        }
    }
}
