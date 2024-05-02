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

public class Funcionario extends Pessoa {
    
    //Arrumar herança, colocar para funcionario direto de pessoa, colocar realizarLogin, 
    private String loginFuncionario;
    private String senhaFuncionario;
    private String senhaFuncionarioOriginal = "senha";
    private String loginFuncionarioOriginal = "Lucas";

    Scanner sc = new Scanner(System.in);
    
    public Funcionario(){};

    public Funcionario(String loginFuncionario, String senhaFuncionario, String senhaFuncionarioOriginal, String loginFuncionarioOriginal, String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
        this.loginFuncionario = loginFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.senhaFuncionarioOriginal = senhaFuncionarioOriginal;
        this.loginFuncionarioOriginal = loginFuncionarioOriginal; 
    }

    public Funcionario(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
    }
    
    public void funcionarioRealizarLogin(){
        boolean loginValido = false;
        
        while (!loginValido) {
            System.out.println("Informe o seu login: ");
            loginFuncionario = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            senhaFuncionario = sc.nextLine();

            if(loginFuncionario.equals(loginFuncionarioOriginal) && senhaFuncionario.equals(senhaFuncionarioOriginal)){
                loginValido = true;
                System.out.println("Bem vindo ao CineDjamas funcionario");
            }
            else {
                System.out.println("Login ou senha incorretos. Tente novamente");
            }
        }
    }
    
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
        
        System.out.println("Qual o seu cpf: ");
        String cpf = sc.nextLine();
        setCpf(cpf);
        
        System.out.println("Qual a sua data de nascimento: ");
        String aniversarioTexto = sc.next();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aniversario = LocalDate.parse(aniversarioTexto, formatoData);
        setAniversario(aniversario);
        
        System.out.println("Qual vai ser o seu login: ");
        String loginFuncionarioOriginal = sc.nextLine();
        
        System.out.println("Qual vai ser a sua senha: ");
        String senhaFuncionarioOriginal = sc.nextLine();
    }

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

