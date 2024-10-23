
package Controller;

import static View.Inicio_GUI.img_imc_a;
import static View.Inicio_GUI.img_imc_b;
import static View.Inicio_GUI.img_imc_c;
import static View.Inicio_GUI.img_imc_d;
import static View.Inicio_GUI.img_imc_e;
import static View.Inicio_GUI.mess_txt;
import static View.Inicio_GUI.text_altura;
import static View.Inicio_GUI.text_nome;
import static View.Inicio_GUI.text_peso;
import javax.swing.JOptionPane;

public class Calcula_DAO {
    
    public static double alt , peso, imc;
    
    public static String nome, text="", res;
    
    public static void func_imc(){
        

        
        nome = text_nome.getText();
        alt = Double.parseDouble(View.Inicio_GUI.text_altura.getText());
        peso = Double.parseDouble(View.Inicio_GUI.text_peso.getText());
        imc = peso/(alt * alt);
        
        res = String.format("%.2f", imc);
        
        JOptionPane.showMessageDialog(null,"Processo concluido " + nome + "! IMC é "+ imc);
        if(imc < 18.5){
            img_imc_a.setVisible(true);
            mess_txt.setText(String.valueOf(res + " - magro ou abaixo do peso, risco de doença: Normal à elevado."));
        } else if(imc < 24.9){
            img_imc_b.setVisible(true);
            mess_txt.setText(String.valueOf(res + " - estado regular, risco de doença: Pouco elevado."));
        } else if(imc < 29.9){
            img_imc_c.setVisible(true);
            mess_txt.setText(String.valueOf(res + " - sobrepeso ou pré-obeso, risco de doença: normal."));
        } else if(imc < 34.99){
            img_imc_d.setVisible(true);
            mess_txt.setText(String.valueOf(res + " - obsidade, risco de doença: Elevado."));
        } else if(imc < 39.99){
            img_imc_e.setVisible(true);
            mess_txt.setText(String.valueOf(res + " - obsidade, risco de doença: Muito elevado."));
        } else {
            JOptionPane.showMessageDialog(null,"Procure ajuda!!!");
            mess_txt.setText(String.valueOf(res + " - obesidade, risco de doença: Extramente elevado."));
        
        }
        
    }
    
    public static void func_limpar(){
        text_nome.setText(String.valueOf(""));
        text_altura.setText(String.valueOf(""));
        text_peso.setText(String.valueOf(""));
        mess_txt.setText(String.valueOf(""));
        img_imc_a.setVisible(false);
        img_imc_b.setVisible(false);
        img_imc_c.setVisible(false);
        img_imc_d.setVisible(false);
        img_imc_e.setVisible(false);
    }
    
}
