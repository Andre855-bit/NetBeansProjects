
package Controller;

import javax.swing.JOptionPane;

public class Exerc2 {
    public static void litros_consumidos() {
       String ent;
       JOptionPane.showMessageDialog(null,"Exercicio 2, Litros");
       //ent = JOptionPane.showInputDialog(null, "Digite o seu peso");
       double lit , km , hor;
       ent = JOptionPane.showInputDialog(null, "Quam a distância que você percorreu em quilômetros!");
       km = Double.parseDouble(ent);
       ent = JOptionPane.showInputDialog(null, "Digite o tempo que levou para percorrer essa distância em horas!");
       hor = Double.parseDouble(ent);
       lit = km / hor ;
       JOptionPane.showMessageDialog(null,"Você deve ter gastado " + lit + " litros de combustível");
    }
    
}
