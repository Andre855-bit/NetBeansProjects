
package Controller;

import static View.Incio_GUI.valor_txt;
import javax.swing.JOptionPane;

public class Funcional_DAO {
    
    public static double valor = 0;
    
    public static void func(){
        
        String x = View.Incio_GUI.nome_txt.getText();
        JOptionPane.showMessageDialog(null,"O nome armazenado é " + x);
        valor = Double.parseDouble(valor_txt.getText());
        JOptionPane.showMessageDialog(null,"O valor armazenado é " + valor);
    }
}
