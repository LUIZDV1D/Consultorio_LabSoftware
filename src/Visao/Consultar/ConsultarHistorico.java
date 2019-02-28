/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Consultar;

import DAO.Conexao;
import DAO.ConsultaDAO;
import DAO.PacienteDAO;
import Modelo.Consulta;
import Modelo.Paciente;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Alcantara
 */
public class ConsultarHistorico extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarHistorico
     */
    public ConsultarHistorico() {
        initComponents();
        AtualizaCombo();
        setSize(902,520);
        setLocationRelativeTo(this);
    }
    private void AtualizaCombo() {
        Connection con = Conexao.AbrirConexao();
        PacienteDAO sql = new PacienteDAO(con);
        List<Paciente> lista = new ArrayList<>();
        lista = sql.ListarComboPaciente();
        Combopa.addItem("");
        
        for (Paciente b : lista) {
            Combopa.addItem(b.getNome());
        }
        
        Conexao.FecharConexao(con);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Combopa = new javax.swing.JComboBox<>();
        jTF_Idp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Alcantara\\Pictures\\Nova pasta\\batimentos-cardiacos-desenho-png-1.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 0, 200, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Alcantara\\Pictures\\Nova pasta\\batimentos-cardiacos-desenho-png-1.png")); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 0, 200, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("HISTÓRICO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 10, 250, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 100);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOME DO PACIENTE", "CONSULTA", "DATA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 580, 240);

        Combopa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Combopa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Combopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombopaActionPerformed(evt);
            }
        });
        getContentPane().add(Combopa);
        Combopa.setBounds(220, 120, 240, 30);
        getContentPane().add(jTF_Idp);
        jTF_Idp.setBounds(100, 120, 110, 30);

        jLabel5.setText("NOME:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 120, 60, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PUXAR HISTÓRICO");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 255), null, null));
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 120, 130, 30);

        jButton2.setText("VOLTAR PARA MENU PRINCIPAL");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 255), null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 420, 260, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Alcantara\\Pictures\\Nova pasta\\fundo historico.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 100, 930, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CombopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombopaActionPerformed
Connection con = Conexao.AbrirConexao();
        PacienteDAO sql = new PacienteDAO(con);
        List<Paciente> lista = new ArrayList<>();
        String nome = Combopa.getSelectedItem().toString();
        
        lista = sql.ConsultarCodigoPaciente(nome);
        
        for (Paciente b : lista) {
            int a = b.getId();
            jTF_Idp.setText("" + a);
        }
        
        Conexao.FecharConexao(con);
    }//GEN-LAST:event_CombopaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Principal.home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combopa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_Idp;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}