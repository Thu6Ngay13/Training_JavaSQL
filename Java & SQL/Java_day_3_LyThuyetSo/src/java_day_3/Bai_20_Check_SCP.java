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
public class Bai_20_Check_SCP {
    private static boolean checkSCP(long n){
        long x = (long)((double)Math.sqrt(n) + 0.5);
        return x*x == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; n = sc.nextLong();
        if(checkSCP(n)) System.out.println("YES");
        else    System.out.println("NO");
    }
}
