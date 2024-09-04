
package main;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int idade1,idade2 , cont=0;
        String nome1 , sexo1, nome2 , sexo2; 
        System.out.println("Digite seu nome");
        nome1= grava.next();
        System.out.println("Digite sua idade");
        idade1 = grava.nextInt();
        System.out.println("Digite seu sexo");  
        sexo1 = grava.next();
        System.out.println("Digite seu nome");
        nome2= grava.next();
        System.out.println("Digite sua idade");
        idade2 = grava.nextInt();
        System.out.println("Digite seu sexo");  
        sexo2 = grava.next();
    
    while (cont < 20){
        
    if("m".equals(sexo1) && idade1>=21){
        System.out.println("Seu nome é "+nome1);
    }
    if("m".equals(sexo2) && idade2>=21){
        System.out.println("Seu nome é "+nome2);
    }
    cont++;
    
    
    
    
    
    
    
    }
    
    
    
    
    }
    
}
