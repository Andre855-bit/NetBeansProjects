/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Laboratorio-Info
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
       double comb , mes,resp;
       
      System.out.println("Quanto reais de combustível você gasta em 1 dia?");
        comb = grava.nextDouble();
      System.out.println("Quantos dias no mês você gastou combustível?");
        mes = grava.nextDouble();
      resp = comb * mes;
        System.out.println("O Resultado foi você gastou R$"+resp+" no mês!");
    }
    
}
