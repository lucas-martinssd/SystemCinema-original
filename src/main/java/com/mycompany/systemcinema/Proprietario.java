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
public class Proprietario extends Pessoa{
    
    
    //Arrumar herança entre Funcionario e Proprietario, colocar Proprietario como composição de Gestão de Clientes tambem
    //Colocar função registroProprietario
    private String loginProprietario;
    private String senhaProprietario;
    private String senhaProprietarioOriginal;
    private String loginProprietarioOriginal;

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
    
    //Completar
    public void compraDeEstoque(){
        //System.out.println("Qual produto você deseja comprar, pipoca, bebida ou guloseimas? ");
        //String produtoComprado = sc.nextLine();
        
        //System.out.println("Quantos produtos você deseja comprar? ");
        //int quantidadeComprado = sc.nextInt();
        
        //Estoque estoque = new Estoque();
        //if(produtoComprado == "pipoca"){
        //    estoque.pipoca = pipoca + qunatidadeComprado;
        //}
    }
    
    public void relatorioAnualCaixa(){
        
    }
    
    public void relatorioMensalCaixa(){
        
    }
    
    public void relatorioAnualCInema(){
        
    }
    
    public void relatorioMensalCinema(){
        
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
