/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_7;

/**
 *
 * @author wwhac
 */
public class XeMay extends Vehicle {
    private int tocDoXe;

    public XeMay() {}
    
    public XeMay(int tocDoXe, String maXe, String tenXe, String hangXe, String mauSacXe, long giaBanXe) {
        super(maXe, tenXe, hangXe, mauSacXe, giaBanXe);
        this.tocDoXe = tocDoXe;
    }
    
    @Override
    public String getHangXe() {return super.getHangXe();}
    
    @Override
    public String toString() {
        return super.toString() + " " + this.tocDoXe + " " + super.getGiaBanXe();
    }
}
