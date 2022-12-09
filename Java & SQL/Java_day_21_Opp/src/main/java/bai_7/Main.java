/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<XeMay> list1 = new ArrayList<>();
        ArrayList<Oto> list2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maXe = sc.nextLine();
            String tenXe = sc.nextLine();
            String hangXe = sc.nextLine();
            String mauSacXe = sc.nextLine();
            int tocDoXe = sc.nextInt();
            Long giaBanXe = sc.nextLong(); 
            sc.nextLine();
            if(maXe.substring(0, 2).equals("XM"))
                list1.add(new XeMay(tocDoXe, maXe, tenXe, hangXe, mauSacXe, giaBanXe));
            else
                list2.add(new Oto(tocDoXe, maXe, tenXe, hangXe, mauSacXe, giaBanXe));
        }
        String hangXe = sc.nextLine();
        System.out.println("DANH SACH XE HANG " + hangXe + " :");
        for(Oto x:list2)
            if(x.getHangXe().equals(hangXe))
                System.out.println(x);
        for(XeMay x:list1)
            if(x.getHangXe().equals(hangXe))
                System.out.println(x);
    }
}
