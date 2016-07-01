/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemausuarios.entidade;

/**
 *
 * @author Miih Santos
 */
public class Usuarios {
    private int ID;
    private String nome;
    private String login;
    private String senha;
    private String grupoUsuario; 

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGrupoUsuario() {
        return grupoUsuario;
    }

    public void setGrupoUsuario(String grupoUsuario) {
        this.grupoUsuario = grupoUsuario;
    }

    public Object setLogin(Usuarios usuarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
