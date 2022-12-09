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
public class Bai_13_DoiTienThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        long n = sc.nextLong();
        long cnt = 0;
        for(int i = 9; i >= 0; i--){
            cnt += n/A[i];
            n %= A[i];
            if(n == 0) break;
        }
        System.out.println(cnt);
    }
}
