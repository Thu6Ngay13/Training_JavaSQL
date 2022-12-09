/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_3;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_12_PhanTichThuaSoNguyenTo {
    private static void solve(long n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            int cnt = 0;
            while(n != 1 && n % i == 0){
                cnt++;
                n /= i;
            }
            if(cnt != 0){
                System.out.print(i + "^" + cnt);
            }
            if(cnt != 0 && n != 1){
                System.out.print(" * ");
            }
        }
        if(n != 1)
            System.out.println(n + "^" + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; n = sc.nextLong();
        solve(n);
    }
}
