/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/*
 * @author Khanh Nguyen
 * 
 */
public class AccountService implements Serializable {

    /**
     * method validates user login
     *
     * @param username
     * @param password
     * @return username if login information is correct, otherwise return null
     */
    public User login(String username, String password) {

        if ((username.equals("abe") || username.equals("barb")) && password.equals("password")) {
            return new User(username, null);
        } else {
            return null;
        }

    }

}
