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
public class Bai_27_SoThuanNghichCo3UocSNT {
    private static boolean thuanNghich(int n){
        int tmp = n;
        int x = 0;
        while(tmp != 0){
            x = x*10 + tmp%10;
            tmp /= 10;
        }
        return x == n;
    }
    private static boolean check(int n ){
        int cnt = 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0){
                cnt++;
                while(n % i == 0){
                    n /= i;
                }
                if(cnt >= 3) return true;
            }
        if(n > 1) cnt++;
        return cnt >= 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b; 
        boolean ok = true;
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a; i <= b; i++)
            if(thuanNghich(i) && check(i)){
                System.out.print(i + " ");
                ok = false;
            }
        if(ok) System.out.println("-1");
    }
}
