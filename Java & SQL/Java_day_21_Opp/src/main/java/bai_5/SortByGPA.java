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
public class SortByGPA implements Comparator<SinhVien>{
    @Override
    public int compare(SinhVien t, SinhVien t1) {
        if(t.getGpa() > t1.getGpa()) return -1;
        if(t.getGpa() < t1.getGpa()) return 1;
        return t1.getMaSinhVien().compareTo(t.getMaSinhVien());
    }
}
