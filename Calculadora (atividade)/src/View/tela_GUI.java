/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Laboratorio-Info
 */
public class tela_GUI extends javax.swing.JFrame {

    /**
     * Creates new form tela_GUI
     */
    public tela_GUI() {
        initComponents();
        res_txt.setVisible(false);
        img_txt.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        action_menos_btn = new javax.swing.JButton();
        action_mais_btn = new javax.swing.JButton();
        action_multi_btn = new javax.swing.JButton();
        action_divisa_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valor1_txt = new javax.swing.JTextField();
        valor2_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        res_txt = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        logo_btn = new javax.swing.JButton();
        img_txt = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        action_menos_btn.setText("-");
        action_menos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_menos_btnActionPerformed(evt);
            }
        });
        jPanel1.add(action_menos_btn);
        action_menos_btn.setBounds(90, 170, 49, 23);

        action_mais_btn.setText("+");
        action_mais_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_mais_btnActionPerformed(evt);
            }
        });
        jPanel1.add(action_mais_btn);
        action_mais_btn.setBounds(30, 170, 49, 23);

        action_multi_btn.setText("*");
        action_multi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_multi_btnActionPerformed(evt);
            }
        });
        jPanel1.add(action_multi_btn);
        action_multi_btn.setBounds(160, 170, 49, 23);

        action_divisa_btn.setText("/");
        action_divisa_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_divisa_btnActionPerformed(evt);
            }
        });
        jPanel1.add(action_divisa_btn);
        action_divisa_btn.setBounds(220, 170, 49, 23);

        jLabel1.setText("Valor 1:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 56, 14);

        jLabel2.setText("Valor 2:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 56, 14);
        jPanel1.add(valor1_txt);
        valor1_txt.setBounds(90, 40, 141, 20);

        valor2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2_txtActionPerformed(evt);
            }
        });
        jPanel1.add(valor2_txt);
        valor2_txt.setBounds(90, 80, 141, 20);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 20, 50, 30);
        jPanel1.add(res_txt);
        res_txt.setBounds(120, 120, 60, 40);

        jButton2.setText("C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(213, 120, 50, 23);

        logo_btn.setText("Logo");
        logo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logo_btnActionPerformed(evt);
            }
        });
        jPanel1.add(logo_btn);
        logo_btn.setBounds(20, 120, 60, 23);

        img_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/logo rosa.png"))); // NOI18N
        jPanel1.add(img_txt);
        img_txt.setBounds(250, 70, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(300, 225));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void action_menos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_menos_btnActionPerformed
        Controller.Funcoes_DAO.func_menos();
    }//GEN-LAST:event_action_menos_btnActionPerformed

    private void action_mais_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_mais_btnActionPerformed
        Controller.Funcoes_DAO.func_mais();
    }//GEN-LAST:event_action_mais_btnActionPerformed

    private void action_multi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_multi_btnActionPerformed
        Controller.Funcoes_DAO.func_multi();
    }//GEN-LAST:event_action_multi_btnActionPerformed

    private void action_divisa_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_divisa_btnActionPerformed
       Controller.Funcoes_DAO.func_divisa();
    }//GEN-LAST:event_action_divisa_btnActionPerformed

    private void valor2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor2_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Controller.Funcoes_DAO.func_limpar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logo_btnActionPerformed
        Controller.Funcoes_DAO.func_logo();
    }//GEN-LAST:event_logo_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton action_divisa_btn;
    public static javax.swing.JButton action_mais_btn;
    public static javax.swing.JButton action_menos_btn;
    public static javax.swing.JButton action_multi_btn;
    public static javax.swing.JLabel img_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logo_btn;
    public static javax.swing.JLabel res_txt;
    public static javax.swing.JTextField valor1_txt;
    public static javax.swing.JTextField valor2_txt;
    // End of variables declaration//GEN-END:variables
}
