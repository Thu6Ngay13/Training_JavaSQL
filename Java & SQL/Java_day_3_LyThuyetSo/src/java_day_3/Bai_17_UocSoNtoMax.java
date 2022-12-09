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
public class Bai_17_UocSoNtoMax {
    private static int solve(int n){
        int ans = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            while(n % i == 0){
                n /= i;
                ans = i;
            }
        }
        if(ans > n) return ans;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t; t = sc.nextInt();
        while(t-- != 0){
            int n; n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}
