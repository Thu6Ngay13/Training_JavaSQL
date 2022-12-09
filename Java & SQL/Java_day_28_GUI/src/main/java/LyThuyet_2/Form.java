/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_2;

import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.*;

/**
 *
 * @author wwhac
 */
public class Form extends JFrame{
    private JLabel lbluser, lblpass;
    private JTextField jtfuser;
    private JPasswordField jpfpass;
    private JButton btn, btn1, btn2;

    public Form() {}  

    public Form(JLabel lbluser, JLabel lblpass, JTextField jtfuser, JPasswordField jpfpass, JButton btn, JButton btn1, JButton btn2) {
        this.lbluser = lbluser;
        this.lblpass = lblpass;
        this.jtfuser = jtfuser;
        this.jpfpass = jpfpass;
        this.btn = btn;
        this.btn1 = btn1;
        this.btn2 = btn2;
    }
    
    public JLabel getLbluser() {
        return lbluser;
    }

    public void setLbluser(JLabel lbluser) {
        this.lbluser = lbluser;
    }

    public JLabel getLblpass() {
        return lblpass;
    }

    public void setLblpass(JLabel lblpass) {
        this.lblpass = lblpass;
    }

    public JTextField getJtfuser() {
        return jtfuser;
    }

    public void setJtfuser(JTextField jtfuser) {
        this.jtfuser = jtfuser;
    }

    public JPasswordField getJpfpass() {
        return jpfpass;
    }

    public void setJpfpass(JPasswordField jpfpass) {
        this.jpfpass = jpfpass;
    }

    public JButton getBtn() {
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }
}
