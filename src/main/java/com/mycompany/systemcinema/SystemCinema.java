/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemcinema;

import java.time.Duration;

/**
 *
 * @author Lucas
 */
public class SystemCinema {
    
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Cliente cliente = new Cliente();
        Sessao sessao = new Sessao();
        GestaoDeFilmes gestaoDeFilmes = new GestaoDeFilmes();
        Estoque estoque = new Estoque();
        Funcionario funcionario = new Funcionario();
        GestaoDeClientes gestaoDeClientes = new GestaoDeClientes();
        Carrinho carrinho = new Carrinho();
        Proprietario proprietario = new Proprietario();
        
        sistema.informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque, funcionario, 
                gestaoDeClientes, proprietario);
    }
}
