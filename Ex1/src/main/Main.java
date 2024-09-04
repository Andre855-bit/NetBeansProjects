
package main;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
   Scanner grava = new Scanner(System.in);
   int idade;
   System.out.println("Digite sua idade");
   idade = grava.nextInt();
   
   if(idade >=1 && idade<=10){
       System.out.println("Infantil");
   }
   else if(idade >=11 && idade<=13){
       System.out.println("Infanto-Juvenil");
   }
   else if(idade >=14 && idade<=17){
       System.out.println("Adolescente");
   }
   else if(idade >=18){
       System.out.println("Adulto");
   }
           else System.out.println("Digite uma idade válida!");

    }
    
}
