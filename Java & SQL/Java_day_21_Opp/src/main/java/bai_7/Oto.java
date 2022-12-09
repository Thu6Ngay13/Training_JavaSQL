/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_7;

/**
 *
 * @author wwhac
 */
public class Oto extends Vehicle {
    private int maLucXe;

    public Oto() {}

    public Oto(int maLucXe, String maXe, String tenXe, String hangXe, String mauSacXe, long giaBanXe) {
        super(maXe, tenXe, hangXe, mauSacXe, giaBanXe);
        this.maLucXe = maLucXe;
    }

    @Override
    public String getHangXe() {return super.getHangXe();}
    
    @Override
    public String toString() {
        return super.toString() + " " + this.maLucXe + " " + super.getGiaBanXe();
    }
    
}
