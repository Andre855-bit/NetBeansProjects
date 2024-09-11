
package main;

import java.util.Scanner;


public class Main {
  
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int a = 0;
   
       for(int b =0;a%4 ==0;b++){
        System.out.println("Digite um ano");
        a = grava.nextInt();
        if(a % 4 ==0){
         System.out.println("É um ano bissexto");
        }
        else {
            System.out.println("Não é um ano bissexto");
        }
       }
    }
    
}
