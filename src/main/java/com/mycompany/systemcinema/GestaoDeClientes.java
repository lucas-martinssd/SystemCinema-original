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
public class GestaoDeClientes {
    
    private Cliente cliente;
    private Pessoa pessoa;
    
    Scanner sc = new Scanner(System.in);
    
    public void cadastroDeCliente() {
        System.out.println("Qual o nome do cliente: ");
        String name = sc.nextLine();
        pessoa.setName(name);
        
        System.out.println("Qual o sobrenome do cliente: ");
        String sobrenome = sc.nextLine();
        pessoa.setSobrenome(sobrenome);
        
        System.out.println("Qual o endereço do cliente: ");
        String endereco = sc.nextLine();
        pessoa.setEndereco(endereco);
        
        System.out.println("Qual o telefone do cliente: ");
        String telefone = sc.nextLine();
        pessoa.setTelefone(telefone);
        
        System.out.println("Qual o cpf do cliente: ");
        String cpf = sc.nextLine();
        pessoa.setCpf(cpf);
        
        System.out.println("Qual a data de nascimento do cliente: ");
        String aniversarioTexto = sc.next();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate aniversario = LocalDate.parse(aniversarioTexto, formatoData);
        pessoa.setAniversario(aniversario);
        
        System.out.println("Qual vai ser o login do cliente: ");
        String loginClienteOriginal = sc.nextLine();
        
        System.out.println("Qual vai ser a senha do cliente: ");
        String senhaClienteOriginal = sc.nextLine();
    }
    
    public void editarCadastroCliente() {
        System.out.println("Qual informação vai ser alterada: name, sobrenome, endereco, telefone, cpf, "
                + "senha ou login?");
        String alterada = sc.nextLine();
        
        if (alterada == pessoa.getName()){
            System.out.println("Qual é o novo nome? ");
            String novoNome = sc.nextLine();
            pessoa.setName(novoNome);
        }
        else if (alterada == pessoa.getSobrenome()) {
            System.out.println("Qual é o novo sobrenome? ");
            String novoSobrenome = sc.nextLine();
            pessoa.setSobrenome(novoSobrenome);
        }
        else if (alterada == pessoa.getEndereco()) {
            System.out.println("Qual é o novo endereco? ");
            String novoEndereco = sc.nextLine();
            pessoa.setEndereco(novoEndereco);
        }
        else if (alterada == pessoa.getTelefone()) {
            System.out.println("Qual é o novo telefone? ");
            String novoTelefone = sc.nextLine();
            pessoa.setTelefone(novoTelefone);
        }
        else if (alterada == pessoa.getCpf()) {
            System.out.println("Qual é o novo cpf? ");
            String novoCpf = sc.nextLine();
            pessoa.setCpf(novoCpf);
        }
        else if (alterada == cliente.getSenhaClienteOriginal()) {
            System.out.println("Qual é a nova senha? ");
            String novaSenha = sc.nextLine();
            cliente.setSenhaClienteOriginal(novaSenha);
        }
        else if (alterada == cliente.getLoginClienteOriginal()) {
            System.out.println("Qual é o novo login? ");
            String novoLogin = sc.nextLine();
            cliente.setLoginClienteOriginal(novoLogin);
        }
    }
}

