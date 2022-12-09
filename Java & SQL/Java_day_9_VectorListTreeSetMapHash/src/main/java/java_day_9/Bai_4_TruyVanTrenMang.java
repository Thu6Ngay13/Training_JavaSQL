/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_4_TruyVanTrenMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(map.containsKey(x)){
                int y = map.get(x);
                map.put(x, ++y);
            }
            else map.put(x, 1);
        }
        int q = sc.nextInt();
        while(q-- != 0){
            int t = sc.nextInt();
            int x = sc.nextInt();
            if(t == 1){
                if(map.containsKey(x)){
                    int y = map.get(x);
                    map.put(x, ++y);
                }
                else map.put(x, 1);
            }
            else if(t == 2){
                if(map.containsKey(x)){
                    int y = map.get(x);
                    if(y == 1) map.remove(x);
                    else map.put(x, --y);
                }
            }
            else{
                if(map.containsKey(x)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
