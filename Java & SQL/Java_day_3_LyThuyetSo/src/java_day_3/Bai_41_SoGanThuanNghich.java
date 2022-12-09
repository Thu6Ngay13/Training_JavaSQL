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
public class Bai_41_SoGanThuanNghich {
    private static void check(long n){
        long cuoi = n%10;
        n /= 10;
        long tmp = n;
        long m = 0;
        int cnt = 0;
        while(n > 9){
            m = m*10 + n%10;
            n /= 10;
            cnt++;
        }
        long dau = n;
        tmp = tmp%((long)Math.pow(10, cnt));
        if(tmp == m && (dau == cuoi*2 || cuoi == dau*2)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        check(n);
    }
}
