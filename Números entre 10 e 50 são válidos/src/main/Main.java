
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int a = 0,val = 0,inv = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Da sequência dos 10 números, insirá "+i+"º valor!");
            a = grava.nextInt();
            if(a < 10 && a < 50){
                val++;
            }else{
                inv++;
            }
        }
        System.out.println("Dos 10 valores inserios no sistema, apenas "+val+" estão entre 10 a 50, ou seja, "+inv+" dos valores inseridos estão fora desse intervalo!");       
    }
}
