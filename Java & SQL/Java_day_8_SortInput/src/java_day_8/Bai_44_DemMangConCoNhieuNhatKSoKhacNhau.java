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
public class Bai_44_DemMangConCoNhieuNhatKSoKhacNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        long cnt = 0;
        int l = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(A[i])){
                int y = map.get(A[i]);
                map.put(A[i], y+1);
            }
            else map.put(A[i], 1);
            while(map.size() > k){
                if(map.containsKey(A[l])){
                    int y = map.get(A[l]);
                    if(y > 1) map.put(A[l], y-1);
                    else map.remove(A[l]);
                }
                l++;
            }
            cnt += (i-l+1);
        }
        System.out.println(cnt);
    }
}
