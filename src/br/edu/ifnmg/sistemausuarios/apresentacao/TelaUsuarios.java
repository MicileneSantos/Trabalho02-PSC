package br.edu.ifnmg.sistemausuarios.apresentacao;


import br.edu.ifnmg.sistemausuarios.entidade.Usuarios;
import br.edu.ifnmg.sistemausuarios.excecao.CampoObrigatorioException;
import br.edu.ifnmg.sistemausuarios.excecao.SistemaUsuarioException;
import br.edu.ifnmg.sistemausuarios.negocio.UsuariosBO;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miih Santos
 */
public class TelaUsuarios extends javax.swing.JFrame {
    
    private Usuarios usuario;
    private Usuarios filtro;
    private List<Usuarios> listaUsuarios;
    private Usuarios pesquisaUsuario;
    private boolean usuariosParaEdicao;
    private ListagemUsuarios listagemUsuarios;
       
    public TelaUsuarios() {
        usuario = new Usuarios();
        initComponents();
    }

    public TelaUsuarios(Usuarios usuarioSelecionado, ListagemUsuarios listaUsuarios) {    
        usuario = usuarioSelecionado;
        initComponents();
        this.inicializarCamposTela();
        usuariosParaEdicao = true;
        this.listagemUsuarios = listaUsuarios;
        
    }
    
    
    
    private void inicializarCamposTela() {
        this.txtNome.setText(this.usuario.getNome());  
        this.txtLogin.setText(this.usuario.getLogin());
        this.pwdSenha.setText(this.usuario.getSenha());
        
        if (usuario.getGrupoUsuario().equals("Gerente")){
            chbGerente.setSelected(true);
        }else if(usuario.getGrupoUsuario().equals("Gestor de Compras")){
            chbGestorCompras.setSelected(true);
        }else if(usuario.getGrupoUsuario().equals("Gestor de Estoque")){
            chbGestorEstoque.setSelected(true);
        }else {
            chbCaixeiro.setSelected(true);
        }
    }
    
    private void limparCamposTela() {
        this.txtNome.setText("");
        this.txtLogin.setText("");
        this.pwdSenha.setText("");
        
        if(chbGerente.isSelected()){
            chbGerente.setSelected(false);
        }else if(chbGestorCompras.isSelected()){
            chbGestorCompras.setSelected(false);
        }else if(chbGestorEstoque.isSelected()){
            chbGestorEstoque.setSelected(false);
        }else{
            chbCaixeiro.setSelected(false);
        }
        
    }
    
