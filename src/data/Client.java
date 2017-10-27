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
public class Client extends Person {
    
    private Manager[] manager;
    private ArrayList <Account> accounts;

    public Client(String nombre) {
        super(nombre);
        this.accounts = new ArrayList<>();
        this.manager = new Manager[1];
    }  

    public Manager[] getManager() {
        return manager;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString();
    }
}