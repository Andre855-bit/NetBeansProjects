
package main;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {

         Scanner grava = new Scanner(System.in);
        
       double valor , resultado;
       
      System.out.println("Digite um  valor");
        valor = grava.nextDouble();
        
        resultado = (2/(50+valor))/((49+(2*2))/48);
           System.out.println("O Resultado foi "+resultado);
    }
    
}
