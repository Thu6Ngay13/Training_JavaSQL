/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_3;
import java.util.Scanner;

public class Bai_26_SoHoanHao {
    /*
    p la SNT va (2^p - 1) la SNT thi SHH(2^(p-1))(2^p-1) la so HH
    */
    private static boolean check(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
    private static boolean hoanHao(long n){
        for(int i = 2; i <= 32; i++){
            if(check(i) && check((long)Math.pow(2, i)-1)){
                long tmp = (long)Math.pow(2, i) - 1;
                long hh = (long)Math.pow(2, i-1)*tmp;
                if(hh == n) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(hoanHao(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
