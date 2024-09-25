
package main;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int a,b=0;
        for(int i = 1; i <= 4; i++){
            a = grava.nextInt();
            if (a%2==0){
                b+=a;
            } 
        }
        System.out.println("A soma dos números pares são:"+b);
    }
}
