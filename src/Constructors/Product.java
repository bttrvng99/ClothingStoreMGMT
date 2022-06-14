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
public class Product {
    private String p_id;
    private String p_name;
    private String p_type;
    private String p_material;
    private String p_size;
    private int p_instore;
    private int p_price;
    private String m_id;

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }

    public String getP_material() {
        return p_material;
    }

    public void setP_material(String p_material) {
        this.p_material = p_material;
    }

    public String getP_size() {
        return p_size;
    }

    public void setP_size(String p_size) {
        this.p_size = p_size;
    }

    public int getP_instore() {
        return p_instore;
    }

    public void setP_instore(int p_instore) {
        this.p_instore = p_instore;
    }

    public int getP_price() {
        return p_price;
    }

    public void setP_price(int p_price) {
        this.p_price = p_price;
    }

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public Product(String p_id, String p_name, String p_type, String p_material, String p_size, int p_instore, int p_price, String m_id) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_type = p_type;
        this.p_material = p_material;
        this.p_size = p_size;
        this.p_instore = p_instore;
        this.p_price = p_price;
        this.m_id = m_id;
    }

    public Product() {
    }
}
