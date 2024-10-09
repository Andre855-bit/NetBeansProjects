
package Controller;

import static View.tela_GUI.img_txt;
import static View.tela_GUI.res_txt;
import static View.tela_GUI.valor1_txt;
import static View.tela_GUI.valor2_txt;
import javax.swing.JOptionPane;


public class Funcoes_DAO {
    
    public static Double valor1 , valor2 , resp, logo;
    
    public static void func_mais(){
        valor1 = Double.parseDouble(View.tela_GUI.valor1_txt.getText());
        valor2 = Double.parseDouble(View.tela_GUI.valor2_txt.getText());
        resp = valor1 + valor2;
        res_txt.setText(String.valueOf(resp));
        res_txt.setVisible(true);
        //JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
    
     public static void func_menos(){
        valor1 = Double.parseDouble(View.tela_GUI.valor1_txt.getText());
        valor2 = Double.parseDouble(View.tela_GUI.valor2_txt.getText());
        resp = valor1 - valor2;
        res_txt.setText(String.valueOf(resp));
        res_txt.setVisible(true);
        //JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
     
      public static void func_multi(){
        valor1 = Double.parseDouble(View.tela_GUI.valor1_txt.getText());
        valor2 = Double.parseDouble(View.tela_GUI.valor2_txt.getText());
        resp = valor1 * valor2;
        res_txt.setText(String.valueOf(resp));
        res_txt.setVisible(true);
        //JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
      
       public static void func_divisa(){
        valor1 = Double.parseDouble(View.tela_GUI.valor1_txt.getText());
        valor2 = Double.parseDouble(View.tela_GUI.valor2_txt.getText());
        resp = valor1 / valor2;
        res_txt.setText(String.valueOf(resp));
        res_txt.setVisible(true);
        //JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
    
    public static void func_limpar(){
        valor1_txt.setText("");
        valor2_txt.setText("");
        res_txt.setVisible(false);
        img_txt.setVisible(false);
        //JOptionPane.showMessageDialog(null,"O valor armazenado é " + resp);
    }
    
    public static void func_logo(){
        //if (logo == 0){
            img_txt.setVisible(true);
            //logo += 1;
        //}else{
           // img_txt.setVisible(false);
           // logo -= 1;
        //}
        
    }
}
