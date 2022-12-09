/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_38_LienHoanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] A = new Integer[n][2];
        for(int i = 0; i < n; i++){
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }
        Arrays.sort(A, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] t, Integer[] t1) {
                if(t[1] == t1[1]) return t[0] - t1[0];
                return t[1] - t1[1];
            }
        });
        int cnt = 1;
        int x = A[0][1];
        for(int i = 1; i < n; i++)
            if(A[i][0] >= x){
                x = A[i][1];
                cnt++;
            }
        System.out.println(cnt);
    }
}
