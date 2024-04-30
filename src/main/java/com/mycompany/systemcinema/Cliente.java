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
public class Cliente extends Pessoa{
    
    //Arrumar pessoa: Pessoa e dois preferenciasDeFilme: String no UML
    private String preferenciaDeFilme;
    private String preferenciaDeGenero;
    private String loginClienteOriginal;
    private String senhaClienteOriginal;
    private String loginCliente;
    private String senhaCliente;
    
    Scanner sc = new Scanner(System.in);
 
    public Cliente(){};
    
    public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario, 
            String preferenciaDeFilme, String preferenciaDeGenero, String loginClienteOriginal,
            String senhaClienteOriginal) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
        this.preferenciaDeFilme = preferenciaDeFilme;
        this.preferenciaDeFilme = preferenciaDeGenero;
        this.loginClienteOriginal = loginClienteOriginal;
        this.senhaClienteOriginal = senhaClienteOriginal;
    }

    public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
        super(name, sobrenome, endereco, telefone, cpf, aniversario);
    }
    
    
    
    public String clienteEntrarNoSistema(){
        String bemVindo = "Bem vindo ao CineDjamas";
        return bemVindo;
    }
    
    public void clienteRealizarLogin(){
        System.out.println("Informe o seu login: ");
        loginCliente = sc.nextLine();
        System.out.println("Informe a sua senha: ");
        senhaCliente = sc.nextLine();
        
        if(loginCliente==loginClienteOriginal && senhaCliente==senhaClienteOriginal){
            clienteEntrarNoSistema();
        }
        else {
            clienteRealizarLogin();
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
        String aniversarioTexto = sc.next();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
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
