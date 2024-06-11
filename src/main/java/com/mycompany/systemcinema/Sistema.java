/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

/**
 * Classe para gerenciar o sistema do cinema.
 * <p>
 * Esta classe contém métodos para interação com diferentes tipos de usuários,
 * como clientes, funcionários e proprietários, fornecendo opções específicas de
 * acordo com o tipo de usuário.
 * </p>
 *
 * @author Lucas
 * @version 1.0
 */
public class Sistema
{

    Scanner sc = new Scanner(System.in);

    /**
     * Método para informar ao sistema se o usuário é cliente, funcionário ou
     * proprietário, e fornecer opções de ação de acordo com o tipo de usuário.
     *
     * @param cliente O cliente que está acessando o sistema.
     * @param sessao A sessão atual do cinema.
     * @param gestaoDeFilmes O gerenciador de filmes do cinema.
     * @param carrinho O carrinho de compras do cliente.
     * @param estoque O estoque de produtos do cinema.
     * @param funcionario O funcionário que está acessando o sistema.
     * @param gestaoDeClientes O gerenciador de clientes do cinema.
     * @param proprietario O proprietário do cinema.
     */
    public void informarClienteOuFuncionarioOuProprietario(Cliente cliente, Sessao sessao, GestaoDeFilmes gestaoDeFilmes,
            Carrinho carrinho, Estoque estoque, Funcionario funcionario,
            GestaoDeClientes gestaoDeClientes, Proprietario proprietario)
    {
        System.out.println("Você é Cliente, Funcionario ou Proprietario? ");
        String funcao = sc.nextLine();
        String loginClienteOriginal = cliente.getLoginClienteOriginal();
        String senhaClienteOriginal = cliente.getSenhaClienteOriginal();
        String loginFuncionarioOriginal = funcionario.getLoginFuncionarioOriginal();
        String senhaFuncionarioOriginal = funcionario.getSenhaFuncionarioOriginal();
        String loginProprietarioOriginal = proprietario.getLoginProprietarioOriginal();
        String senhaProprietarioOriginal = proprietario.getSenhaProprietarioOriginal();

        if (funcao.equals("Cliente"))
        {
            System.out.println("Informe o seu login: ");
            String loginCliente = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            String senhaCliente = sc.nextLine();

            if (loginCliente.equals(loginClienteOriginal) && senhaCliente.equals(senhaClienteOriginal))
            {
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Selecionar Filme, Selecionar Produtos");
                String acaoCliente = sc.nextLine();

                if (acaoCliente.equals("Selecionar sessao"))
                {
                    carrinho.selecionarSessao(Sessao.listarSessoes());
                }
                else if (acaoCliente.equals("Selecionar Produtos"))
                {
                    carrinho.selecionarProdutoEQuant();
                }
                else
                {
                    System.out.println("Função não existente");
                }
            }
            else
            {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque,
                        funcionario, gestaoDeClientes, proprietario);
            }
        }
        else if (funcao.equals("Funcionario"))
        {
            System.out.println("Informe o seu login: ");
            String loginFuncionario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            String senhaFuncionario = sc.nextLine();

            if (loginFuncionario.equals(loginFuncionarioOriginal) && senhaFuncionario.equals(senhaFuncionarioOriginal))
            {
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Cadastrar Cliente, "
                        + "Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, "
                        + "Remover Produto, Listar Produtos, Selecionar Filme, Selecionar Produto, Cadastrar Funcionario");
                String acaoFuncionario = sc.nextLine();

                if (acaoFuncionario.equals("Cadastrar Cliente"))
                {
                    gestaoDeClientes.cadastroDeCliente();
                }
                else if (acaoFuncionario.equals("Editar Cadastro Cliente"))
                {
                    gestaoDeClientes.editarCadastroCliente(cliente);
                }
                else if (acaoFuncionario.equals("Cadastrar Filme"))
                {
                    System.out.println("informe o nome do filme que deseja cadastrar: ");
                    String nomeFilme = sc.nextLine();
                    System.out.println("informe o nome genero desse filme : ");
                    String generoFilme = sc.nextLine();
                    String duracao = sc.nextLine();
                    Duration duracaoFilme = Duration.parse(duracao);

                    gestaoDeFilmes.cadastraFilme(nomeFilme, generoFilme, duracaoFilme);
                }
                else if (acaoFuncionario.equals("Remover Filmes"))
                {
                    System.out.println("informe o nome do filme que deseja remover: ");
                    String nomeFilme = sc.nextLine();
                    gestaoDeFilmes.removeFilme(nomeFilme);
                }
                else if (acaoFuncionario.equals("Remover Produto"))
                {
                    System.out.println("informe o nome produto que deseja remover: ");
                    String nomeProduto = sc.nextLine();
                    estoque.removerProduto(nomeProduto);
                }
                else if (acaoFuncionario.equals("Listar Produtos"))
                {
                    estoque.listarProdutosDisponiveis();
                }
                else if (acaoFuncionario.equals("Selecionar Filme"))
                {
                    carrinho.selecionarSessao(Sessao.listarSessoes());
                }
                else if (acaoFuncionario.equals("Selecionar Produto"))
                {
                    carrinho.selecionarProdutoEQuant();
                }
                else if (acaoFuncionario.equals("Cadastrar Funcionario"))
                {
                    funcionario.funcionarioRealizarCadastro();
                }
                else
                {
                    System.out.println("Função não existente");
                }
            }
            else
            {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque,
                        funcionario, gestaoDeClientes, proprietario);
            }
        }
        else if (funcao.equals("Proprietario"))
        {
            System.out.println("Informe o seu login: ");
            String loginProprietario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            String senhaProprietario = sc.nextLine();

            if (loginProprietario.equals(loginProprietarioOriginal) && senhaProprietario.equals(senhaProprietarioOriginal))
            {
                System.out.println("Bem vindo ao CineDjamas!\n Escolha a sua ação: Registrar Proprietario, Comprar Estoque, Cadastrar Cliente, "
                        + "Editar Cadastro Cliente, Cadastrar Filmes, Remover Filmes, Remover Produto, Listar Produtos, Selecionar Filme, "
                        + "Selecionar Produto, Cadastrar Funcionario");
                String acaoFuncionario = sc.nextLine();

                if (acaoFuncionario.equals("Registrar Proprietario"))
                {
                    proprietario.registroProprietario();
                }
                else if (acaoFuncionario.equals("Comprar Estoque"))
                {
                    proprietario.compraDeEstoque(estoque);
                }
                else if (acaoFuncionario.equals("Cadastrar Cliente"))
                {
                    gestaoDeClientes.cadastroDeCliente();
                }
                else if (acaoFuncionario.equals("Editar Cadastro Cliente"))
                {
                    gestaoDeClientes.editarCadastroCliente(cliente);
                }
                else if (acaoFuncionario.equals("Cadastrar Filme"))
                {
                    System.out.println("informe o nome do filme que deseja cadastrar: ");
                    String nomeFilme = sc.nextLine();
                    System.out.println("informe o nome genero desse filme : ");
                    String generoFilme = sc.nextLine();
                    String duracao = sc.nextLine();
                    Duration duracaoFilme = Duration.parse(duracao);

                    gestaoDeFilmes.cadastraFilme(nomeFilme, generoFilme, duracaoFilme);
                }
                else if (acaoFuncionario.equals("Remover Filmes"))
                {
                    System.out.println("informe o nome filme que deseja remover: ");
                    String nomeFilme = sc.nextLine();
                    estoque.removerProduto(nomeFilme);
                }
                else if (acaoFuncionario.equals("Remover Produto"))
                {
                    System.out.println("informe o nome produto que deseja remover: ");
                    String nomeProduto = sc.nextLine();
                    estoque.removerProduto(nomeProduto);

                }
                else if (acaoFuncionario.equals("Listar Produtos"))
                {
                    estoque.listarProdutosDisponiveis();
                }
                else if (acaoFuncionario.equals("Selecionar Filme"))
                {

                    carrinho.selecionarSessao(Sessao.listarSessoes());
                }
                else if (acaoFuncionario.equals("Selecionar Produto"))
                {
                    carrinho.selecionarProdutoEQuant();
                }
                else if (acaoFuncionario.equals("Cadastrar Funcionario"))
                {
                    funcionario.funcionarioRealizarCadastro();
                }
                else
                {
                    System.out.println("Função não existente");
                }
            }
            else
            {
                System.out.println("Login ou senha incorretos.");
                informarClienteOuFuncionarioOuProprietario(cliente, sessao, gestaoDeFilmes, carrinho, estoque,
                        funcionario, gestaoDeClientes, proprietario);
            }
        }
    }
    
    public void vendaPadrao(Cliente cliente, Funcionario funcionario, Proprietario proprietario, Sessao sessao, 
                            GestaoDeFilmes gestaoDeFilmes, Caixa caixa) {
        Scanner sc = new Scanner(System.in);
        
        Estoque estoque = new Estoque();
        Carrinho carrinho = new Carrinho(estoque);

        Caixa.inicializarBalcoes(estoque);
        Caixa[] balcoes = Caixa.getBalcoes();
        
        System.out.println("Você é Cliente, Funcionario ou Proprietario? ");
        String funcao = sc.nextLine();
        
        gestaoDeFilmes.cadastraFilme("Titanic", "Acao", Duration.ofMinutes(120));
        gestaoDeFilmes.cadastraFilme("Procurando Nemo", "Animacao", Duration.ofMinutes(90));
        gestaoDeFilmes.cadastraFilme("Avatar", "Ficcao Cientifica", Duration.ofMinutes(150));
        gestaoDeFilmes.cadastraFilme("Matrix", "Ficcao Cientifica", Duration.ofMinutes(136));
        gestaoDeFilmes.cadastraFilme("Interestelar", "Ficcao Cientifica", Duration.ofMinutes(169));
        
        List<Filme> filmes = gestaoDeFilmes.getFilmes();
        
        Sala sala1 = new Sala(1, filmes.get(0));
        Sala sala2 = new Sala(2, filmes.get(1));
        Sala sala3 = new Sala(3, filmes.get(2));
        Sala sala4 = new Sala(4, filmes.get(3));
        Sala sala5 = new Sala(5, filmes.get(4));

        for (Sala sala : Sala.listarSalas()) {
            System.out.println(sala);
        }

        Sessao.criarSessao(filmes.get(0), sala1, LocalDateTime.of(2024, 5, 20, 14, 0));
        Sessao.criarSessao(filmes.get(0), sala1, LocalDateTime.of(2024, 5, 20, 17, 0));
        Sessao.criarSessao(filmes.get(0), sala1, LocalDateTime.of(2024, 5, 20, 21, 0));
        Sessao.criarSessao(filmes.get(1), sala2, LocalDateTime.of(2024, 5, 20, 13, 0));
        Sessao.criarSessao(filmes.get(1), sala2, LocalDateTime.of(2024, 5, 20, 16, 0));
        Sessao.criarSessao(filmes.get(2), sala3, LocalDateTime.of(2024, 5, 20, 16, 0));
        Sessao.criarSessao(filmes.get(3), sala4, LocalDateTime.of(2024, 5, 20, 17, 0));
        Sessao.criarSessao(filmes.get(4), sala5, LocalDateTime.of(2024, 5, 20, 18, 0));

        List<Sessao> sessoes = Sessao.listarSessoes();
        if (sessoes != null) {
            for (Sessao s : sessoes) {
                System.out.println(s);
            }
        } else {
            System.out.println("Nenhuma sessão disponível.");
        }
        
        estoque.cadastrarProduto("Pipoca", LocalDate.of(2024, 12, 31),10);
        estoque.cadastrarProduto("Guloseima", LocalDate.of(2024, 10, 31),6);
        estoque.cadastrarProduto("Bebida", LocalDate.of(2024, 11, 30), 8);
        
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
                System.out.println("Bem vindo ao CineDjamas!");
 
                carrinho.selecionarSessao(sessoes);
                System.out.println("Sessão selecionada no carrinho: " + carrinho.getSessao());  // Depuração
                carrinho.selecionarPoltronas();
                carrinho.selecionarProdutoEQuant();
                Sessao sessaoSelecionada = carrinho.getSessao();
                System.out.println("Sessão final no carrinho: " + sessaoSelecionada);  // Depuração

                System.out.println(carrinho.toString());
                caixa.informarValorIngresso(10);
                System.out.println("Valor total ingressos: " + caixa.valorTotalIngressos());
                System.out.println("Valor total produtos: " + caixa.valorTotalProdutos());
                System.out.println("Valor total compra: " + caixa.valorTotalCompra());

                System.out.println("Efetuar pagamento ou Cancelar compra?");
                String pagamento = sc.nextLine();
                if (pagamento.equalsIgnoreCase("Efetuar pagamento")) {
                    caixa.efetuarPagamento(cliente);
                } else if (pagamento.equalsIgnoreCase("Cancelar compra")) {
                    caixa.cancelarPagamento();
                } else {
                    System.out.println("Opção invalida.");
                }
                caixa.extratoVenda();
            } else {
                System.out.println("Login ou senha incorretos.");
                vendaPadrao(cliente, funcionario, proprietario, sessao, gestaoDeFilmes, caixa);
            }
        }
    }
}