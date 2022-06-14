/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors;

import java.util.Date;

/**
 *
 * @author User
 */
public class Customer {
    private String c_id;
    private String p_fname;
    private String p_lname;
    private String p_ssn;
    private Date p_dob;
    private String p_address;
    private String p_phone;
    private String p_rank;
    private String p_email;

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getP_fname() {
        return p_fname;
    }

    public void setP_fname(String p_fname) {
        this.p_fname = p_fname;
    }

    public String getP_lname() {
        return p_lname;
    }

    public void setP_lname(String p_lname) {
        this.p_lname = p_lname;
    }

    public String getP_ssn() {
        return p_ssn;
    }

    public void setP_ssn(String p_ssn) {
        this.p_ssn = p_ssn;
    }

    public Date getP_dob() {
        return p_dob;
    }

    public void setP_dob(Date p_dob) {
        this.p_dob = p_dob;
    }

    public String getP_address() {
        return p_address;
    }

    public void setP_address(String p_address) {
        this.p_address = p_address;
    }

    public String getP_phone() {
        return p_phone;
    }

    public void setP_phone(String p_phone) {
        this.p_phone = p_phone;
    }

    public String getP_rank() {
        return p_rank;
    }

    public void setP_rank(String p_rank) {
        this.p_rank = p_rank;
    }

    public String getP_email() {
        return p_email;
    }

    public void setP_email(String p_email) {
        this.p_email = p_email;
    }

    public Customer(String c_id, String p_fname, String p_lname, String p_ssn, Date p_dob, String p_address, String p_phone, String p_rank, String p_email) {
        this.c_id = c_id;
        this.p_fname = p_fname;
        this.p_lname = p_lname;
        this.p_ssn = p_ssn;
        this.p_dob = p_dob;
        this.p_address = p_address;
        this.p_phone = p_phone;
        this.p_rank = p_rank;
        this.p_email = p_email;
    }

    public Customer() {
    }
}
