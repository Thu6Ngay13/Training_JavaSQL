/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_22.KeThua;

/**
 *
 * @author wwhac
 */
public class Student extends Person {
    private String className;
    private double gpa;

    public Student(String className, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.className = className;
        this.gpa = gpa;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Student{" + "className=" + className + ", gpa=" + gpa + '}';
    }
    
}
