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
public class Bai_28_SoLocPhat {
     private static int check(long n){
        while(n != 0){
            long x = n%10;
            n /= 10;
            if(x != 0 && x != 6 && x != 8) return 0;
        }
        return 1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
         System.out.println(check(n));
    }
}
