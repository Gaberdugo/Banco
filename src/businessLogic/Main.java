/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import UI.UI;
import data.Bank;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Julián
 */
public class Main {

    /**
     * @param args the command line arguments
     */

      public static void main(String[] args) {
        int x;
        
        UI ui = new UI();
        Scanner a = new Scanner(System.in);
        Bank b = new Bank("Banco");
        System.out.println("Bienvenido al Banco");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Agregar Cuenta");
        System.out.println("3. Agregar Manager");
        System.out.println("4. Buscar clientes");
        x = a.nextInt();
        
        if (x == 1){
            System.out.println("Nombre del cliente");
            String nombre = a.next();
            
            ui.addClientFile(nombre);
            
            boolean r = b.addClient(nombre);
            if(r){
                System.out.println("Exito al guardar");
            }
            else{
                System.out.println("Error");
            }
        }
        
        if (x == 2){
            System.out.println("Nuevo id");
            int id = a.nextInt();
            System.out.println("Valor inicial");
            float credit = a.nextFloat();
            boolean r = b.addAccount(id, credit);
            if(r){
                System.out.println("Exito al guardar");
            }
            else{
                System.out.println("Error");
            }
        }
        
        if (x == 3){
            System.out.println("Nombre del manager");
            String nombre = a.next();
            boolean r = b.addManager(nombre);
            if(r){
                System.out.println("Exito al guardar");
            }
            else{
                System.out.println("Error");
            }
        }
        
        if (x == 4){
            
        }
    }
}