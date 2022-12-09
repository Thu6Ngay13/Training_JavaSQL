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
public class Bai_8_XauPangram1 {
    private static boolean check(String s){
        int[] A = new int[256];
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))) A[s.charAt(i)-32]++;
            else A[s.charAt(i)]++;
        }
        for(int i = (int)'A'; i <= (int)'Z'; i++)
            if(A[i] == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
