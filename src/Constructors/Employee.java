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
public class Employee {
    private String e_id;
    private String e_fname;
    private String e_lname;
    private String e_ssn;
    private Date dob;
    private String address;
    private String phone;
    private String email;
    private String e_r;
    private String upper_r;
    private String v_id;

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public String getE_fname() {
        return e_fname;
    }

    public void setE_fname(String e_fname) {
        this.e_fname = e_fname;
    }

    public String getE_lname() {
        return e_lname;
    }

    public void setE_lname(String e_lname) {
        this.e_lname = e_lname;
    }

    public String getE_ssn() {
        return e_ssn;
    }

    public void setE_ssn(String e_ssn) {
        this.e_ssn = e_ssn;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getE_r() {
        return e_r;
    }

    public void setE_r(String e_r) {
        this.e_r = e_r;
    }

    public String getUpper_r() {
        return upper_r;
    }

    public void setUpper_r(String upper_r) {
        this.upper_r = upper_r;
    }

    public String getV_id() {
        return v_id;
    }

    public void setV_id(String v_id) {
        this.v_id = v_id;
    }

    public Employee(String e_id, String e_fname, String e_lname, String e_ssn, Date dob, String address, String phone, String email, String facebook, String e_r, String upper_r, String v_id) {
        this.e_id = e_id;
        this.e_fname = e_fname;
        this.e_lname = e_lname;
        this.e_ssn = e_ssn;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.e_r = e_r;
        this.upper_r = upper_r;
        this.v_id = v_id;
    }

    public Employee() {
    }
}
