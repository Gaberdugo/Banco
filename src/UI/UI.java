/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import data.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Julián
 */
public class UI {
    
    public void addClientFile(String nombre){
        try{
                FileWriter entrada = new FileWriter("Registro.dat",true);
                entrada.append("A. " + nombre + ",");
                entrada.close();
            }catch(IOException e){
                e.printStackTrace();
            }
    }
    
    public static String readFileName() {
		Scanner sc = new Scanner(System.in);
                sc.useDelimiter(",");
		String fileName = "Registro.dat";
		sc.close();
		return fileName;
	}
}