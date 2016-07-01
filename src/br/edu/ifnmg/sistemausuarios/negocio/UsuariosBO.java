package br.edu.ifnmg.sistemausuarios.negocio;

import br.edu.ifnmg.sistemausuarios.apresentacao.TelaLogin;
import br.edu.ifnmg.sistemausuarios.entidade.Usuarios;
import br.edu.ifnmg.sistemausuarios.excecao.CampoObrigatorioException;
import br.edu.ifnmg.sistemausuarios.excecao.LoginExistenteException;
import br.edu.ifnmg.sistemausuarios.excecao.LoginNaoEfetuadoException;
import br.edu.ifnmg.sistemausuarios.persistencia.UsuariosDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miih Santos
 */
public class UsuariosBO {
    
    public void inserir(Usuarios usuarios) throws SQLException{     
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        this.login(usuarios);
        usuariosDAO.inserir(usuarios);
    }
    
    public void alterar(Usuarios usuarios) throws SQLException{  
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.alterar(usuarios);
    }
    
    public List<Usuarios> buscarTodos() throws SQLException{
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        return usuariosDAO.buscarTodos();
    }
    
    public Usuarios buscarLogin(Usuarios usuario) throws SQLException{
        Usuarios usuarioExistente = null;
        UsuariosDAO usuariosDAO = new UsuariosDAO();
     
        usuarioExistente = usuariosDAO.buscarLogin(usuario);
        
        if(usuarioExistente != null){
            return usuarioExistente;
        }else{
            throw new LoginNaoEfetuadoException();
        }
            
    }

    public void excluir(String login) throws SQLException{
        UsuariosDAO usuarioDAO = new UsuariosDAO();
        usuarioDAO.excluir(login);
    }

    private void login(Usuarios usuarios) throws SQLException {
        UsuariosDAO usuarioDAO = new UsuariosDAO();
        usuarioDAO.buscarUsuarioLogin(usuarios.getLogin());
        
        Usuarios usuario = new Usuarios();
        
    }

    public void alterarConfirmaSenha(Usuarios user) throws SQLException {
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.alterar(user);
    }
}
