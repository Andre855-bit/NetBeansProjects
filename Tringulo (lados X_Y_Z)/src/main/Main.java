
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int a = 0,b = 0,c = 0, d;
        
        for(int i = 1; i <= 3; i++){
            System.out.println("Insirá o valor o "+i+"º lado do triangulo!");
            d = grava.nextInt();
            c = b;
            b = a;
            a = d;
            if(i == 3){
                if(a == b && b == c){
                   System.out.println("\nPelas medias dos lados do triangulo que inseriu, só pode ser um triângulo equilátero");                
                } else if (a == b || b == c || b == c){
                    System.out.println("\nPelas medias dos lados do triangulo que inseriu, só pode ser um triângulo isósceles");
                }else{
                    System.out.println("\nPelas medias dos lados do triangulo que inseriu, só pode ser um triângulo escalenos");
                }
            }
        }
    }
}
