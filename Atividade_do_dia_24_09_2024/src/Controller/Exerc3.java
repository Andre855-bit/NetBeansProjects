
package Controller;

import javax.swing.JOptionPane;


public class Exerc3 {
    public static void dias_e_horas() {
        String ent;
        JOptionPane.showMessageDialog(null,"Exercicio 3, Dias de vida");
        int idade ;
        double dias , horas;
        ent = JOptionPane.showInputDialog(null, "Digite a sua idade");
        idade = Integer.parseInt(ent);
        dias = idade*365;
        horas = dias * 24;
        JOptionPane.showMessageDialog(null,"Você viveu " + dias + "Dias e " +horas+ "horas");
    }
}
