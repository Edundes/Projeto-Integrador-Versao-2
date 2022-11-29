/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class telaMenu extends javax.swing.JFrame {


    public telaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        botãoFechar = new javax.swing.JButton();
        barraDeMenu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuAnalise = new javax.swing.JMenu();
        menuInformacao = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pequi Crédito");

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Pequi Crédito");

        botãoFechar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botãoFechar.setText("Fechar");
        botãoFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botãoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoFecharActionPerformed(evt);
            }
        });

        menuCadastro.setText("Cadastro");
        menuCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadastroMouseClicked(evt);
            }
        });
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });
        barraDeMenu.add(menuCadastro);

        menuAnalise.setText("Análise de Crédito");
        menuAnalise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAnaliseMouseClicked(evt);
            }
        });
        menuAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnaliseActionPerformed(evt);
            }
        });
        barraDeMenu.add(menuAnalise);

        menuInformacao.setText("Informações do Cliente");
        barraDeMenu.add(menuInformacao);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botãoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(42, 42, 42)
                .addComponent(botãoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botãoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_botãoFecharActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastroMouseClicked
        TelaCliente janela = new TelaCliente();
        janela.setVisible(true);
    }//GEN-LAST:event_menuCadastroMouseClicked

    private void menuAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnaliseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAnaliseActionPerformed

    private void menuAnaliseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAnaliseMouseClicked
        AnaliseCredito analise = new AnaliseCredito();
        analise.setVisible(true);
    }//GEN-LAST:event_menuAnaliseMouseClicked

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
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JButton botãoFechar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JMenu menuAnalise;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuInformacao;
    // End of variables declaration//GEN-END:variables
}
