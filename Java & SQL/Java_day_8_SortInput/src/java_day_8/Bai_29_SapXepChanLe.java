/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_29_SapXepChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
      
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            list.add(x);
        }
        Collections.sort(list);
        if(n%2 != 0){
            for(int i = 0; i < n/2; i++)
                System.out.print(list.get(i) + " " + list.get(i+n/2+1) + " ");
            System.out.print(list.get(n/2));
        }
        else{
            for(int i = 0; i < n/2; i++)
                System.out.print(list.get(i) + " " + list.get(i+n/2) + " ");
        }
    }
}
