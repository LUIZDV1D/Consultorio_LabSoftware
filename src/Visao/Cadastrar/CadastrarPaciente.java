/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Cadastrar;

import DAO.Conexao;
import DAO.PacienteDAO;
import Modelo.Paciente;
import Principal.home;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Alcantara
 */
public class CadastrarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarPaciente
     */
    public CadastrarPaciente() {
        initComponents();
        setSize(618,606);
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTF_Nome = new javax.swing.JTextField();
        jTF_Idade = new javax.swing.JTextField();
        jTF_Resp = new javax.swing.JTextField();
        jTF_Sexo = new javax.swing.JTextField();
        jTF_SUS = new javax.swing.JFormattedTextField();
        jTF_CPF = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cadastro do Paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 100);

        jPanel2.setLayout(null);

        jLabel2.setText("Nome:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 40, 40, 14);

        jLabel3.setText("Idade:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(22, 80, 40, 14);

        jLabel4.setText("N° SUS:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 120, 70, 14);

        jLabel7.setText("CPF :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 160, 50, 20);

        jLabel8.setText("Responsavel:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 190, 80, 30);

        jLabel9.setText("Sexo :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 230, 50, 30);
        jPanel2.add(jTF_Nome);
        jTF_Nome.setBounds(80, 30, 468, 30);

        jTF_Idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_IdadeActionPerformed(evt);
            }
        });
        jTF_Idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTF_IdadeKeyReleased(evt);
            }
        });
        jPanel2.add(jTF_Idade);
        jTF_Idade.setBounds(80, 70, 468, 30);

        jTF_Resp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_RespActionPerformed(evt);
            }
        });
        jPanel2.add(jTF_Resp);
        jTF_Resp.setBounds(100, 190, 450, 30);
        jPanel2.add(jTF_Sexo);
        jTF_Sexo.setBounds(80, 230, 469, 30);

        try {
            jTF_SUS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTF_SUS);
        jTF_SUS.setBounds(80, 110, 470, 30);

        try {
            jTF_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTF_CPF);
        jTF_CPF.setBounds(80, 150, 470, 30);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(71, 71, 71))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(37, 37, 37))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 300, 620, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clinica-Medica.jpeg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 10, 630, 690);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 620, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nome = jTF_Nome.getText();
        String idade = jTF_Idade.getText();
        String sus = jTF_SUS.getText();
        String cpf = jTF_CPF.getText();
        String responsavel = jTF_Resp.getText();
        String sexo = jTF_Sexo.getText();
        
        if (nome.equals("") || idade.equals("") || sus.equals("") || cpf.equals("") || responsavel.equals("") || sexo.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Nenhum campo está vazio", 
                    "Centro Medico", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = Conexao.AbrirConexao();
            PacienteDAO sql = new PacienteDAO(con);
            int n = Integer.parseInt(idade);
            Paciente a = new Paciente();
            
            a.setNome(nome);
            a.setIdade(n);
            a.setSUS(sus);
            a.setCpf(cpf);
            a.setResponsavel(responsavel);
            a.setSexo(sexo);
            
            
            sql.Inserir_Paciente(a);
            Conexao.FecharConexao(con);
            
            jTF_Nome.setText("");
            jTF_Idade.setText("");
            jTF_SUS.setText("");
            jTF_Sexo.setText("");
            jTF_CPF.setText("");
            jTF_Resp.setText("");
            
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso",
                    "Centro Medico", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new home().setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTF_RespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_RespActionPerformed

    }//GEN-LAST:event_jTF_RespActionPerformed

    private void jTF_IdadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_IdadeKeyReleased
        
        int i = Integer.parseInt(jTF_Idade.getText());
        
        if(i > 17){
            jTF_Resp.disable();
        }else{
            jTF_Resp.enable();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_IdadeKeyReleased

    private void jTF_IdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_IdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_IdadeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JFormattedTextField jTF_CPF;
    private javax.swing.JTextField jTF_Idade;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JTextField jTF_Resp;
    private javax.swing.JFormattedTextField jTF_SUS;
    private javax.swing.JTextField jTF_Sexo;
    // End of variables declaration//GEN-END:variables
}
