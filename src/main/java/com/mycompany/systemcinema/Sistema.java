/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.Duration;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Sistema {
    
    private Cliente cliente;
    private Sessao sessao;
    private GestaoDeFilmes gestaoDeFilmes;
    private Carrinho carrinho;
    private Estoque estoque;
    private Funcionario funcionario;
    private GestaoDeClientes gestaoDeClientes;
    
    Scanner sc = new Scanner(System.in);
    
    public void informarClienteOuFuncionarioOuProprietario(Cliente cliente, Sessao sessao, GestaoDeFilmes gestaoDeFilmes, 
            Carrinho carrinho, Estoque estoque, GestaoDeClientes gestaoDeClientes) {
        System.out.println("Você é Cliente, Funcionario ou Proprietario? ");
        String funcao = sc.nextLine();
        String loginClienteOriginal = cliente.getLoginClienteOriginal();
        String senhaClienteOriginal = cliente.getSenhaClienteOriginal();
        String loginFuncionarioOriginal = funcionario.getLoginFuncionarioOriginal();
        String senhaFuncionarioOriginal = funcionario.getSenhaFuncionarioOriginal();
        
        if (funcao.equals("Cliente")) {
            System.out.println("Informe o seu login: ");
            String loginCliente = sc.nextLine();
            System.out.println("informe a sua senha: ");
            String senhaCliente = sc.nextLine();
            
            if (loginCliente.equals(loginClienteOriginal) && senhaCliente.equals(senhaClienteOriginal)){
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Selecionar Filme, Selecionar Produtos");
                String acaoCliente = sc.nextLine();
                
                if (acaoCliente.equals("Selecionar Filme")){
                    sessao.selecionarFilme(gestaoDeFilmes);
                }
                else {
                    carrinho.selecionarProduto(estoque);
                }
            }
            else {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque, 
                        gestaoDeClientes);
            }
        }
        else if (funcao.equals("Funcionario")) {
            System.out.println("Informe o seu login: ");
            String loginFuncionario = sc.nextLine();
            System.out.println("informe a sua senha: ");
            String senhaFuncionario = sc.nextLine();
            
            if (loginFuncionario.equals(loginFuncionarioOriginal) && senhaFuncionario.equals(senhaFuncionarioOriginal)){
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Cadastrar Cliente, "
                        + "Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, Cadastrar Produto,"
                        + "Remover Produto, Listar Produto, Selecionar Filme, Selecionar Produto");
                String acaoFuncionario = sc.nextLine();
                
                if (acaoFuncionario.equals("Cadastrar Cliente")) {
                    gestaoDeClientes.cadastroDeCliente(cliente);
                }
                else if (acaoFuncionario.equals("Editar Cadastro Cliente")){
                    gestaoDeClientes.editarCadastroCliente(cliente);
                }
                else if (acaoFuncionario.equals("Cadastrar Filme")){
                    gestaoDeFilmes.cadastraFilme();
                }
                else if (acaoFuncionario.equals("Remover Filmes")){
                    gestaoDeFilmes.removeFilme();
                }
            }
        }
    }
}
