/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author wwhac
 */
public class Bai_16_IntSet {
    private TreeSet<Integer> s1 = new TreeSet<>();

    public Bai_16_IntSet(){}
    
    public Bai_16_IntSet(int A[]){
        for(int i = 0; i < A.length; i++)
            this.s1.add(A[i]);
    }

    public void addSet(int x){
        this.s1.add(x);
    }
    
    public TreeSet<Integer> getSet(){
        return s1;
    }
    
    public Bai_16_IntSet union(Bai_16_IntSet s2){
        Bai_16_IntSet s3 = s2;
        for(int x:this.s1)
            s3.addSet(x);
        return s3;
    }

    @Override
    public String toString(){
        String str = "";
        for(int x:this.s1)
            str += x + " ";
        str.trim();
        return str;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = 0; i < m; i++) B[i] = sc.nextInt();
        Bai_16_IntSet s1 = new Bai_16_IntSet(A);
        Bai_16_IntSet s2 = new Bai_16_IntSet(B);
        Bai_16_IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
