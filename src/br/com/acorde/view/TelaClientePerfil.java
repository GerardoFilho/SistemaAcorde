
package br.com.acorde.view;


import java.sql.*;
import br.com.acorde.dao.ModuloConexao;
import javax.swing.JOptionPane;
public class TelaClientePerfil extends javax.swing.JInternalFrame {
    
     //variaveis do BD
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private void deletarConta(){
        int confirma = JOptionPane.showConfirmDialog(null, "Essa ação deleta sua conta. Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            String sql = "delete from Cliente where IdCliente = ?";
            try{
               pst = conexao.prepareStatement(sql);
               pst.setString(1, txtIdCliente.getText());
               int apagado = pst.executeUpdate();
               
               if(apagado > 0){
                 
                  txtIdCliente.setText(null);
                  txtNomeCliente.setText(null);
                  txtEmailCliente.setText(null);
                  jpfSenhaCliente.setText(null);
                  txtSobrenomeCliente.setText(null);
                  ftxtDataCliente.setText(null);
                  ftxCPFCliente.setText(null);
                  jtxTelefoneCliente.setText(null);
                  JOptionPane.showMessageDialog(null, "Sua conta foi apagada.");
                  System.exit(0);
               }
               
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
                 e.printStackTrace();
            }
        } 
    }
    
    private void editarConta(){
        String sql = "update Cliente set nome = ?, email = ?, senha = ?, sobrenome = ?, DataNascimento = ?, CPF = ?, Telefone = ? where IdCliente = ?";
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeCliente.getText());
            pst.setString(2, txtEmailCliente.getText());
            pst.setString(3, jpfSenhaCliente.getText());
            pst.setString(4, txtSobrenomeCliente.getText());
            pst.setString(5, ftxtDataCliente.getText());
            pst.setString(6, ftxCPFCliente.getText());
            pst.setString(7, jtxTelefoneCliente.getText());
            pst.setString(8, txtIdCliente.getText());
            
             if( txtNomeCliente.getText().isEmpty() || txtEmailCliente.getText().isEmpty()
                     || jpfSenhaCliente.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios");
                  }else{
                      //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso com sucesso");
                    dispose();
     
                    }
                  }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             e.printStackTrace();
        }
    }
    /**
     * Creates new form TelaClientePerfil
     */

    public TelaClientePerfil() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        ftxtDataCliente = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSobrenomeCliente = new javax.swing.JTextField();
        ftxCPFCliente = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxTelefoneCliente = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        lblBotaoDeletarDados = new javax.swing.JLabel();
        lblBotaoEditarDados = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jpfSenhaCliente = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Perfil");
        setMinimumSize(new java.awt.Dimension(744, 511));
        setPreferredSize(new java.awt.Dimension(744, 511));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(702, 514));
        jPanel3.setPreferredSize(new java.awt.Dimension(702, 514));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("*Nome:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 106, 145, 29));

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 141, 172, -1));

        try {
            ftxtDataCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(ftxtDataCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 217, 172, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CPF:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 182, 145, 29));

        txtSobrenomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtSobrenomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 141, 172, -1));

        try {
            ftxCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxCPFCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(ftxCPFCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 217, 172, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefone:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 182, 145, 29));

        try {
            jtxTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxTelefoneCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jtxTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 217, 172, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("*Email:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 258, 145, 29));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("*Senha:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 258, 145, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Id de Cliente:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 106, 145, 29));

        txtIdCliente.setEditable(false);
        txtIdCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdCliente.setEnabled(false);
        jPanel3.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 141, 172, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Sobrenome:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 106, 145, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 182, -1, 29));

        txtEmailCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 293, 172, -1));

        lblBotaoDeletarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/deletar.png"))); // NOI18N
        lblBotaoDeletarDados.setToolTipText("Deletar Dados");
        lblBotaoDeletarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoDeletarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotaoDeletarDadosMouseClicked(evt);
            }
        });
        jPanel3.add(lblBotaoDeletarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 342, -1, -1));

        lblBotaoEditarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/salvar.png"))); // NOI18N
        lblBotaoEditarDados.setToolTipText("Editar Dados");
        lblBotaoEditarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoEditarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotaoEditarDadosMouseClicked(evt);
            }
        });
        jPanel3.add(lblBotaoEditarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 342, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Salvar Dados");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 408, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Deletar Dados");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 408, -1, -1));

        jpfSenhaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jpfSenhaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 293, 172, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Seus Dados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(293, 293, 293))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 736, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("*Campos Obrigatórios");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94))
        );

        setBounds(0, 0, 752, 511);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotaoDeletarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoDeletarDadosMouseClicked
        deletarConta();
    }//GEN-LAST:event_lblBotaoDeletarDadosMouseClicked

    private void lblBotaoEditarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoEditarDadosMouseClicked
       editarConta();
    }//GEN-LAST:event_lblBotaoEditarDadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFormattedTextField ftxCPFCliente;
    public static javax.swing.JFormattedTextField ftxtDataCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPasswordField jpfSenhaCliente;
    public static javax.swing.JFormattedTextField jtxTelefoneCliente;
    private javax.swing.JLabel lblBotaoDeletarDados;
    private javax.swing.JLabel lblBotaoEditarDados;
    public static javax.swing.JTextField txtEmailCliente;
    public static javax.swing.JTextField txtIdCliente;
    public static javax.swing.JTextField txtNomeCliente;
    public static javax.swing.JTextField txtSobrenomeCliente;
    // End of variables declaration//GEN-END:variables
}
