/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Julián
 */
public class Manager extends Person {
    private ArrayList <Client> clients;
    
    public Manager(String nombre) {
        super(nombre);
        this.clients = new ArrayList<>();        
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}