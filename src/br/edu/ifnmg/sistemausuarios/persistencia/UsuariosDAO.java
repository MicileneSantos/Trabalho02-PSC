package br.edu.ifnmg.sistemausuarios.persistencia;

import br.edu.ifnmg.sistemausuarios.entidade.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {

    private static final String INSERT = "INSERT INTO USUARIO(NOME, LOGIN,SENHA, GRUPO_USUARIO) VALUES (?,?,?,?)";
    private static final String SELECT_TODOS = "SELECT ID, NOME, LOGIN, SENHA, GRUPO_USUARIO FROM USUARIO ORDER BY NOME";
    private static final String UPDATE = "UPDATE USUARIO SET NOME = ?,LOGIN = ? ,SENHA = ?,GRUPO_USUARIO = ? WHERE ID = ?";
    private static final String DELETE = "DELETE FROM USUARIO WHERE LOGIN =?";
    private static final String SELECT_LOGIN = "SELECT * FROM USUARIO WHERE LOGIN = ?";
    private static final String BUSCA_USUARIO_LOGIN = "SELECT * FROM USUARIO WHERE LOGIN = ?";

    public void inserir(Usuarios usuarios) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(INSERT);
            comando.setString(1, usuarios.getNome());
            comando.setString(2, usuarios.getLogin());
            comando.setString(3, usuarios.getSenha());
            comando.setString(4, usuarios.getGrupoUsuario());

            comando.execute();
            conexao.commit();

        } catch (Exception e) {
            if (conexao == null) {
                conexao.rollback();
            }
            throw e;
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }

    public List<Usuarios> buscarTodos() throws SQLException {
        List<Usuarios> listaUsuarios = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SELECT_TODOS);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Usuarios usuarios = new Usuarios();

                usuarios.setID(resultado.getInt(1));
                usuarios.setNome(resultado.getString(2));
                usuarios.setLogin(resultado.getString(3));
                usuarios.setSenha(resultado.getString(4));
                usuarios.setGrupoUsuario(resultado.getString(5));

                listaUsuarios.add(usuarios);
            }
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
        return listaUsuarios;
    }

    public void excluir(String login) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(DELETE);
            comando.setString(1, login);

            comando.execute();
            conexao.commit();
        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw e;
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }

    public void alterar(Usuarios usuarios) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(UPDATE);
            comando.setString(1, usuarios.getNome());
            comando.setString(2, usuarios.getLogin());
            comando.setString(3, usuarios.getSenha());
            comando.setString(4, usuarios.getGrupoUsuario());
            comando.setInt(5, usuarios.getID());

            comando.execute();
            conexao.commit();

        } catch (Exception e) {
            if (conexao == null) {
                conexao.rollback();
            }
            throw e;
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }

    public Usuarios buscarLogin(Usuarios usuario) throws SQLException {
        Usuarios usuarios = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SELECT_LOGIN);
            comando.setString(1, usuario.getLogin());
            resultado = comando.executeQuery();

            while (resultado.next()) {
                usuarios = new Usuarios();

                usuarios.setID(resultado.getInt(1));
                usuarios.setNome(resultado.getString(2));
                usuarios.setLogin(resultado.getString(3));
                usuarios.setSenha(resultado.getString(4));
                usuarios.setGrupoUsuario(resultado.getString(5));

            }
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
        return usuarios;
    }

    public Usuarios buscarUsuarioLogin(String login) throws SQLException {
        Usuarios usuarios = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(BUSCA_USUARIO_LOGIN);
            comando.setString(1, login);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                usuarios = new Usuarios();
                
                usuarios.setLogin(resultado.getString(1));
               
            }
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
        return usuarios;
    }

    public void alterarConfirmaSenha() {

    }

}
