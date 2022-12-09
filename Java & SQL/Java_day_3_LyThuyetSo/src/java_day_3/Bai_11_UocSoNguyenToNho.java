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
public class Bai_11_UocSoNguyenToNho {
    private static int init(int x){
        for(int i = 2; i <= Math.sqrt(x); i++)
            if(x%i == 0) return i;
        return x; 
    }
    private static void solve(int n){
        for(int i = 1; i <= n; i++){
            System.out.println(init(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; n = sc.nextInt();
        solve(n);
    }
}
