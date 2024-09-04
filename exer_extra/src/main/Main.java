/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Laboratorio-Info
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner grava = new Scanner(System.in);
        
        double reslt = 0;
        
        System.out.println("Caso seu carro tenha exedido o limite da pista, quantos quilometros de diferença tem entre sua velocidade e o limite da pista?");
        reslt = grava.nextDouble();
        
        if(reslt <= 10 && reslt > 0){
           System.out.println("\nMULTA DE R$80,00\n");
        }else if(reslt < 40){
            System.out.println("\nMULTA DE R$120,00\n");
        }else if(reslt >= 40){
             System.out.println("MULTA DE R$200,00");
        }else{
             System.out.println("\nSem infrações, sem multa.\n");
        }
    }
}
