
package br.edu.ifnmg.sistemausuarios.apresentacao;

import br.edu.ifnmg.sistemausuarios.entidade.Usuarios;
import br.edu.ifnmg.sistemausuarios.negocio.UsuariosBO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Miih Santos
 */
public class ListagemUsuarios extends javax.swing.JFrame {

    private List<Usuarios> listaUsuarios;
   
    public ListagemUsuarios() {
        this.prepararTela();
    }

    private void prepararTela() {
        try {
            initComponents();
            this.carregarTabelaUsuario();
        } catch (Exception e) {
            System.out.println("Erro! Informe o erro ao administrador.");
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(
                    this,
                    "Erro inesperado! Informe o erro ao administrador do sistema",
                    "Consulta de usuario",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void carregarTabelaUsuario() throws SQLException {
        UsuariosBO usuariosBO = new UsuariosBO();
        listaUsuarios = usuariosBO.buscarTodos();

        ModeloTabelaUsuario modelo = new ModeloTabelaUsuario();
        tblUsuariosCadastrados.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUsuariosCadastrados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuariosCadastrados = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuários Cadastrados");

        pnlUsuariosCadastrados.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários Cadastrados"));

        tblUsuariosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tblUsuariosCadastrados);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1467371334_user_profile_edit.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/1466829915_f-cross_256.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemausuarios/apresentacao/imagens/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuariosCadastradosLayout = new javax.swing.GroupLayout(pnlUsuariosCadastrados);
        pnlUsuariosCadastrados.setLayout(pnlUsuariosCadastradosLayout);
        pnlUsuariosCadastradosLayout.setHorizontalGroup(
            pnlUsuariosCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosCadastradosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuariosCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuariosCadastradosLayout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)))
        );
        pnlUsuariosCadastradosLayout.setVerticalGroup(
            pnlUsuariosCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosCadastradosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUsuariosCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUsuariosCadastrados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUsuariosCadastrados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = this.tblUsuariosCadastrados.getSelectedRow();
            
        try { 
            Usuarios usuarioSelecionado = listaUsuarios.get(linhaSelecionada);
            
            UsuariosBO usuarioBO = new UsuariosBO();
            
            String mensagem = "Realmente deseja excluir o usuário "+usuarioSelecionado.getLogin()+"?";
            
           
            int opcao = JOptionPane.showConfirmDialog(this,
                            mensagem,
                            "Excluir usuário",
                            JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
                usuarioBO.excluir(usuarioSelecionado.getLogin());
                this.carregarTabelaUsuario();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "É necessário selecionar uma linha da tabela para poder excluir algum usuário.",
                    "Exclusão de usuário",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ListagemUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linhaSelecionada = tblUsuariosCadastrados.getSelectedRow();

        try {
            Usuarios usuarioSelecionado = listaUsuarios.get(linhaSelecionada);
                        
            String mensagem = "Realmente deseja alterar  os dados do usuário "+usuarioSelecionado.getNome()+"?";
            
            TelaUsuarios telaCadastro = new TelaUsuarios(usuarioSelecionado, this);
            telaCadastro.setVisible(true);

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione a linha da tabela que deseja alterar algum dado do usuário.",
                    "Alteração de dados do usuário",
                    JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ListagemUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlUsuariosCadastrados;
    private javax.swing.JTable tblUsuariosCadastrados;
    // End of variables declaration//GEN-END:variables

    private class ModeloTabelaUsuario extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return listaUsuarios.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public String getColumnName(int coluna) {
            if (coluna == 0) {
                return "ID";
            } else if (coluna == 1) {
                return "Nome";
            } else if (coluna == 2) {
                return "Login";
            } else{
                return "Grupo do Usuário";
            }

        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Usuarios usuarioAtual = listaUsuarios.get(rowIndex);
            if (columnIndex == 0) {
                return usuarioAtual.getID();
            } else if (columnIndex == 1) {
                return usuarioAtual.getNome();
            } else if (columnIndex == 2) {
                return usuarioAtual.getLogin();
            } else {
                return usuarioAtual.getGrupoUsuario();
            }
        }
    }

}
