/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_16_XepLich {
    private int first;
    private int second;

    public Bai_16_XepLich(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bai_16_XepLich[] A = new Bai_16_XepLich[n];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            A[i] = new Bai_16_XepLich(x, y);
        }
        Arrays.sort(A, new Comparator<Bai_16_XepLich>(){
            @Override
            public int compare(Bai_16_XepLich t, Bai_16_XepLich t1) {
                return t.getSecond() - t1.getSecond();
            }
        });
        int count = 1;
        int s = A[0].getSecond();
        for(int i = 1; i < n; i++){
            if(A[i].getFirst() > s){
                count++;
                s = A[i].getSecond();
            }
        }
        System.out.println(count);
    }
}
