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
        
        int num1, num2, num3, a, b, c;
        System.out.println("Digite um número!");
        num1 = grava.nextInt();
        System.out.println("Digite outro número!");
        num2 = grava.nextInt();
        System.out.println("Digite um terceiro número!");
        num3 = grava.nextInt();
        
        
            if(num1 > num2){
                a = num1;
                b = num2;
                if(a < num3){
                    a = num3;
                    b = num1;
                    c = num2;
                }else{
                    if(num2 > num3){
                        a = num1;
                        b = num2;
                        c = num3;
                    }else{
                        a = num1;
                        b = num3;
                        c = num2;                    
                    }
                }
            }else{
                if(num2 < num3){
                    a = num2;
                    b = num3;
                    c = num1;
                }else{
                    if(num1 > num3){
                        a = num2;
                        b = num1;
                        c = num3;
                    }else{
                        a = num2;
                        b = num3;
                        c = num1;                    
                    }
                
                }
            
            }
        System.out.println("Os números "+c+", "+b+" e "+a+" então em ordem crescente ");
    }
    
}
