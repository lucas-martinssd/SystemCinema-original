/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Classe para representar os funcionários do cinema.
 * <p>
 * Esta classe herda características da classe Pessoa e adiciona funcionalidades específicas para funcionários,
 * como login e senha.
 * </p>
 *
 * @author Lucas
 * @version 1.0
 */
public class Funcionario extends Pessoa {
    
    /**
     * O login do funcionário.
     */
    private String loginFuncionario;
    
    /**
     * A senha do funcionário.
     */
    private String senhaFuncionario;
    
    /**
     * A senha original do funcionário.
     */
    private String senhaFuncionarioOriginal = "senha";
    
    /**
     * O login original do funcionário.
     */
    private String loginFuncionarioOriginal = "Lucas";

    Scanner sc = new Scanner(System.in);
    
    /**
     * Construtor padrão da classe Funcionario.
     */
    public Funcionario(){};

    /**
     * Construtor da classe Funcionario com informações do funcionário.
     * 
     * @param loginFuncionario O login do funcionário.
     * @param senhaFuncionario A senha do funcionário.
     * @param senhaFuncionarioOriginal A senha original do funcionário.
     * @param loginFuncionarioOriginal O login original do funcionário.
     * @param name O nome do funcionário.
     * @param sobrenome O sobrenome do funcionário.
     * @param endereco O endereço do funcionário.
     * @param telefone O telefone do funcionário.
     * @param cpf O CPF do funcionário.
     * @param aniversario A data de nascimento do funcionário.
     */
    public Funcionario(String loginFuncionario, String senhaFuncionario, String senhaFuncionarioOriginal, String loginFuncionarioOriginal, String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
        this.loginFuncionario = loginFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.senhaFuncionarioOriginal = senhaFuncionarioOriginal;
        this.loginFuncionarioOriginal = loginFuncionarioOriginal; 
    }

    /**
     * Construtor da classe Funcionario com informações herdadas da classe Pessoa.
     * 
     * @param name O nome do funcionário.
     * @param sobrenome O sobrenome do funcionário.
     * @param endereco O endereço do funcionário.
     * @param telefone O telefone do funcionário.
     * @param cpf O CPF do funcionário.
     * @param aniversario A data de nascimento do funcionário.
     */
    public Funcionario(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
    }
    
    /**
     * Método para realizar o login do funcionário no sistema.
     * Solicita o login e a senha do funcionário para acessar o sistema.
     * Se o login e a senha estiverem corretos, o funcionário é autenticado.
     */
    public void funcionarioRealizarLogin(){
        boolean loginValido = false;
        
        while (!loginValido) {
            System.out.println("Informe o seu login: ");
            loginFuncionario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            senhaFuncionario = sc.nextLine();

            if(loginFuncionario.equals(loginFuncionarioOriginal) && senhaFuncionario.equals(senhaFuncionarioOriginal)){
                loginValido = true;
                System.out.println("Bem vindo ao CineDjamas funcionário");
            }
            else {
                System.out.println("Login ou senha incorretos. Tente novamente");
            }
        }
    }
    
    /**
     * Método para realizar o cadastro de um novo funcionário.
     * Solicita as informações do funcionário para cadastrá-lo no sistema.
     */
    public void funcionarioRealizarCadastro(){
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
        
        System.out.println("Qual o seu CPF: ");
        String cpf = sc.nextLine();
        setCpf(cpf);
        
        System.out.println("Qual a sua data de nascimento (DD/MM/AAAA): ");
        String aniversarioTexto = sc.nextLine();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aniversario = LocalDate.parse(aniversarioTexto, formatoData);
        setAniversario(aniversario);
        
        System.out.println("Qual vai ser o seu login: ");
        String loginFuncionarioOriginal = sc.nextLine();
        
        System.out.println("Qual vai ser a sua senha: ");
        String senhaFuncionarioOriginal = sc.nextLine();
    }

    // Métodos getters e setters omitidos para concisão

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public String getSenhaFuncionarioOriginal() {
        return senhaFuncionarioOriginal;
    }

    public String getLoginFuncionarioOriginal() {
        return loginFuncionarioOriginal;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public void setSenhaFuncionarioOriginal(String senhaFuncionarioOriginal) {
        this.senhaFuncionarioOriginal = senhaFuncionarioOriginal;
    }

    public void setLoginFuncionarioOriginal(String loginFuncionarioOriginal) {
        this.loginFuncionarioOriginal = loginFuncionarioOriginal;
    }
    
}

