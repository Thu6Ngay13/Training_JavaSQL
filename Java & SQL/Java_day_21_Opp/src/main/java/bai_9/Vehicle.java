/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_9;

/**
 *
 * @author wwhac
 */
public class Vehicle {
    private String maXe;
    private String tenXe;
    private String hangXe;
    private String mauSacXe;
    private long giaBanXe;

    public Vehicle() {
    }

    public Vehicle(String maXe, String tenXe, String hangXe, String mauSacXe, long giaBanXe) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.mauSacXe = mauSacXe;
        this.giaBanXe = giaBanXe;
    }

    public long getGiaBanXe() {
        return this.giaBanXe;
    }

    @Override
    public String toString() {
        return this.maXe + " " + this.tenXe + " " + this.hangXe + " " + 
            this.mauSacXe;
    }
}
