
package main;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int rep, i = 0;
        System.out.println("Digite um número!");
        rep = grava.nextInt();
        
        while(i != rep){
            if(i < rep){
                i++;
                System.out.println("Isso é um teste deve aparecer na tela ");
            }else{i--;
                System.out.println("Isso é um teste deve aparecer na tela ");
            }
            
        }
    }
    
}
