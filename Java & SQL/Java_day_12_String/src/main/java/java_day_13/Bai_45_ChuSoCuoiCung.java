/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;
import java.util.Scanner;
/**
 *
 * @author wwhac
 */
public class Bai_45_ChuSoCuoiCung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = 4;
        int x = 0;
        for(int i = 0; i < s.length(); i++){
            x = x*10 + (s.charAt(i)- '0');
            x %= m;
        }
        if(x == 1) System.out.println("8");
        else if(x == 2) System.out.println("4");
        else if(x == 3) System.out.println("2");
        else System.out.println("6");
    }
}
