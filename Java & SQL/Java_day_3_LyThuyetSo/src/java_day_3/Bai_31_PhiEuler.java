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
public class Bai_31_PhiEuler {    
    private static long euler(long n){
        long ans = 1;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                long cnt = 0;
                 ans = (long)(ans*(i-1));
                while(n % i == 0){
                    n/= i;
                    cnt++;
                }
                ans = (long)ans*(long)Math.pow(i, cnt-1);
            }
        }
         if(n > 1) ans = (long)(ans*(n-1));
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong(); 
        System.out.println(euler(n));
    }
}
