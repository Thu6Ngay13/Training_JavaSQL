/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wwhac
 */
public class Bai_18_TaoEmailVaTen {
    private static String chuanHoa(String x){
        String tmp = "";
        for(int i = 0; i < x.length(); i++)
            if(Character.isUpperCase(x.charAt(i)))
                tmp += (char)(x.charAt(i) + 32);
            else
                tmp += x.charAt(i);
        return tmp;
    }
    private static char takeFirst(String x){
        if(Character.isUpperCase(x.charAt(0)))
            return (char)(x.charAt(0) + 32);
        return x.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) str[i] = sc.nextLine();
        for(int i = 0; i < n; i++){
            StringTokenizer x = new StringTokenizer(str[i], " ");
            ArrayList<String> list = new ArrayList<>();
            while(x.hasMoreTokens()){
                String tmp = x.nextToken();
                list.add(tmp);
            }
            String mail = "";
            mail += chuanHoa(list.get(list.size()-2));
            for(int j = 0; j < (list.size()-2); j++)
                mail += takeFirst(list.get(j));
            mail += "@xyz.edu.vn";
            System.out.println(mail);
            
            String pass = "";
            StringTokenizer y = new StringTokenizer(list.get(list.size()-1), "/");
            while(y.hasMoreTokens()){
                String tmp = y.nextToken();
                if(tmp.length() == 2){
                    if(tmp.charAt(0) != '0') pass += tmp;
                    else pass += tmp.charAt(1);
                }
                else pass += tmp;
            }
            System.out.println(pass);
        }
    }
}
