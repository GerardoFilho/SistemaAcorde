/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acorde.view;

import static br.com.acorde.view.TelaNutricionistaPerfil.*;
import br.com.acorde.dao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Freetech
 */
public class TelaPrincipalNutricionista extends javax.swing.JFrame {

     //variaveis do BD
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form TelaPrincipalNutricionista
     */
    public TelaPrincipalNutricionista() {
        initComponents();
        conexao = ModuloConexao.conexaoBanco();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNomeNutric = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMenuPerfilNutri = new javax.swing.JLabel();
        lblMenuDietalNutri = new javax.swing.JLabel();
        lblMenuAlimentoNutri = new javax.swing.JLabel();
        lblMenuMSGlNutri = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        jPanelAreaNutricionista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 131));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 131));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Seja bem vindo(a) ao <Acorde!>, ");

        lblNomeNutric.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNomeNutric.setText("Nome");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblData.setText("Terça, 23 de Março de 2021");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeNutric))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNomeNutric))
                .addGap(18, 18, 18)
                .addComponent(lblData)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setMinimumSize(new java.awt.Dimension(237, 513));
        jPanel3.setPreferredSize(new java.awt.Dimension(237, 513));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Menu");

        lblMenuPerfilNutri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuPerfilNutri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/user.png"))); // NOI18N
        lblMenuPerfilNutri.setText("     Perfil");
        lblMenuPerfilNutri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuPerfilNutri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuPerfilNutriMouseClicked(evt);
            }
        });

        lblMenuDietalNutri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuDietalNutri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/prato.png"))); // NOI18N
        lblMenuDietalNutri.setText("    Dieta");
        lblMenuDietalNutri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuDietalNutri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuDietalNutriMouseClicked(evt);
            }
        });

        lblMenuAlimentoNutri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuAlimentoNutri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/alimento.png"))); // NOI18N
        lblMenuAlimentoNutri.setText("    Alimento");
        lblMenuAlimentoNutri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuAlimentoNutri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuAlimentoNutriMouseClicked(evt);
            }
        });

        lblMenuMSGlNutri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuMSGlNutri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/msg.png"))); // NOI18N
        lblMenuMSGlNutri.setText("    Mensagem");
        lblMenuMSGlNutri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuMSGlNutri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMSGlNutriMouseClicked(evt);
            }
        });

        lblSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/sair.png"))); // NOI18N
        lblSair.setText("    Sair");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMenuPerfilNutri))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMenuDietalNutri))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMenuAlimentoNutri))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMenuMSGlNutri))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSair)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblMenuAlimentoNutri, lblMenuDietalNutri, lblMenuMSGlNutri, lblMenuPerfilNutri, lblSair});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblMenuPerfilNutri)
                .addGap(18, 18, 18)
                .addComponent(lblMenuDietalNutri)
                .addGap(18, 18, 18)
                .addComponent(lblMenuAlimentoNutri)
                .addGap(18, 18, 18)
                .addComponent(lblMenuMSGlNutri)
                .addGap(18, 18, 18)
                .addComponent(lblSair)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblMenuAlimentoNutri, lblMenuDietalNutri, lblMenuMSGlNutri, lblMenuPerfilNutri, lblSair});

        jPanelAreaNutricionista.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelAreaNutricionistaLayout = new javax.swing.GroupLayout(jPanelAreaNutricionista);
        jPanelAreaNutricionista.setLayout(jPanelAreaNutricionistaLayout);
        jPanelAreaNutricionistaLayout.setHorizontalGroup(
            jPanelAreaNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelAreaNutricionistaLayout.setVerticalGroup(
            jPanelAreaNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAreaNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAreaNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1016, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         //traz a data do sistema
        Date data = new Date();
        DateFormat formatado = DateFormat.getDateInstance(DateFormat.FULL);
        lblData.setText(formatado.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
           System.exit(0);
        }
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblMenuPerfilNutriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPerfilNutriMouseClicked
         // vai abrir a tela cliente PERFIl dentro da TelaPrincipalNutricionista
        TelaNutricionistaPerfil perfilNutricionista = new TelaNutricionistaPerfil();
        perfilNutricionista.setVisible(true);
        jPanelAreaNutricionista.add(perfilNutricionista);
        
        
         String sql = "select * from Nutricionista";
          try{
              pst = conexao.prepareStatement(sql);
              //pst.setString(1, txtIdCliente.getText());
              rs = pst.executeQuery();
              // rs.last() pega a ultima linha que foi colocada no bd, entao vai ter que fazer cadastro e login
              //para mostrar essas duas funcionalidades e pegar o ultimo que foi cadastrado
              if(rs.last()){
                  txtIdNutri.setText(rs.getString(1));
                  txtNomeNutri.setText(rs.getString(2));
                  txtEmailNutri.setText(rs.getString(3));
                  jpfSenhaNutri.setText(rs.getString(4));
                  txtSobrenomeNutri.setText(rs.getString(5));
                  ftxtDataNutri.setText(rs.getString(6));
                  ftxCRNNutri.setText(rs.getString(7));
                  jtxTelefoneNutri.setText(rs.getString(8));
              } 
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
              e.printStackTrace();
          }
    }//GEN-LAST:event_lblMenuPerfilNutriMouseClicked

    private void lblMenuDietalNutriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuDietalNutriMouseClicked
        // vai abrir a tela cliente DIETA dentro da TelaPrincipalNutricionista
        TelaNutricionistaDieta dietaNutricionista = new TelaNutricionistaDieta();
        dietaNutricionista.setVisible(true);
        jPanelAreaNutricionista.add(dietaNutricionista);
    }//GEN-LAST:event_lblMenuDietalNutriMouseClicked

    private void lblMenuAlimentoNutriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuAlimentoNutriMouseClicked
        // vai abrir a tela cliente ALIMENTO dentro da TelaPrincipalNutricionista
        TelaNutricionistaAlimento alimentoNutricionista = new TelaNutricionistaAlimento();
        alimentoNutricionista.setVisible(true);
        jPanelAreaNutricionista.add(alimentoNutricionista);
    }//GEN-LAST:event_lblMenuAlimentoNutriMouseClicked

    private void lblMenuMSGlNutriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMSGlNutriMouseClicked
          // vai abrir a tela cliente MENSAGEM dentro da TelaPrincipalNutricionista
        TelaNutricionistaMensagem msgNutricionista = new TelaNutricionistaMensagem();
        msgNutricionista.setVisible(true);
        jPanelAreaNutricionista.add(msgNutricionista);
    }//GEN-LAST:event_lblMenuMSGlNutriMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipalNutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalNutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalNutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalNutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new TelaPrincipalNutricionista().setVisible(true);
            }
        });
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAreaNutricionista;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblMenuAlimentoNutri;
    private javax.swing.JLabel lblMenuDietalNutri;
    private javax.swing.JLabel lblMenuMSGlNutri;
    private javax.swing.JLabel lblMenuPerfilNutri;
    public static javax.swing.JLabel lblNomeNutric;
    private javax.swing.JLabel lblSair;
    // End of variables declaration//GEN-END:variables
}
