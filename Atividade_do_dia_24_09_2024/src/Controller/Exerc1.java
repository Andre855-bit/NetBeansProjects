
package Controller;

import javax.swing.JOptionPane;

public class Exerc1 {
      public static void calc_imc() {
       String ent;
       JOptionPane.showMessageDialog(null,"Exercicio 1, IMC");
       //ent = JOptionPane.showInputDialog(null, "Digite o seu peso");
       double imc , peso , altura;
       ent = JOptionPane.showInputDialog(null, "Digite o seu peso");
       peso = Double.parseDouble(ent);
       ent = JOptionPane.showInputDialog(null, "Digite a sua altura");
       altura = Double.parseDouble(ent);
       imc = peso / (altura * altura);
       JOptionPane.showMessageDialog(null,"Seu IMC é " + imc);
    }
}
