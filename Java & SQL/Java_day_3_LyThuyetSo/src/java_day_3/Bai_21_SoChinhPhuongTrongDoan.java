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
public class Bai_21_SoChinhPhuongTrongDoan {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a, b; 
        a = sc.nextLong();
        b = sc.nextLong();
        long A = (long)Math.sqrt(a);
        long B = (long)Math.sqrt(b);
        if(A*A == a) System.out.print(a + " ");
        for(long i = A+1;  i <= B; i++)
            System.out.print((long)i*i + " ");
    }
}
