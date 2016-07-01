/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemausuarios.excecao;

/**
 *
 * @author Miih Santos
 */
public class SenhaInvalidaException extends SistemaUsuarioException{

    public SenhaInvalidaException() {
        super("Senha inválida!");
    }
    
}
