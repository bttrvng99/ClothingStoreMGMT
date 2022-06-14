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
public class LoginGETSET {
    private String id;
    private String passw;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return passw;
    }

    public void setPass(String passw) {
        this.passw = passw;
    }

    public LoginGETSET(String id, String pass) {
        this.id = id;
        this.passw = passw;
    }

    public LoginGETSET() {
    }
}
