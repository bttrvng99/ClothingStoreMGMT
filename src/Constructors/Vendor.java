/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors;

/**
 *
 * @author User
 */
public class Vendor {
    private String v_id;
    private String v_address;

    public String getV_id() {
        return v_id;
    }

    public void setV_id(String v_id) {
        this.v_id = v_id;
    }

    public String getV_address() {
        return v_address;
    }

    public void setV_address(String v_address) {
        this.v_address = v_address;
    }

    public Vendor() {
    }

    public Vendor(String v_id, String v_address) {
        this.v_id = v_id;
        this.v_address = v_address;
    }
}
