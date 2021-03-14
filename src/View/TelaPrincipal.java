/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConexaoBD;

/**
 *
 * @author thiagorozaa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    
    ConexaoBD conn = new ConexaoBD();
    
    public TelaPrincipal() {
        initComponents();
       conn.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1Atualizar = new javax.swing.JMenu();
        jMenuItem1Consultar = new javax.swing.JMenuItem();
        jMenuItem2Incluir = new javax.swing.JMenuItem();
        jMenuItem3Atualizar = new javax.swing.JMenuItem();
        jMenuItem4Deletar = new javax.swing.JMenuItem();
        jMenuItem3Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(90, 140, 480, 130);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/asq.png"))); // NOI18N
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 800, 459);

        jMenu1Atualizar.setText("Inicio");

        jMenuItem1Consultar.setText("Consultar");
        jMenuItem1Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ConsultarActionPerformed(evt);
            }
        });
        jMenu1Atualizar.add(jMenuItem1Consultar);

        jMenuItem2Incluir.setText("Incluir");
        jMenuItem2Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2IncluirActionPerformed(evt);
            }
        });
        jMenu1Atualizar.add(jMenuItem2Incluir);

        jMenuItem3Atualizar.setText("Atualizar");
        jMenuItem3Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3AtualizarActionPerformed(evt);
            }
        });
        jMenu1Atualizar.add(jMenuItem3Atualizar);

        jMenuItem4Deletar.setText("Deletar");
        jMenuItem4Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4DeletarActionPerformed(evt);
            }
        });
        jMenu1Atualizar.add(jMenuItem4Deletar);

        jMenuItem3Sair.setText("Sair");
        jMenuItem3Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3SairActionPerformed(evt);
            }
        });
        jMenu1Atualizar.add(jMenuItem3Sair);

        jMenuBar1.add(jMenu1Atualizar);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(697, 481));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ConsultarActionPerformed
        // TODO add your handling code here:
        TelaConsultar tela = new TelaConsultar();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ConsultarActionPerformed

    private void jMenuItem3SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3SairActionPerformed
        // TODO add your handling code here:
        conn.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3SairActionPerformed

    private void jMenuItem2IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2IncluirActionPerformed
        // TODO add your handling code here:
        TelaInclusao tela = new TelaInclusao();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2IncluirActionPerformed

    private void jMenuItem4DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4DeletarActionPerformed
        // TODO add your handling code here:
        TelaDeletar tela = new TelaDeletar();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem4DeletarActionPerformed

    private void jMenuItem3AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3AtualizarActionPerformed
        // TODO add your handling code here:
        TelaAtualizar tela = new TelaAtualizar();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3AtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenu jMenu1Atualizar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1Consultar;
    private javax.swing.JMenuItem jMenuItem2Incluir;
    private javax.swing.JMenuItem jMenuItem3Atualizar;
    private javax.swing.JMenuItem jMenuItem3Sair;
    private javax.swing.JMenuItem jMenuItem4Deletar;
    // End of variables declaration//GEN-END:variables
}
