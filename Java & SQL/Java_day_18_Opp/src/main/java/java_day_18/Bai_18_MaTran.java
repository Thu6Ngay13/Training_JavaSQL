/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_18_MaTran {
    private int n;
    private int m;
    private long[][] a;
    
    public Bai_18_MaTran(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new long[n][m];
    }
    
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < this.n; i++)
            for(int j = 0; j < this.m; j++)
                a[i][j] = sc.nextLong();
    }
    
    public void add(long[][] X){
        for(int i = 0; i < this.n; i++)
            for(int j = 0; j < this.m; j++)
                this.a[i][j] = X[i][j];
    }
    
    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public long[][] getA() {
        return a;
    }
    
    public Bai_18_MaTran mul(Bai_18_MaTran B){
        int p = B.getM();
        long[][] b = B.getA();
        long[][] c = new long[this.n][p];
        for(int i = 0; i < this.n; i++)
            for(int j = 0; j < B.getM(); j++){
                long sum = 0;
                for(int k = 0; k < this.m; k++)
                    sum += (this.a[i][k])*b[k][j];
                c[i][j] = sum;
            }
        Bai_18_MaTran C = new Bai_18_MaTran(this.n, p);
        C.add(c);
        return C;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++)
                str += this.a[i][j] + " ";
            str += "\n";
        }
        return str;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        Bai_18_MaTran a = new Bai_18_MaTran(n, m);
        a.nextMatrix(sc);
        Bai_18_MaTran b = new Bai_18_MaTran(m, p);
        b.nextMatrix(sc);
        Bai_18_MaTran c = a.mul(b);
        System.out.println(c);
    }
}
