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
public class Bai_19_TaoEmailVaTen {
    private static String chuanHoa(String x){
        String tmp = "";
        for(int i = 0; i < x.length(); i++)
            tmp += Character.toLowerCase(x.charAt(i));
        return tmp;
    }
    private static char takeFirst(String x){
        return Character.toLowerCase(x.charAt(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] str = new String[n];
        HashMap<String, Integer> map = new HashMap<>();
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
            if(map.containsKey(mail)){
                int y = map.get(mail) + 1;
                map.put(mail, y);
                System.out.println(mail + y + "@xyz.edu.vn");
            }
            else{
                map.put(mail, 1);
                System.out.println(mail + "@xyz.edu.vn");
            }
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
