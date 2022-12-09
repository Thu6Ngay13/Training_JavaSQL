/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_8;

import java.util.Comparator;

/**
 *
 * @author wwhac
 */
public class SortByPriceThenById_Oto implements Comparator<Oto>{
    @Override
    public int compare(Oto t, Oto t1) {
        if(t.getGiaBanXe() != t1.getGiaBanXe()) return (int) (t1.getGiaBanXe() - t.getGiaBanXe());
        return t.getMaXe().compareTo(t1.getMaXe());
    }
}
