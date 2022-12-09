/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

/**
 *
 * @author wwhac
 */
public class Bai_46_TimSoDu {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.next();
        int m = 4;
        int x = 0;
        for(int i = 0; i < s.length(); i++){
            x = x*10 + (s.charAt(i)- '0');
            x %= m;
        }
        if(x == 0) System.out.println("4");
        else System.out.println("0");
    }
}
