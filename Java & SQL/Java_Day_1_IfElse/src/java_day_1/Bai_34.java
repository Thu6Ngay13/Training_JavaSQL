/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_1;
import java.util.Scanner;
/**
 *
 * @author wwhac
 */
public class Bai_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1, c2, c3, c4, c5;
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        c3 = sc.nextInt();
        c4 = sc.nextInt();
        c5 = sc.nextInt();
        if((c1+c2+c3+c4+c5) % 5 == 0) System.out.println((c1+c2+c3+c4+c5)/5);
        else System.out.println("-1");
    }
}
