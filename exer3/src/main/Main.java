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
        
       int x, sucessor;
       
      System.out.println("Digite um número!");
        x = grava.nextInt();
        sucessor = x+1;
      System.out.println("O sucessor de "+x+" é "+sucessor);
       
    }
    
}
