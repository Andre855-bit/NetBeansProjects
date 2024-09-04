/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Laboratorio-Info
 */
public class Maim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor=100;   
        while(valor>0){  
            if(valor%4 == 0){
               System.out.println(valor);
            }
            valor--;
        }
    }
    
}
