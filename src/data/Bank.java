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
public class Bank {
    private String nombre;
    private ArrayList <Account> accounts;
    private ArrayList <Manager> managers;
    private ArrayList <Client> clients;

    public Bank(String nombre) {
        this.nombre = nombre;
        this.accounts = new ArrayList<>(); 
        this.managers = new ArrayList<>(); 
        this.clients = new ArrayList<>(); 
    }
 
    public boolean addAccount(int id, double credit) {
    Account account = new Account(id, credit);
    if (this.accounts.add(account))
        return true;
    else return false;
    }
    
    public boolean addManager(String nombre) {
    Manager manager = new Manager(nombre);
    if (this.managers.add(manager))
        return true;
    else return false;
    }
    
    public boolean addClient(String nombre) {
    Client client = new Client(nombre);
    if (this.clients.add(client))
        return true;
    else return false;
    }
}
