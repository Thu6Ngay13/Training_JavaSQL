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
public class Bai_48_SoMayMan {
    private static boolean lucky(String s){
        if(s.length() == 1) return s.compareTo("9") == 0;
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
            sum += (s.charAt(i)-'0');
        if(lucky(Integer.toString(sum))) return true;
        return  false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(lucky(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