    private void recuperarCamposTela() throws ParseException {
        if (!txtNome.getText().trim().equals("")) {
            usuario.setNome(txtNome.getText().trim());
        }else {
            throw new CampoObrigatorioException();
        }
        
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
        
        if (chbGerente.isSelected()) {
           usuario.setGrupoUsuario("Gerente");
        } else if (chbGestorCompras.isSelected()) {
            usuario.setGrupoUsuario("Gestor de Compras");
        }else if(chbGestorEstoque.isSelected()){
            usuario.setGrupoUsuario("Gestor de Estoque");
        }else{
            usuario.setGrupoUsuario("Caixeiro");
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTelaUsuarios = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pnlGestaoUsuarios = new javax.swing.JPanel();
        chbGerente = new javax.swing.JCheckBox();
        chbGestorEstoque = new javax.swing.JCheckBox();
        chbGestorCompras = new javax.swing.JCheckBox();
        chbCaixeiro = new javax.swing.JCheckBox();
        btnNovo = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        pwdSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Usuários");

        pnlTelaUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Usuários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        lblNome.setText("* Nome:");

        lblLogin.setText("* Login:");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        lblSenha.setText("* Senha:");

        pnlGestaoUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Gestão do Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        pnlGestaoUsuarios.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        chbGerente.setText("Gerente");
        chbGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbGerenteActionPerformed(evt);
            }
        });

        chbGestorEstoque.setText("Gestor de Estoque");
        chbGestorEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbGestorEstoqueActionPerformed(evt);
            }
        });

        chbGestorCompras.setText("Gestor de Compras");

        chbCaixeiro.setText("Caixeiro");

        javax.swing.GroupLayout pnlGestaoUsuariosLayout = new javax.swing.GroupLayout(pnlGestaoUsuarios);
        pnlGestaoUsuarios.setLayout(pnlGestaoUsuariosLayout);
        pnlGestaoUsuariosLayout.setHorizontalGroup(
            pnlGestaoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestaoUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGestaoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chbGestorEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlGestaoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbGestorCompras)
                    .addComponent(chbCaixeiro))
                .addGap(101, 101, 101))
        );
        pnlGestaoUsuariosLayout.setVerticalGroup(
            pnlGestaoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestaoUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGestaoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbGerente)
                    .addComponent(chbGestorCompras))
                .addGap(18, 18, 18)
                .addGroup(pnlGestaoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbGestorEstoque)
                    .addComponent(chbCaixeiro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1466829856_search_magnifying_glass_find.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1466829766_floppy_disk_save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1466905368_editor-trash-delete-recycle-bin-glyph.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1466829915_f-cross_256.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("* Campos de preechimento obrigatório.");

        javax.swing.GroupLayout pnlTelaUsuariosLayout = new javax.swing.GroupLayout(pnlTelaUsuarios);
        pnlTelaUsuarios.setLayout(pnlTelaUsuariosLayout);
        pnlTelaUsuariosLayout.setHorizontalGroup(
            pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaUsuariosLayout.createSequentialGroup()
                        .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlGestaoUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTelaUsuariosLayout.createSequentialGroup()
                                .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome)
                                    .addComponent(pwdSenha)
                                    .addComponent(txtLogin))))
                        .addGap(16, 16, 16))
                    .addGroup(pnlTelaUsuariosLayout.createSequentialGroup()
                        .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTelaUsuariosLayout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFechar))
                            .addComponent(jLabel1)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlTelaUsuariosLayout.setVerticalGroup(
            pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addGap(9, 9, 9)
                .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGestaoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlTelaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        desabilitarBotao();
        if(usuariosParaEdicao){
            this.editar();
        }else{
            this.salvar();
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    
    private void editar(){
        try {
            this.recuperarCamposTela();

            UsuariosBO usuariosBO = new UsuariosBO();
            usuariosBO.alterar(usuario);

            JOptionPane.showMessageDialog(this,
                    "Usuario alterado com sucesso!",
                    "Alteração de usuario",
                    JOptionPane.INFORMATION_MESSAGE);

            this.dispose();
            this.listagemUsuarios.carregarTabelaUsuario();
            
        }catch(SistemaUsuarioException e){
            JOptionPane.showMessageDialog(
                    this,
                    e.getMessage(),
                    "Alteração de usuario",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        catch (Exception e) {
            System.out.println("Erro ao tentar Alterar! Informe o erro ao administrador.");
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao tentar alterar dados do usuário! \nInforme o erro ao administrador do sistema",
                    "Alteração de usuario",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    
    private void salvar(){
    try {
            this.validarCamposObrigatorios();
            this.recuperarCamposTela();          
    
            UsuariosBO usuariosBO = new UsuariosBO();
            usuariosBO.inserir(usuario);

            JOptionPane.showMessageDialog(this,
                    "Usuario cadastrado com sucesso!",
                    "Cadastro de usuario",
                    JOptionPane.INFORMATION_MESSAGE);

            this.limparCamposTela();
        }catch(SistemaUsuarioException e){
            JOptionPane.showMessageDialog(
                    this,
                    e.getMessage(),
                    "Cadastro de usuario",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        catch (Exception e) {
            System.out.println("Erro inesperado! Informe o erro ao administrador.");
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(
                    this,
                    "Erro inesperado! Informe o erro ao administrador do sistema",
                    "Cadastro de usuario",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void desabilitarBotao() {
        btnSalvar.setEnabled(false);
    }
    
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            this.pesquisarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limparCamposTela();
        this.dispose();
        TelaUsuarios  cadastro= new TelaUsuarios();
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try { 
                      
            UsuariosBO usuarioBO = new UsuariosBO();
            
            String mensagem = "Realmente deseja excluir o usuário?";
            try {
                usuarioBO.excluir(usuario.getLogin());
            } catch (SQLException ex) {
                Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
            int opcao = JOptionPane.showConfirmDialog(this,
                            mensagem,
                            "Excluir usuário",
                            JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                        this,
                        "Usuário Excluido com sucesso!.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "",
                    "Exclusão de usuário",
                    JOptionPane.INFORMATION_MESSAGE);
        }  
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void chbGestorEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbGestorEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbGestorEstoqueActionPerformed

    private void chbGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbGerenteActionPerformed
       
    }//GEN-LAST:event_chbGerenteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chbCaixeiro;
    private javax.swing.JCheckBox chbGerente;
    private javax.swing.JCheckBox chbGestorCompras;
    private javax.swing.JCheckBox chbGestorEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlGestaoUsuarios;
    private javax.swing.JPanel pnlTelaUsuarios;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void carregaTabelaUsuario() {
        UsuariosBO usuarioBO = new UsuariosBO();
        
        try {
            if(filtro == null){
                this.listaUsuarios = usuarioBO.buscarTodos();
            }
            else{
                this.listaUsuarios = usuarioBO.buscarTodos();
            }
        } catch (Exception e) {
        }
    }

    private void pesquisarUsuario() throws SQLException {
        Usuarios usuarioBuscado = new Usuarios();
       
        String login = txtLogin.getText().trim();

        usuarioBuscado.setLogin(login);

        UsuariosBO usuarioBO = new UsuariosBO();
        usuario = usuarioBO.buscarLogin(usuarioBuscado);
        inicializarCamposTela();
        
    }

    private void validarCamposObrigatorios() {
        if (txtLogin.getText().trim().isEmpty()){
            throw new CampoObrigatorioException();
        }
    }
}
