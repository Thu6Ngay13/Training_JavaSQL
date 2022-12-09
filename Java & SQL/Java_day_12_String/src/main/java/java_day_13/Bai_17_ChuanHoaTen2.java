/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wwhac
 */
public class Bai_17_ChuanHoaTen2 {
    private static String chuanHoa_1(String x){
        String tmp = "";
        if(Character.isUpperCase(x.charAt(0))) tmp += x.charAt(0);
        else tmp += (char)(x.charAt(0) - 32);
        for(int i = 1; i < x.length(); i++){
            if(Character.isUpperCase(x.charAt(i)))
                tmp += (char)(x.charAt(i) + 32);
            else 
                tmp += x.charAt(i);
        }
        return tmp;
    }
    private static String chuanHoa_2(String x){
        String tmp = "";
        tmp += x.charAt(0);
        for(int i = 1; i < x.length(); i++)
            tmp += (char)(x.charAt(i) - 32);
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringTokenizer x = new StringTokenizer(a, " ");
        ArrayList list = new ArrayList<>();
        String name1 = "";
        String name2 = "";
        while(x.hasMoreTokens()){
            String tmp = x.nextToken();
            list.add(chuanHoa_1(tmp));
        }
        for(int i = 0; i < list.size()-1; i++){
            if(i > 0){
                name1 += " ";
                name2 += " ";
            }
            name1 += list.get(i);
            name2 += list.get(i);
        }
        String tmp = chuanHoa_2((String)list.get(list.size()-1));
        name1 = name1 + ", " + tmp;
        name2 = tmp + ", " + name2;
        System.out.println(name1);
        System.out.println(name2);
    }
}
