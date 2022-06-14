/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class ShoppingList {
    private String s_id;
    private String e_id;
    private String c_id;
    private String p_id;
    private int discount;
    private int quantity;
    private String datetime;
    private double payment;

    public ShoppingList() {
    }

    public ShoppingList(String s_id, String e_id, String c_id, String p_id, int discount, int quantity, String datetime, double payment) {
        this.s_id = s_id;
        this.e_id = e_id;
        this.c_id = c_id;
        this.p_id = p_id;
        this.discount = discount;
        this.quantity = quantity;
        this.datetime = datetime;
        this.payment = payment;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
    
}
