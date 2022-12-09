/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_6;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class LyThuyet {
    /*
    + Giai thuat euclid mo rong: ax + by =  gcd(a, b) -> tim x, y
    ax + by =  gcd(a, b)
    -> bx1 + (a%b)y1 = gcd(b, a%b)
    ta co : a%b = a - [a/b]*b
    -> bx1 + ay1 - a/b*by1 = g
    -> ay1 + b(x1 - a/by1) = g
    a*1 + 0*0 = g -> x = 1, y = 0
    x = x1
    y = x1 - a/b*y1
    Vi du 1: 
    18x + 8y = 2;
    8x1 + 2y1 = 2
    2x2 + 0y2 = 2
    Vi du 2:
    18x + 13y = 1 (-5, 7)
    13x1 + 5y1 = 1 (2, -5)
    5x2 + 3y2 = 1 (-1, 2)
    3x3 + 2y3 = 1 (1, -1)
    2x4 + 1y4 = 1 (0, 1) 
    x5 + 0y5 = 1 (1, 0)
    */
    private static int g, x, y;
    private static void extended_gcd(int a, int b){
        if(b == 0){
            x = 1; y = 0;
            g = a;
        }
        else{
            extended_gcd(b, a%b);
            int tmp = x;
            x = y;
            y = tmp - a/b*y;
        }
    }
    
    /*
    * Dieu kien ton tai nghich dao modulo cua a duoi modul m: gcd(a, m) = 1;
    + Nghich dao modulo: (a*b)%m = 1
    -> a*x + m*y = 1
    -> (a*x + m*y)%m = 1
    -> a*x%m == 1
    + Cong thuc khac: dinh ly nho cua fermat: 
    m: phai la so nguyen to
    a^(m-1)%m = 1
    a^-1*a^(m-1)%m = a^-1
    -> a^-1 = powMod(a, m-2, m);
    */
    private static long powMod(long a, long b, long m){
        long res = 1;
        while(b != 0){
            if(b % 2 == 1) res = res*a%m;
            a = (a*a)%m;
            b /= 2;
        }
        return res;
    }
    
    /*
    + Bai toan chia keo sao cho moi nguoi co it nhat 1 cai keo
    candy = 5, child = 3
    * * * * * = 5, co 4 vi tri trong o giua, can dua 2 bar vao 4 vi tri do
    Vi du: * | * | * * * 
    -> Cong thuc: (n-1)C(k-1)
    
    + Bai toan chia keo khong can dieu kien ai cung co keo
    candy = 5, child = 3
    * * * * * | |
    chon 2 vi tri de dua thanh bar vao
    (n+k-1)C(k-1);
    
    +Multinomial Coefficients
    co n phan tu, chia thanh m tap con, sao cho k1 + k2 + ... + km = n phan tu
    n!/(k1!*k2!*...*km!)
    Vi du: so cach tao ra chu moi tu: mississippi
    i: 4
    m: 1
    s: 4
    p: 2
    11!/(4!*4!*1!*2!)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 18;
//        int b = 13;
//        extended_gcd(a, b);
//        System.out.println(x + " " + y);

//        int a = sc.nextInt(), m = sc.nextInt();
//        extended_gcd(a, m);
//        if(g != 1) System.out.println("Khong ton tai nghich dao modulo");
//        else System.out.println((x%m+m)%m);

        int a = sc.nextInt(), m = sc.nextInt();
        System.out.println(powMod(a, m-2, m));
    }  
}
