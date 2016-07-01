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
public class CampoObrigatorioException extends SistemaUsuarioException {

    public CampoObrigatorioException() {
        super("Campo obrigatório não preenchido! \nPor favor, preencha todos os campos.");
    }
    
}
