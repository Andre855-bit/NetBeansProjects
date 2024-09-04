
package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int val = 0, med, al = 0, ida;
        
        
        while(al > -0.5){
            ida = grava.nextInt();
            if(ida < 1){
                al = -1;
                System.out.println("Parar!");
            }else{
            val += ida;
            al++;
            med = val/al;
            System.out.println("A idade média dos "+al+" alunos é "+med+" (Digite 0 para parar)!");
            }   
        }
    }
    
}
