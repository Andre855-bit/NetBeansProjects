
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner grava = new Scanner(System.in);
        
        int cont = 0, ent = 0, alta = 0, baixa = 0, media =0;
        
        System.out.println("Digite um número");
        ent = grava.nextInt();
        baixa = ent;
        media = ent;
        
        while(cont < 2){
            System.out.println("Digite um número");
            ent = grava.nextInt();
            if(ent < baixa ){
                alta = media;
                media = baixa;
                baixa = ent;
            }if (ent > media && media < baixa) {
                media = ent;
            }if (ent < media && ent > baixa) {
                alta = media;
                media = ent;
            }if(ent > alta || alta < media){
                alta = ent; 
            }if (ent > media){
                alta = ent;
                media = ent;
            }
            cont++;
        }
        System.out.println("\n\n"+baixa+", "+media+", "+alta);
    }
}