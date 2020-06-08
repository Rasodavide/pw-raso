/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.pw_bk_raso.users;

import javax.ejb.EJBException;

/**
 *
 * @author alfonso
 */
public class UserAlreadyExistException extends EJBException {

    private final String username;

    public UserAlreadyExistException(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    
}
