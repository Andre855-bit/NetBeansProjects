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
        // TODO code application logic here
        Scanner grava = new Scanner(System.in);
        
        double imc, peso, altura;
        System.out.println("Digite seu peso!");
        peso = grava.nextDouble();
        System.out.println("Digite sua altura!");
        altura = grava.nextDouble();
            imc = (altura*altura)/peso;
        System.out.println("Seu IMC é "+imc);
    
        
    }
    
}
