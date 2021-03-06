/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerRequisicao;
import Model.Requisicao;
import com.google.gson.Gson;
import javax.swing.JOptionPane;


/**
 *
 * @author thiagorozaa
 */
public class TelaAtualizar extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaAtualizar() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSexo = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jTextFieldSexo = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelSexo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSexo.setText("Informe o sexo:");
        getContentPane().add(jLabelSexo);
        jLabelSexo.setBounds(30, 190, 230, 16);

        jLabelIdade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdade.setText("Informe sua idade:");
        getContentPane().add(jLabelIdade);
        jLabelIdade.setBounds(30, 240, 230, 16);
        getContentPane().add(jTextFieldSexo);
        jTextFieldSexo.setBounds(30, 210, 230, 30);
        getContentPane().add(jTextFieldIdade);
        jTextFieldIdade.setBounds(30, 260, 230, 30);

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar);
        jButtonAtualizar.setBounds(160, 310, 97, 29);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(0, 0, 480, 130);

        jLabelCpf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCpf.setText("Informe seu CPF:");
        getContentPane().add(jLabelCpf);
        jLabelCpf.setBounds(30, 140, 230, 16);
        getContentPane().add(jTextFieldCpf);
        jTextFieldCpf.setBounds(30, 160, 230, 30);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/asq.png"))); // NOI18N
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 800, 459);

        setSize(new java.awt.Dimension(697, 481));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        
        Requisicao req = new Requisicao();
        
        int idade              = Integer.parseInt(jTextFieldIdade.getText());
        char sexo              = jTextFieldSexo.getText().charAt(0);
        String cpf             = jTextFieldCpf.getText();
        
        ControllerRequisicao cr = new ControllerRequisicao();
        cr.atualizar(cpf,idade,sexo);
       
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldSexo;
    // End of variables declaration//GEN-END:variables
}
