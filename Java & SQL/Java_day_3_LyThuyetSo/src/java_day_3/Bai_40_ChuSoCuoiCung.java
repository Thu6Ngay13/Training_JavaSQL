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
public class Bai_40_ChuSoCuoiCung {
    private static void solve(long n){
        if(n == 0) System.out.println("1");
        else{
            if(n%4 == 1) System.out.println((2*3*3)%10);
            else if(n % 4 == 2) System.out.println((4*9*9)%10);
            else if(n % 4 == 3) System.out.println((8*7*7)%10);
            else System.out.println(6);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        solve(n);
    }
}
