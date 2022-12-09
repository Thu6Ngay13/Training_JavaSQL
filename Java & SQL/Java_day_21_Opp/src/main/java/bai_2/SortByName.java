/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2;

import java.util.Comparator;

/**
 *
 * @author wwhac
 */
public class SortByName implements Comparator<SinhVien>{
    @Override
    public int compare(SinhVien t, SinhVien t1) {
        String x[] = t.getTen().split("\\s+");
        String y[] = t1.getTen().split("\\s+");
        String o = x[x.length-1];
        String o1 = y[y.length-1];
        for(int i = 0; i < x.length-1; i++) o += x[i];
        for(int i = 0; i < y.length-1; i++) o1 += y[i];
        return o.compareTo(o1);
    }
}
