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
public class Bai_17_IntSet {
    private TreeSet<String> set = new TreeSet<>();

    public Bai_17_IntSet(){}
    
    public Bai_17_IntSet(String x){
        String[] str = x.split("\\s+");
        for(int i = 0; i < str.length; i++)
            this.set.add(str[i]); 
    }

    public void addSet(String x){
        this.set.add(x);
    }
    
    public TreeSet<String> getSet(){
        return set;
    }
    
    public Bai_17_IntSet intersection(Bai_17_IntSet s2){
        Bai_17_IntSet s3 = new Bai_17_IntSet();
        for(String x:this.set)
            if((s2.getSet()).contains(x))
                s3.addSet(x);
        return s3;
    }
    
    public Bai_17_IntSet union(Bai_17_IntSet s2){
        Bai_17_IntSet s3 = s2;
        for(String x:this.set)
            s3.addSet(x);
        return s3;
    }

    @Override
    public String toString(){
        String str = "";
        for(String x:this.set)
            str += x + " ";
        str.trim();
        return str;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bai_17_IntSet s1 = new Bai_17_IntSet(sc.nextLine());
        Bai_17_IntSet s2 = new Bai_17_IntSet(sc.nextLine()); 
        Bai_17_IntSet s4 = s1.intersection(s2);
        Bai_17_IntSet s3 = s1.union(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
