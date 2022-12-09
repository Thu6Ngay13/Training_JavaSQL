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
public class Bai_33_LietKeChuSNT {
    private static int[] nB = new int[11];
    private static void lKe(long n){
        long x = 0;
        while(n != 0){
            nB[(int)(n%10)]++;
            x = (long)x*10 +  n%10;
            n /= 10;
        }
        for(int i = 2; i <= 7; i++)
            if(nB[i]  != 0 && (i == 2 || i == 5 || i == 7 || i == 3)) System.out.println(i + " " + nB[i]);
        System.out.println("");
        while(x != 0){
            if(nB[(int)(x%10)] != 0 && ((int)(x%10) == 2 || (int)(x%10) == 5 || (int)(x%10) == 7 || (int)(x%10) == 3)) System.out.println(x%10 + " " + nB[(int)(x%10)]);
            nB[(int)(x%10)] = 0;
            x /= 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        lKe(n);
    }
}
