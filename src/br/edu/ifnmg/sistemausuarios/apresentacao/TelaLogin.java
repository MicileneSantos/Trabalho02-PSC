package br.edu.ifnmg.sistemausuarios.apresentacao;

import br.edu.ifnmg.sistemausuarios.entidade.Usuarios;
import br.edu.ifnmg.sistemausuarios.excecao.CampoObrigatorioException;
import br.edu.ifnmg.sistemausuarios.excecao.LoginNaoEfetuadoException;
import br.edu.ifnmg.sistemausuarios.excecao.SenhaInvalidaException;
import br.edu.ifnmg.sistemausuarios.excecao.SistemaUsuarioException;
import br.edu.ifnmg.sistemausuarios.negocio.UsuariosBO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miih Santos
 */
public class TelaLogin extends javax.swing.JFrame {

    private List<Usuarios> usuarios;
    Usuarios usuario = null; 

    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        desabilitarBotoes();
    }

    private void desabilitarBotoes() {
        btnAlterarSenha.setEnabled(false);
        btnConfirmarSenha.setEnabled(false);
        btnLogoff.setEnabled(false);
        lblConfirmaSenha.setEnabled(false);
        pwdConfirmaSenha.setEnabled(false);
        mnuVendas.setEnabled(false);
        mnuUsuarios.setEnabled(false);
        mnuAbrirCaixa.setEnabled(false);
        mnuEstoque.setEnabled(false);
    }

    
    private void recuperarCamposTelaLogin() throws ParseException {
              
        if (!txtLogin.getText().trim().equals("")) {
            usuario.setLogin(txtLogin.getText().trim());
        } else {
            throw new CampoObrigatorioException();
        }
        
        if (!pwdSenha.getText().trim().equals("")) {
            usuario.setSenha(pwdSenha.getText().trim());
        }else {
            throw new CampoObrigatorioException();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTelaLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblConfirmaSenha = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLogoff = new javax.swing.JButton();
        btnAlterarSenha = new javax.swing.JButton();
        btnConfirmarSenha = new javax.swing.JButton();
        pwdSenha = new javax.swing.JPasswordField();
        pwdConfirmaSenha = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGestao = new javax.swing.JMenu();
        mnuUsuarios = new javax.swing.JMenu();
        mnuItemCadastro = new javax.swing.JMenuItem();
        mnuItemListagem = new javax.swing.JMenuItem();
        mnuItemFornecedores = new javax.swing.JMenuItem();
        mnuItemMercadorias = new javax.swing.JMenuItem();
        mnuItemPedidosCompras = new javax.swing.JMenuItem();
        mnuEstoque = new javax.swing.JMenuItem();
        mnuAbrirCaixa = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuItemSair = new javax.swing.JMenuItem();
        mnuVendas = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Usuários - Tela Principal");
        setExtendedState(6);

        pnlTelaLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlTelaLogin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogin.setText("Login:");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSenha.setText("Senha:");

        lblConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblConfirmaSenha.setText("Confirma Senha:");

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/login17.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogoff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/logout15.png"))); // NOI18N
        btnLogoff.setText("Logoff");
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        btnAlterarSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467368527_Update.png"))); // NOI18N
        btnAlterarSenha.setText("Alterar Senha");
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        btnConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirmarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1466831252_check.png"))); // NOI18N
        btnConfirmarSenha.setText("Confirmar Senha");
        btnConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTelaLoginLayout = new javax.swing.GroupLayout(pnlTelaLogin);
        pnlTelaLogin.setLayout(pnlTelaLoginLayout);
        pnlTelaLoginLayout.setHorizontalGroup(
            pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnLogoff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmarSenha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha)
                            .addComponent(lblConfirmaSenha)
                            .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pwdSenha)
                            .addComponent(pwdConfirmaSenha))))
                .addContainerGap())
        );
        pnlTelaLoginLayout.setVerticalGroup(
            pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addGap(26, 26, 26)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmaSenha)
                    .addComponent(pwdConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mnuGestao.setText("Gestão");
        mnuGestao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/user.png"))); // NOI18N
        mnuUsuarios.setText("Usuários");

        mnuItemCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467371252_user-add.png"))); // NOI18N
        mnuItemCadastro.setText("Cadastro de Usuários");
        mnuItemCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemCadastroActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mnuItemCadastro);

        mnuItemListagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467371433_Document.png"))); // NOI18N
        mnuItemListagem.setText("Listagem de Usúarios");
        mnuItemListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemListagemActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mnuItemListagem);

        mnuGestao.add(mnuUsuarios);

        mnuItemFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467369928_user-group.png"))); // NOI18N
        mnuItemFornecedores.setText("Fornecedores");
        mnuGestao.add(mnuItemFornecedores);

        mnuItemMercadorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemMercadorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467371138_shop-58.png"))); // NOI18N
        mnuItemMercadorias.setText("Mercadorias");
        mnuGestao.add(mnuItemMercadorias);

        mnuItemPedidosCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemPedidosCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467368733_shopping_cart.png"))); // NOI18N
        mnuItemPedidosCompras.setText("Pedidos de Compras");
        mnuGestao.add(mnuItemPedidosCompras);

        mnuEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467369754_shop-78.png"))); // NOI18N
        mnuEstoque.setText("Estoque");
        mnuGestao.add(mnuEstoque);

        mnuAbrirCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAbrirCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467370260_Cashier-2.png"))); // NOI18N
        mnuAbrirCaixa.setText("Abrir Caixa");
        mnuGestao.add(mnuAbrirCaixa);
        mnuGestao.add(jSeparator1);

        mnuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/sair.png"))); // NOI18N
        mnuItemSair.setText("Sair");
        mnuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSairActionPerformed(evt);
            }
        });
        mnuGestao.add(mnuItemSair);

        jMenuBar1.add(mnuGestao);

        mnuVendas.setText("Vendas");
        mnuVendas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(mnuVendas);

        mnuAjuda.setText("Ajuda");
        mnuAjuda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            buscarLogin();
        } catch (SistemaUsuarioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Login não efetuado!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Login não efetuado!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void habilitarDesabilitarBotoes() {
        btnAlterarSenha.setEnabled(true);
        btnLogoff.setEnabled(true);
        btnLogin.setEnabled(false);
        lblLogin.setEnabled(true);
        lblSenha.setEnabled(true);
        txtLogin.setEnabled(false);
        pwdSenha.setEnabled(false);
        lblConfirmaSenha.setEnabled(false);
        mnuUsuarios.setEnabled(false);
    }

    private void btnConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarSenhaActionPerformed
        try {
            this.confirmarSenha();
        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfirmarSenhaActionPerformed

    private void confirmarSenha() throws SQLException {
        if(pwdSenha.getText().trim().isEmpty() ||  (pwdConfirmaSenha.getText().trim().isEmpty())){
            UsuariosBO  usuarioBO = new UsuariosBO();
            usuarioBO.alterar(usuario);
        }
    }

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        this.habilitarFuncoesAlterarSenha();
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void habilitarFuncoesAlterarSenha() {
        txtLogin.setEnabled(false);
        lblLogin.setEnabled(false);
        pwdSenha.setEnabled(true);
        pwdConfirmaSenha.setEnabled(true);
        lblSenha.setEnabled(true);
        lblConfirmaSenha.setEnabled(true);
        btnAlterarSenha.setEnabled(false);
        btnConfirmarSenha.setEnabled(true);
    }


    private void mnuItemCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemCadastroActionPerformed
        TelaUsuarios telaUsuarios = new TelaUsuarios();
        telaUsuarios.setVisible(true);
    }//GEN-LAST:event_mnuItemCadastroActionPerformed

    private void mnuItemListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemListagemActionPerformed
        ListagemUsuarios listaUsuarios = new ListagemUsuarios();
        listaUsuarios.setVisible(true);
    }//GEN-LAST:event_mnuItemListagemActionPerformed

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
        this.limparCamposTelaLogoffLogin();
        desabilitarBotoes();
        habilitarDesabilitarFuncoesLogoff();
    }//GEN-LAST:event_btnLogoffActionPerformed

    private void mnuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuItemSairActionPerformed

    private void limparCamposTelaLogoffLogin() {
        this.txtLogin.setText("");
        this.pwdSenha.setText("");
    }
    
    private void buscarLogin() throws SQLException, ParseException {
        
        Usuarios usuario = new Usuarios();
        Usuarios usuarioEncontrado = null;

        String login = txtLogin.getText().trim();
        String senha = pwdSenha.getText().trim();

        usuario.setLogin(login);
        usuario.setSenha(senha);

        UsuariosBO usuarioBO = new UsuariosBO();
        usuarioEncontrado = usuarioBO.buscarLogin(usuario);
        
        if (usuarioEncontrado.getLogin().equals(usuario.getLogin()) && usuarioEncontrado.getSenha().equals(usuario.getSenha())) {
            JOptionPane.showMessageDialog(this, "Usuario logado com sucessso!", "Login", JOptionPane.INFORMATION_MESSAGE);
            habilitarDesabilitarBotoes();
                       
            if (usuarioEncontrado.getGrupoUsuario().equals("Gerente")){
                mnuUsuarios.setEnabled(true);
            }
        } else {
            throw new SenhaInvalidaException();
        }
    }

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnConfirmarSenha;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblConfirmaSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JMenuItem mnuAbrirCaixa;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuEstoque;
    private javax.swing.JMenu mnuGestao;
    private javax.swing.JMenuItem mnuItemCadastro;
    private javax.swing.JMenuItem mnuItemFornecedores;
    private javax.swing.JMenuItem mnuItemListagem;
    private javax.swing.JMenuItem mnuItemMercadorias;
    private javax.swing.JMenuItem mnuItemPedidosCompras;
    private javax.swing.JMenuItem mnuItemSair;
    private javax.swing.JMenu mnuUsuarios;
    private javax.swing.JMenu mnuVendas;
    private javax.swing.JPanel pnlTelaLogin;
    private javax.swing.JPasswordField pwdConfirmaSenha;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables

    private void habilitarDesabilitarFuncoesLogoff() {
        this.btnLogin.setEnabled(true);
        this.lblLogin.setEnabled(true);
        this.txtLogin.setEnabled(true);
    }

}
