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
public class Bai_41_SoNhiPhanChiaHetCho2muK {
    private static boolean check(String n, int k){
        for(int i = 0; i < k; i++)
            if(n.charAt(n.length()-1-i) == '1')
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        if(check(n, k)) System.out.println("YES");
        else System.out.println("NO");
    }
}
