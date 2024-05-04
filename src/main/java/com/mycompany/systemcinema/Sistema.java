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
    
    //private Cliente cliente;
    //private Sessao sessao;
    //private GestaoDeFilmes gestaoDeFilmes;
    //private Carrinho carrinho;
    //private Estoque estoque;
    //private Funcionario funcionario;
    //private GestaoDeClientes gestaoDeClientes;
    
    Scanner sc = new Scanner(System.in);
    
    public void informarClienteOuFuncionarioOuProprietario(Cliente cliente, Sessao sessao, GestaoDeFilmes gestaoDeFilmes, 
            Carrinho carrinho, Estoque estoque, Funcionario funcionario, GestaoDeClientes gestaoDeClientes, Proprietario proprietario) {
        System.out.println("Você é Cliente, Funcionario ou Proprietario? ");
        String funcao = sc.nextLine();
        String loginClienteOriginal = cliente.getLoginClienteOriginal();
        String senhaClienteOriginal = cliente.getSenhaClienteOriginal();
        String loginFuncionarioOriginal = funcionario.getLoginFuncionarioOriginal();
        String senhaFuncionarioOriginal = funcionario.getSenhaFuncionarioOriginal();
        String loginProprietarioOriginal = proprietario.getLoginProprietarioOriginal();
        String senhaProprietarioOriginal = proprietario.getSenhaProprietarioOriginal();
        
        if (funcao.equals("Cliente")) {
            System.out.println("Informe o seu login: ");
            String loginCliente = sc.nextLine();
            System.out.println("Informe a sua senha: ");
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
                        funcionario, gestaoDeClientes, proprietario);
            }
        }
        else if (funcao.equals("Funcionario")) {
            System.out.println("Informe o seu login: ");
            String loginFuncionario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            String senhaFuncionario = sc.nextLine();
            
            if (loginFuncionario.equals(loginFuncionarioOriginal) && senhaFuncionario.equals(senhaFuncionarioOriginal)){
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Cadastrar Cliente, "
                        + "Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, "
                        + "Remover Produto, Listar Produtos, Selecionar Filme, Selecionar Produto, Cadastrar Funcionario");
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
                else if (acaoFuncionario.equals("Remover Produto")){
                    estoque.removerProduto();
                }
                else if (acaoFuncionario.equals("Listar Produtos")){
                    estoque.listarProdutos();
                }
                else if (acaoFuncionario.equals("Selecionar Filme")){
                    sessao.selecionarFilme(gestaoDeFilmes);
                }
                else if (acaoFuncionario.equals("Selecionar Produto")){
                    carrinho.selecionarProduto(estoque);
                }
                else if (acaoFuncionario.equals("Cadastrar Funcionario")){
                    funcionario.funcionarioRealizarCadastro();
                }
            }
            else {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque, 
                        funcionario, gestaoDeClientes, proprietario);
            }
        }
        else if (funcao.equals("Proprietario")) {
            System.out.println("Informe o seu login: ");
            String loginProprietario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            String senhaProprietario = sc.nextLine();
            
            if (loginProprietario.equals(loginProprietarioOriginal) && senhaProprietario.equals(senhaProprietarioOriginal)){
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Registrar Proprietario, Comprar Estoque, Cadastrar Cliente, "
                        + "Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, Remover Produto, Listar Produtos, Selecionar Filme, "
                        + "Selecionar Produto, Cadastrar Funcionario");
                String acaoFuncionario = sc.nextLine();
                
                if (acaoFuncionario.equals("Registrar Proprietario")){
                    proprietario.registroProprietario();
                }
                else if (acaoFuncionario.equals("Comprar Estoque")) {
                    proprietario.compraDeEstoque(estoque);
                }
                else if (acaoFuncionario.equals("Cadastrar Cliente")) {
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
                else if (acaoFuncionario.equals("Remover Produto")){
                    estoque.removerProduto();
                }
                else if (acaoFuncionario.equals("Listar Produtos")){
                    estoque.listarProdutos();
                }
                else if (acaoFuncionario.equals("Selecionar Filme")){
                    sessao.selecionarFilme(gestaoDeFilmes);
                }
                else if (acaoFuncionario.equals("Selecionar Produto")){
                    carrinho.selecionarProduto(estoque);
                }
                else if (acaoFuncionario.equals("Cadastrar Funcionario")){
                    funcionario.funcionarioRealizarCadastro();
                }
            }
            else {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque, 
                        funcionario, gestaoDeClientes, proprietario);
            }
        }
    }
}

