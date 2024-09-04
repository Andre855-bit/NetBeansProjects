
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int resp,rg,cpf,cod;
        
        Scanner grava = new Scanner(System.in);
        System.out.println("Escolha uma opção e digite seu número correspondente!"+"\n\n1 - Inclusão"+"\n2 - Alteracão"+"\n3 - Exclusão"+"\n4 - Sair\n"); 
        resp = grava.nextInt();
         
        if(resp==1){
            System.out.println("Para se cadastrar é preciso RG, CPF e CÓDIGO\n\n");
            System.out.println("Digite seu RG!"); 
            rg = grava.nextInt();
            System.out.println("Digite seu CPF!"); 
            rg = grava.nextInt();
            System.out.println("Digite seu CÓDIGO!"); 
            rg = grava.nextInt();
        }else if(resp == 2){
            System.out.println("Registro alterado com sucesso");
        }else if(resp == 3){
            System.out.println("Registro excluido com sucesso");
            }else if(resp == 4){
            System.out.println("Encerrando o sistema");
        }else{
            System.out.println("Valor inválido, reiniciando cadastro...");
        }
    }
    
}
