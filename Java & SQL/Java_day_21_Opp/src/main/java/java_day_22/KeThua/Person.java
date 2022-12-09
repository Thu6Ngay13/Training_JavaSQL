/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_22.KeThua;

/**
 *
 * @author wwhac
 */
public class Person {
    private String ten;
    private String ngaySinh;
    private String diaChi;

    public Person() {}

    public Person(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + '}';
    }
    
}
