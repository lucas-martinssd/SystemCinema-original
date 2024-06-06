/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.util.Scanner;

/**
 * Classe para gerenciar o sistema do cinema.
 * <p>
 * Esta classe contém métodos para interação com diferentes tipos de usuários, como clientes, funcionários e proprietários,
 * fornecendo opções específicas de acordo com o tipo de usuário.
 * </p>
 *
 * @author Lucas
 * @version 1.0
 */
public class Sistema {

    Scanner sc = new Scanner(System.in);

    /**
     * Método para informar ao sistema se o usuário é cliente, funcionário ou proprietário, e fornecer opções de ação de acordo com o tipo de usuário.
     *
     * @param cliente          O cliente que está acessando o sistema.
     * @param sessao           A sessão atual do cinema.
     * @param gestaoDeFilmes   O gerenciador de filmes do cinema.
     * @param carrinho         O carrinho de compras do cliente.
     * @param estoque          O estoque de produtos do cinema.
     * @param funcionario      O funcionário que está acessando o sistema.
     * @param gestaoDeClientes O gerenciador de clientes do cinema.
     * @param proprietario     O proprietário do cinema.
     */
    public void informarClienteOuFuncionarioOuProprietario(Cliente cliente, Sessao sessao, GestaoDeFilmes gestaoDeFilmes,
                                                           Carrinho carrinho, Estoque estoque, Funcionario funcionario,
                                                           GestaoDeClientes gestaoDeClientes, Proprietario proprietario) {
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

            if (loginCliente.equals(loginClienteOriginal) && senhaCliente.equals(senhaClienteOriginal)) {
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Selecionar Filme, Selecionar Produtos");
                String acaoCliente = sc.nextLine();

                if (acaoCliente.equals("Selecionar Filme")) {
                    carrinho.selecionarFilme(gestaoDeFilmes);
                } else if (acaoCliente.equals("Selecionar Produtos")) {
                    carrinho.selecionarProduto(estoque);
                } else {
                    System.out.println("Função não existente");
                }
            } else {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque,
                        funcionario, gestaoDeClientes, proprietario);
            }
        } else if (funcao.equals("Funcionario")) {
            System.out.println("Informe o seu login: ");
            String loginFuncionario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            String senhaFuncionario = sc.nextLine();

            if (loginFuncionario.equals(loginFuncionarioOriginal) && senhaFuncionario.equals(senhaFuncionarioOriginal)) {
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Cadastrar Cliente, "
                        + "Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, "
                        + "Remover Produto, Listar Produtos, Selecionar Filme, Selecionar Produto, Cadastrar Funcionario");
                String acaoFuncionario = sc.nextLine();

                if (acaoFuncionario.equals("Cadastrar Cliente")) {
                    gestaoDeClientes.cadastroDeCliente();
                } else if (acaoFuncionario.equals("Editar Cadastro Cliente")) {
                    gestaoDeClientes.editarCadastroCliente(cliente);
                } else if (acaoFuncionario.equals("Cadastrar Filme")) {
                    gestaoDeFilmes.cadastraFilme();
                } else if (acaoFuncionario.equals("Remover Filmes")) {
                    gestaoDeFilmes.removeFilme();
                } else if (acaoFuncionario.equals("Remover Produto")) {
                    estoque.removerProduto();
                } else if (acaoFuncionario.equals("Listar Produtos")) {
                    estoque.listarProdutos();
                } else if (acaoFuncionario.equals("Selecionar Filme")) {
                    carrinho.selecionarFilme(gestaoDeFilmes);
                } else if (acaoFuncionario.equals("Selecionar Produto")) {
                    carrinho.selecionarProduto(estoque);
                } else if (acaoFuncionario.equals("Cadastrar Funcionario")) {
                    funcionario.funcionarioRealizarCadastro();
                } else {
                    System.out.println("Função não existente");
                }
            } else {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque,
                        funcionario, gestaoDeClientes, proprietario);
            }
        } else if (funcao.equals("Proprietario")) {
            System.out.println("Informe o seu login: ");
            String loginProprietario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            String senhaProprietario = sc.nextLine();

            if (loginProprietario.equals(loginProprietarioOriginal) && senhaProprietario.equals(senhaProprietarioOriginal)) {
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Registrar Proprietario, Comprar Estoque, Cadastrar Cliente, "
                        + "Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, Remover Produto, Listar Produtos, Selecionar Filme, "
                        + "Selecionar Produto, Cadastrar Funcionario");
                String acaoFuncionario = sc.nextLine();

                if (acaoFuncionario.equals("Registrar Proprietario")) {
                    proprietario.registroProprietario();
                } else if (acaoFuncionario.equals("Comprar Estoque")) {
                    proprietario.compraDeEstoque(estoque);
                } else if (acaoFuncionario.equals("Cadastrar Cliente")) {
                    gestaoDeClientes.cadastroDeCliente();
                } else if (acaoFuncionario.equals("Editar Cadastro Cliente")) {
                    gestaoDeClientes.editarCadastroCliente(cliente);
                } else if (acaoFuncionario.equals("Cadastrar Filme")) {
                    gestaoDeFilmes.cadastraFilme();
                } else if (acaoFuncionario.equals("Remover Filmes")) {
                    gestaoDeFilmes.removeFilme();
                } else if (acaoFuncionario.equals("Remover Produto")) {
                    estoque.removerProduto();
                } else if (acaoFuncionario.equals("Listar Produtos")) {
                    estoque.listarProdutos();
                } else if (acaoFuncionario.equals("Selecionar Filme")) {
                    carrinho.selecionarFilme(gestaoDeFilmes);
                } else if (acaoFuncionario.equals("Selecionar Produto")) {
                    carrinho.selecionarProduto(estoque);
                } else if (acaoFuncionario.equals("Cadastrar Funcionario")) {
                    funcionario.funcionarioRealizarCadastro();
                } else {
                    System.out.println("Função não existente");
                }
            } else {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque,
                        funcionario, gestaoDeClientes, proprietario);
            }
        }
    }
    public void informarClienteOuFuncionarioOuProprietario(Pessoa pessoa, Carrinho carrinho, Caixa caixa, Estoque estoque, GestaoDeFilmes gestaoDeFilmes, GestaoDeClientes gestaoDeClientes, Proprietario proprietario, Cliente cliente) {
        if (pessoa.getCategoria().equals("Cliente")) {
            acessarCarrinhoOuCaixa(pessoa, carrinho, caixa, gestaoDeFilmes, estoque);
        } else if (pessoa.getCategoria().equals("Funcionario")) {
            acessarFuncionario(pessoa, carrinho, caixa, estoque, gestaoDeFilmes, gestaoDeClientes, cliente);
        } else if (pessoa.getCategoria().equals("Proprietario")) {
            acessarProprietario(pessoa, carrinho, caixa, estoque, gestaoDeFilmes, gestaoDeClientes, proprietario, cliente);
        }
    }

    private void acessarCarrinhoOuCaixa(Pessoa pessoa, Carrinho carrinho, Caixa caixa, GestaoDeFilmes gestaoDeFilmes, Estoque estoque) {
        System.out.println("Bem vindo ao CineDjamas! Escolha a sua ação: Carrinho ou Caixa");
        String acaoCliente = sc.nextLine();

        if (acaoCliente.equals("Carrinho")) {
            // Lógica para acessar o carrinho
            carrinho.selecionarFilme(gestaoDeFilmes); // Exemplo de método do carrinho
            carrinho.selecionarPoltronas(0,0);
            carrinho.selecionarProduto(estoque);
            carrinho.selecionarQuantIngressos();
            carrinho.selecionarQuantProduto();
            
        } else if (acaoCliente.equals("Caixa")) {
            // Lógica para acessar o caixa
            caixa.informaValorIngressos(carrinho); // Exemplo de método do caixa
            caixa.informaValorProdutos(carrinho);
            caixa.realizaPagamento(carrinho);
            caixa.cancelaPagamento();
        } else {
            System.out.println("Função não existente");
        }
    }

    private void acessarFuncionario(Pessoa pessoa, Carrinho carrinho, Caixa caixa, Estoque estoque, GestaoDeFilmes gestaoDeFilmes, GestaoDeClientes gestaoDeClientes, Cliente cliente) {
        System.out.println("Bem vindo ao CineDjamas! Escolha a sua ação: Cadastrar Cliente, Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, Remover Produto, Listar Produtos, Selecionar Filme, Selecionar Produto, Cadastrar Funcionario, Carrinho ou Caixa");
        String acaoFuncionario = sc.nextLine();

        switch (acaoFuncionario) {
            case "Cadastrar Cliente":
                gestaoDeClientes.cadastroDeCliente();
                break;
            case "Editar Cadastro Cliente":
                gestaoDeClientes.editarCadastroCliente(cliente);
                break;
            case "Cadastrar Filme":
                gestaoDeFilmes.cadastraFilme();
                break;
            case "Remover Filmes":
                gestaoDeFilmes.removeFilme();
                break;
            case "Remover Produto":
                estoque.removerProduto();
                break;
            case "Listar Produtos":
                estoque.listarProdutos();
                break;
            case "Selecionar Filme":
                carrinho.selecionarFilme(gestaoDeFilmes);
                break;
            case "Selecionar Produto":
                carrinho.selecionarProduto(estoque);
                break;
            case "Cadastrar Funcionario":
                // Lógica para cadastrar funcionário
                break;
            case "Carrinho":
                acessarCarrinhoOuCaixa(pessoa, carrinho, caixa, gestaoDeFilmes, estoque);
                break;
            case "Caixa":
                acessarCarrinhoOuCaixa(pessoa, carrinho, caixa, gestaoDeFilmes, estoque);
                break;
            default:
                System.out.println("Função não existente");
                break;
        }
    }

    private void acessarProprietario(Pessoa pessoa, Carrinho carrinho, Caixa caixa, Estoque estoque, GestaoDeFilmes gestaoDeFilmes, GestaoDeClientes gestaoDeClientes, Proprietario proprietario, Cliente cliente) {
        System.out.println("Bem vindo ao CineDjamas! Escolha a sua ação: Registrar Proprietario, Comprar Estoque, Cadastrar Cliente, Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, Remover Produto, Listar Produtos, Selecionar Filme, Selecionar Produto, Cadastrar Funcionario, Carrinho ou Caixa");
        String acaoProprietario = sc.nextLine();

        switch (acaoProprietario) {
            case "Registrar Proprietario":
                proprietario.registroProprietario();
                break;
            case "Comprar Estoque":
                proprietario.compraDeEstoque(estoque);
                break;
            case "Cadastrar Cliente":
                gestaoDeClientes.cadastroDeCliente();
                break;
            case "Editar Cadastro Cliente":
                gestaoDeClientes.editarCadastroCliente(cliente);
                break;
            case "Cadastrar Filme":
                gestaoDeFilmes.cadastraFilme();
                break;
            case "Remover Filmes":
                gestaoDeFilmes.removeFilme();
                break;
            case "Remover Produto":
                estoque.removerProduto();
                break;
            case "Listar Produtos":
                estoque.listarProdutos();
                break;
            case "Selecionar Filme":
                carrinho.selecionarFilme(gestaoDeFilmes);
                break;
            case "Selecionar Produto":
                carrinho.selecionarProduto(estoque);
                break;
            case "Cadastrar Funcionario":
                // Lógica para cadastrar funcionário
                break;
            case "Carrinho":
                acessarCarrinhoOuCaixa(pessoa, carrinho, caixa, gestaoDeFilmes, estoque);
                break;
            case "Caixa":
                acessarCarrinhoOuCaixa(pessoa, carrinho, caixa, gestaoDeFilmes, estoque);
                break;
            default:
                System.out.println("Função não existente");
                break;
        }
    }
}

