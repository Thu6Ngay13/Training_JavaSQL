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
public class Bai_24_DemSoLuongUocSoCuaSoNguyen2 {
    private static long dem(long n){
        long ans = 1; 
        for(int i = 2; i <= Math.sqrt(n); i ++){
            int tmp = 0;
            while(n % i == 0){
                tmp++;
                n /= i;
            }
            if(tmp != 0) ans *= (tmp+1);
        }
        if(n != 1) ans *= 2;
       return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long n; n = sc.nextLong();
        System.out.println(dem(n));
    }
}
