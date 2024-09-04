
package main;

import java.util.Scanner;


 
public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double salbru =0 , salliq =0;

        System.out.println("Digite seu salário");
        salbru = grava.nextDouble();

        salliq = ((salbru*0.98)*0.94)*0.93;
        
        if(salliq >=1200  ){
           System.out.println("Ao descontar o INSS, seu salário fica R$"+(salliq*0.85));
        }else{
            System.out.println("Não houve desconto do INSS, seu salário fica R$"+salliq);
        }

    }
    
}
