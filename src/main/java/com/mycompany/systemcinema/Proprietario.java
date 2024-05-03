/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Proprietario extends Funcionario{
    
    
    //Arrumar herança entre Funcionario e Proprietario, colocar Proprietario como composição de Gestão de Clientes tambem
    //Colocar função registroProprietario
    private String loginProprietario;
    private String senhaProprietario;
    private String senhaProprietarioOriginal;
    private String loginProprietarioOriginal;
    private Estoque estoque;
      
    public Proprietario(){};
    
    public Proprietario(String loginProprietario, String senhaProprietario, String senhaProprietarioOriginal, String loginProprietarioOriginal, String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
        this.loginProprietario = loginProprietario;
        this.senhaProprietario = senhaProprietario;
        this.senhaProprietarioOriginal = senhaProprietarioOriginal;
        this.loginProprietarioOriginal = loginProprietarioOriginal;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public String proprietarioEntrarNoSistema(){
        String bemVindo = "Bem vindo ao Funcionario";
        return bemVindo;
    }
    
    public void proprietarioRealizarLogin(){
        boolean loginValido = false;
        while (!loginValido) {
            System.out.println("Informe o seu login: ");
            loginProprietario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            senhaProprietario = sc.nextLine();

            if(loginProprietario.equals(loginProprietarioOriginal) && senhaProprietario.equals(senhaProprietarioOriginal)){
                loginValido = true;
                System.out.println("Bem vindo ao CineDjamas proprietario");
            }
            else {
                System.out.println("Login ou senha incorretos. Tente novamente");
            }    
        }
    }
    
    public void registroProprietario(){
        System.out.println("Qual o seu nome: ");
        String name = sc.nextLine();
        setName(name);
        
        System.out.println("Qual o seu sobrenome: ");
        String sobrenome = sc.nextLine();
        setSobrenome(sobrenome);
        
        System.out.println("Qual o seu endereço: ");
        String endereco = sc.nextLine();
        setEndereco(endereco);
        
        System.out.println("Qual o seu telefone: ");
        String telefone = sc.nextLine();
        setTelefone(telefone);
        
        System.out.println("Qual o seu cpf: ");
        String cpf = sc.nextLine();
        setCpf(cpf);
        
        System.out.println("Qual a sua data de nascimento: ");
        String aniversarioTexto = sc.next();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aniversario = LocalDate.parse(aniversarioTexto, formatoData);
        setAniversario(aniversario);
        
        System.out.println("Qual vai ser o seu login: ");
        String loginProprietarioOriginal = sc.nextLine();
        
        System.out.println("Qual vai ser a sua senha: ");
        String senhaProprietarioOriginal = sc.nextLine();
    }
    
    
    /*public void caseCompraDeEstoque(Estoque estoque){
        System.out.println("Qual produto você deseja comprar: pipoca, bebidas ou guloseimas? ");
        String produtoComprado = sc.nextLine();
        
        System.out.println("Quantos produtos você deseja comprar? ");
        int quantidadeComprado = sc.nextInt();
        sc.nextLine();
        
        switch (produtoComprado){
            case "pipoca" : 
                int quantidadePipoca = estoque.getQuantidadePipoca();
                quantidadePipoca = quantidadePipoca + quantidadeComprado;
                estoque.setQuantidadePipoca(quantidadePipoca);
                System.out.println("Informe a validade da pipoca: ");
                String validadePipoca = sc.nextLine();
                estoque.cadastrarProduto("Pipoca", validadePipoca);
                break;
            
            case "bebidas" :
                int quantidadeBebidas = estoque.getQuantidadeBebidas();
                quantidadeBebidas = quantidadeBebidas + quantidadeComprado;
                estoque.setQuantidadeBebidas(quantidadeBebidas);
                String validadeBebidas = sc.nextLine();
                estoque.cadastrarProduto("Pipoca", validadeBebidas);
            
            default :
                int quantidadeGuloseimas = estoque.getQuantidadeGuloseimas();
                quantidadeGuloseimas = quantidadeGuloseimas + quantidadeComprado;
                estoque.setQuantidadeGuloseimas(quantidadeGuloseimas);
                String validadeGuloseimas = sc.nextLine();
                estoque.cadastrarProduto("Pipoca", validadeGuloseimas);
        }
    }*/
    
    public void compraDeEstoque(Estoque estoque){
        System.out.println("Qual produto você deseja comprar: pipoca, bebidas ou guloseimas? ");
        String produtoComprado = sc.nextLine();
        
        System.out.println("Quantos produtos você deseja comprar? ");
        int quantidadeComprado = sc.nextInt();
        sc.nextLine();
        
        switch (produtoComprado){
            case "pipoca" : 
                int quantidadePipoca = estoque.getQuantidadePipoca();
                quantidadePipoca = quantidadePipoca + quantidadeComprado;
                estoque.setQuantidadePipoca(quantidadePipoca);
                System.out.println("Informe a validade da pipoca: ");
                String validadePipoca = sc.nextLine();
                estoque.cadastrarProduto("Pipoca", validadePipoca);
                break;
            
            case "bebidas" :
                int quantidadeBebidas = estoque.getQuantidadeBebidas();
                quantidadeBebidas = quantidadeBebidas + quantidadeComprado;
                estoque.setQuantidadeBebidas(quantidadeBebidas);
                String validadeBebidas = sc.nextLine();
                estoque.cadastrarProduto("Pipoca", validadeBebidas);
            
            default :
                int quantidadeGuloseimas = estoque.getQuantidadeGuloseimas();
                quantidadeGuloseimas = quantidadeGuloseimas + quantidadeComprado;
                estoque.setQuantidadeGuloseimas(quantidadeGuloseimas);
                String validadeGuloseimas = sc.nextLine();
                estoque.cadastrarProduto("Pipoca", validadeGuloseimas);
        }
        
        
        if(produtoComprado.equals("pipoca")){
            int quantidadePipoca = estoque.getQuantidadePipoca();
            quantidadePipoca = quantidadePipoca + quantidadeComprado;
            estoque.setQuantidadePipoca(quantidadePipoca);
            System.out.println("Informe a validade da pipoca: ");
            String validadePipoca = sc.nextLine();
            estoque.cadastrarProduto("Pipoca", validadePipoca);
        }
        else if(produtoComprado.equals("bebidas")){
            int quantidadeBebidas = estoque.getQuantidadeBebidas();
            quantidadeBebidas = quantidadeBebidas + quantidadeComprado;
            estoque.setQuantidadeBebidas(quantidadeBebidas);
            String validadeBebidas = sc.nextLine();
            estoque.cadastrarProduto("Pipoca", validadeBebidas);
        }
        else if(produtoComprado.equals("guloseimas")){
            int quantidadeGuloseimas = estoque.getQuantidadeGuloseimas();
            quantidadeGuloseimas = quantidadeGuloseimas + quantidadeComprado;
            estoque.setQuantidadeGuloseimas(quantidadeGuloseimas);
            String validadeGuloseimas = sc.nextLine();
            estoque.cadastrarProduto("Pipoca", validadeGuloseimas);
        }
    }

    public String getLoginProprietario() {
        return loginProprietario;
    }

    public String getSenhaProprietario() {
        return senhaProprietario;
    }

    public String getSenhaProprietarioOriginal() {
        return senhaProprietarioOriginal;
    }

    public String getLoginProprietarioOriginal() {
        return loginProprietarioOriginal;
    }

    public void setLoginProprietario(String loginProprietario) {
        this.loginProprietario = loginProprietario;
    }

    public void setSenhaProprietario(String senhaProprietario) {
        this.senhaProprietario = senhaProprietario;
    }

    public void setSenhaProprietarioOriginal(String senhaProprietarioOriginal) {
        this.senhaProprietarioOriginal = senhaProprietarioOriginal;
    }

    public void setLoginProprietarioOriginal(String loginProprietarioOriginal) {
        this.loginProprietarioOriginal = loginProprietarioOriginal;
    }
    
}
