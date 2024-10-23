
package View;

public class Inicio_GUI extends javax.swing.JFrame {

    
    public Inicio_GUI() {
        initComponents();
        img_imc_a.setVisible(false);
        img_imc_b.setVisible(false);
        img_imc_c.setVisible(false);
        img_imc_d.setVisible(false);
        img_imc_e.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        out_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_nome = new javax.swing.JTextField();
        text_altura = new javax.swing.JTextField();
        text_peso = new javax.swing.JTextField();
        limpar_btn = new javax.swing.JButton();
        img_imc_a = new javax.swing.JLabel();
        img_imc_b = new javax.swing.JLabel();
        img_imc_c = new javax.swing.JLabel();
        img_imc_d = new javax.swing.JLabel();
        img_imc_e = new javax.swing.JLabel();
        calc_imc1_btn = new javax.swing.JButton();
        mess_txt = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        out_btn.setText("x");
        out_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_btnActionPerformed(evt);
            }
        });
        jPanel1.add(out_btn);
        out_btn.setBounds(330, 10, 50, 23);

        jLabel1.setText("Seu nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 49, 70, 14);

        jLabel2.setText("Sua altura:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 87, 70, 14);

        jLabel3.setText("Seu peso:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(15, 125, 60, 14);

        text_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(text_nome);
        text_nome.setBounds(84, 46, 102, 20);

        text_altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_alturaActionPerformed(evt);
            }
        });
        jPanel1.add(text_altura);
        text_altura.setBounds(84, 84, 102, 20);

        text_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_pesoActionPerformed(evt);
            }
        });
        jPanel1.add(text_peso);
        text_peso.setBounds(85, 122, 102, 20);

        limpar_btn.setText("Limpar");
        limpar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(limpar_btn);
        limpar_btn.setBounds(110, 160, 90, 23);

        img_imc_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imc_a(3).png"))); // NOI18N
        jPanel1.add(img_imc_a);
        img_imc_a.setBounds(220, 20, 90, 180);

        img_imc_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imc_b(3).png"))); // NOI18N
        jPanel1.add(img_imc_b);
        img_imc_b.setBounds(220, 30, 100, 170);

        img_imc_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imc_c(3).png"))); // NOI18N
        jPanel1.add(img_imc_c);
        img_imc_c.setBounds(220, 30, 100, 170);

        img_imc_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imc_d(3).png"))); // NOI18N
        jPanel1.add(img_imc_d);
        img_imc_d.setBounds(219, 20, 101, 180);

        img_imc_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imc_e(3).png"))); // NOI18N
        jPanel1.add(img_imc_e);
        img_imc_e.setBounds(210, 30, 110, 170);

        calc_imc1_btn.setText("Calcular");
        calc_imc1_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_imc1_btnActionPerformed(evt);
            }
        });
        jPanel1.add(calc_imc1_btn);
        calc_imc1_btn.setBounds(10, 160, 90, 23);
        jPanel1.add(mess_txt);
        mess_txt.setBounds(10, 210, 370, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(390, 270));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void text_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_pesoActionPerformed

    private void text_alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_alturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_alturaActionPerformed

    private void text_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomeActionPerformed

    private void out_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_btnActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_out_btnActionPerformed

    private void limpar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_btnActionPerformed
        Controller.Calcula_DAO.func_limpar();
    }//GEN-LAST:event_limpar_btnActionPerformed

    private void calc_imc1_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_imc1_btnActionPerformed
        Controller.Calcula_DAO.func_imc();
    }//GEN-LAST:event_calc_imc1_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calc_imc1_btn;
    public static javax.swing.JLabel img_imc_a;
    public static javax.swing.JLabel img_imc_b;
    public static javax.swing.JLabel img_imc_c;
    public static javax.swing.JLabel img_imc_d;
    public static javax.swing.JLabel img_imc_e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton limpar_btn;
    public static javax.swing.JLabel mess_txt;
    private javax.swing.JButton out_btn;
    public static javax.swing.JTextField text_altura;
    public static javax.swing.JTextField text_nome;
    public static javax.swing.JTextField text_peso;
    // End of variables declaration//GEN-END:variables
}
