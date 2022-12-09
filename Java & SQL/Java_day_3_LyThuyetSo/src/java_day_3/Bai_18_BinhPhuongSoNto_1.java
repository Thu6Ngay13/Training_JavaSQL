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
public class Bai_18_BinhPhuongSoNto_1 {
    private static boolean check(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i ==  0){
                int mu = 0;
                while(n%i == 0){
                    mu++;
                    n /= i;
                }
                if(mu >= 2) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();     
        for(int i = a; i <= b; i++)
            if(check(i)) System.out.print(i + " ");
    }
}
