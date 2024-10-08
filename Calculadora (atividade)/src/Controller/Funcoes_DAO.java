
package Controller;

import javax.swing.JOptionPane;


public class Funcoes_DAO {
    
    public static Double valor1 , valor2 , resp;
    
    public static void func_mais(){
        valor1 = Double.parseDouble(View.tela_GUI.valor1_txt.getText());
        valor2 = Double.parseDouble(View.tela_GUI.valor2_txt.getText());
        resp = valor1 + valor2;
        JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
    
     public static void func_menos(){
        valor1 = Double.parseDouble(View.tela_GUI.valor1_txt.getText());
        valor2 = Double.parseDouble(View.tela_GUI.valor2_txt.getText());
        resp = valor1 - valor2;
        JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
     
      public static void func_multi(){
        valor1 = Double.parseDouble(View.tela_GUI.valor1_txt.getText());
        valor2 = Double.parseDouble(View.tela_GUI.valor2_txt.getText());
        resp = valor1 * valor2;
        JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
      
       public static void func_divisa(){
        valor1 = Double.parseDouble(View.tela_GUI.valor1_txt.getText());
        valor2 = Double.parseDouble(View.tela_GUI.valor2_txt.getText());
        resp = valor1 / valor2;
        JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
}
