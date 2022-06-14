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
public class Manufacturer {
    private String m_id;
    private String m_name;
    private String m_address;
    private String m_phone;
    private String m_email;

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_address() {
        return m_address;
    }

    public void setM_address(String m_address) {
        this.m_address = m_address;
    }

    public String getM_phone() {
        return m_phone;
    }

    public void setM_phone(String m_phone) {
        this.m_phone = m_phone;
    }

    public String getM_email() {
        return m_email;
    }

    public void setM_email(String m_email) {
        this.m_email = m_email;
    }

    public Manufacturer(String m_id, String m_name, String m_address, String m_phone, String m_email) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_address = m_address;
        this.m_phone = m_phone;
        this.m_email = m_email;
    }

    public Manufacturer() {
    }
}
