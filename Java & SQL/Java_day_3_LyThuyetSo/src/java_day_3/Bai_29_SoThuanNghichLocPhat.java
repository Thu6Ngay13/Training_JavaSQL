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
public class Bai_29_SoThuanNghichLocPhat {
    private static boolean checkTN(int n){
        int tmp = n;
        int x = 0;
        int sum = 0;
        boolean ok = false;
        while(tmp != 0){
            if(tmp%10 == 6) ok = true;
            sum += tmp%10;
            x = x*10 + tmp%10;
            tmp /= 10;
        }
        return ok && (x == n)  && (sum % 10 == 8);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a; a = sc.nextInt();
        int b; b = sc.nextInt();
        for(int i = a; i <= b; i++)
            if(checkTN(i)) System.out.print(i + " ");
    }
}
