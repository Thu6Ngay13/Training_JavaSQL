/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_6_DemCapSoNguyenToCungNhau {
    private static boolean check(int a, int b){
        while(b != 0){
            int m = a%b;
            a = b;
            b = m;
        }
        return a == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        int cnt = 0;
        for(int i = 0; i < n-1; i++)
            for(int j = i+1; j < n; j++)
                if(check(A[i], A[j]))
                    cnt++;
        System.out.println(cnt);
    }
}
