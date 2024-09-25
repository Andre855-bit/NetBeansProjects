/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x;
        x = JOptionPane.showInputDialog(null, "Digite 1 valor!");
        int valor = Integer.parseInt(x);

        
        for(int i = 0; i <= 3; i++){
            //JOptionPane.showMessageDialog(null, "Hello World","Teste", i);
            //JOptionPane.showInputDialog(null, "Digite seu nome!");
            JOptionPane.showMessageDialog(null, "O valor é " + valor,"Teste", i);
        }
        // TODO code application logic here
    }
    
}
