/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Classe para representar os Clientes usada para armazernar caracteristicas do Cliente e realizar suas funções
 * <p>
 * É usada para armazernar suas caracteristicas como preferencias, login e senha e realizar o seu cadastro e entrar no sistema
 * <p>
 * 
 * @author Lucas
 */
public class Cliente extends Pessoa{
    
    //Arrumar pessoa: Pessoa e dois preferenciasDeFilme: String no UML
    
    /**
     * nome da preferencia por filme
     */
    private String preferenciaDeFilme;
    /**
     * nome da preferencia por genero
     */
    private String preferenciaDeGenero;
    /**
     * login registrado do cliente
     */
    private String loginClienteOriginal;
    /**
     * senha registrada do cliente
     */
    private String senhaClienteOriginal;
    /**
     * login usado pelo cliente para entrar no sistema
     */
    private String loginCliente;
    /**
     * senha usada pelo cliente para entrar no sistema
     */
    private String senhaCliente;
    
    Scanner sc = new Scanner(System.in);
    
    /**
     * Construtor padrao da classe Cliente
     */
    public Cliente(){};
    
    /**
     * Construtor com inforações do cliente
     * 
     * @param name O nome do cliente
     * @param sobrenome O sobrenome do cliente
     * @param endereco O endereço do cliente
     * @param telefone O telefone do cliente
     * @param cpf O cpf do cliente
     * @param aniversario A data de nascimento do cliente
     * @param preferenciaDeFilme O filme de preferencia do cliente
     * @param preferenciaDeGenero O genero de filme de preferencia do cliente
     * @param loginClienteOriginal O login registado do cliente
     * @param senhaClienteOriginal A senha registrada do cliente
     */
    public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario, 
            String preferenciaDeFilme, String preferenciaDeGenero, String loginClienteOriginal,
            String senhaClienteOriginal) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
        this.preferenciaDeFilme = preferenciaDeFilme;
        this.preferenciaDeFilme = preferenciaDeGenero;
        this.loginClienteOriginal = loginClienteOriginal;
        this.senhaClienteOriginal = senhaClienteOriginal;
    }
    
    /**
     * Construtor com somente as informações herdadas da classe Pessoa
     * 
     * @param name O nome do cliente
     * @param sobrenome O sobrenome do cliente
     * @param endereco O endereço do cliente
     * @param telefone O telefone do cliente
     * @param cpf O cpf do cliente
     * @param aniversario A data de nascimento do cliente
     */
    public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
    }
    
    /**
     * Solicia o login e a senha do cliente para ele entrar no sistema, se a senha e login forem corretos 
     * o cliente entrara no sistema, se não forem vão pedir novamente o login e a senha
     * 
     */
    public void clienteRealizarLogin(){
        boolean loginValido = false;
        while (!loginValido){
            System.out.println("Informe o seu login: ");
            loginCliente = sc.nextLine();
            System.out.println("Informe a sua senha: ");
            senhaCliente = sc.nextLine();
        
            if(loginCliente.equals(loginClienteOriginal) && senhaCliente.equals(senhaClienteOriginal)){
                loginValido = true;
                System.out.println("Bem vindo ao CineDjamas");
            }
            else {
                System.out.println("Login ou senha incorretos. Tente novamente");
            }
        }
    }
    
    public void clienteRealizarCadastro(){
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
        String aniversarioTexto = sc.nextLine();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aniversario = LocalDate.parse(aniversarioTexto, formatoData);
        setAniversario(aniversario);
        
        System.out.println("Qual vai ser o seu login: ");
        String loginClienteOriginal = sc.nextLine();
        
        System.out.println("Qual vai ser a sua senha: ");
        String senhaClienteOriginal = sc.nextLine();
    }
    
     public String getPreferenciaDeFilme() {
        return preferenciaDeFilme;
    }

    public String getPreferenciaDeGenero() {
        return preferenciaDeGenero;
    }

    public String getLoginClienteOriginal() {
        return loginClienteOriginal;
    }

    public String getSenhaClienteOriginal() {
        return senhaClienteOriginal;
    }

    public String getLoginCliente() {
        return loginCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setPreferenciaDeFilme(String preferenciaDeFilme) {
        this.preferenciaDeFilme = preferenciaDeFilme;
    }

    public void setPreferenciaDeGenero(String preferenciaDeGenero) {
        this.preferenciaDeGenero = preferenciaDeGenero;
    }

    public void setLoginClienteOriginal(String loginClienteOriginal) {
        this.loginClienteOriginal = loginClienteOriginal;
    }

    public void setSenhaClienteOriginal(String senhaClienteOriginal) {
        this.senhaClienteOriginal = senhaClienteOriginal;
    }

    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }
    
}
