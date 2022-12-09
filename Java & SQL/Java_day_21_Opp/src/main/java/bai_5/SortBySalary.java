/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5;

import java.util.Comparator;

/**
 *
 * @author wwhac
 */
public class SortBySalary implements Comparator<GiaoVien> {
    @Override
    public int compare(GiaoVien t, GiaoVien t1) {
        if(t1.getLuong() != t.getLuong())
            return (int) (t1.getLuong() - t.getLuong());
        return t1.getMaGiaoVien().compareTo(t.getMaGiaoVien());
    }
}
