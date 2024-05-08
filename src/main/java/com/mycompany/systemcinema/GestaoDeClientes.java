/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Classe para gerenciar clientes do cinema.
 * <p>
 * Esta classe contém métodos para cadastrar clientes, bem como editar informações dos clientes cadastrados.
 * </p>
 *
 * @author Lucas
 * @version 1.0
 */
public class GestaoDeClientes {

    private Cliente cliente;

    Scanner sc = new Scanner(System.in);

    /**
     * Método para cadastrar um novo cliente.
     *
     * @param cliente O objeto Cliente a ser cadastrado.
     */
    public void cadastroDeCliente(Cliente cliente) {
        System.out.println("Qual o nome do cliente: ");
        String name = sc.nextLine();
        cliente.setName(name);

        System.out.println("Qual o sobrenome do cliente: ");
        String sobrenome = sc.nextLine();
        cliente.setSobrenome(sobrenome);

        System.out.println("Qual o endereço do cliente: ");
        String endereco = sc.nextLine();
        cliente.setEndereco(endereco);

        System.out.println("Qual o telefone do cliente: ");
        String telefone = sc.nextLine();
        cliente.setTelefone(telefone);

        System.out.println("Qual o cpf do cliente: ");
        String cpf = sc.nextLine();
        cliente.setCpf(cpf);

        System.out.println("Qual a data de nascimento do cliente: ");
        String aniversarioTexto = sc.nextLine();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aniversario = LocalDate.parse(aniversarioTexto, formatoData);
        cliente.setAniversario(aniversario);

        System.out.println("Qual vai ser o login do cliente: ");
        String loginClienteOriginal = sc.nextLine();

        System.out.println("Qual vai ser a senha do cliente: ");
        String senhaClienteOriginal = sc.nextLine();
    }

    /**
     * Método para editar o cadastro de um cliente.
     *
     * @param cliente O cliente cujas informações serão editadas.
     */
    public void editarCadastroCliente(Cliente cliente) {
        System.out.println("Qual informação vai ser alterada: name, sobrenome, endereco, telefone, cpf, "
                + "senha ou login?");
        String alterada = sc.nextLine();

        if (alterada.equals("name")) {
            System.out.println("Qual é o novo nome? ");
            String novoNome = sc.nextLine();
            cliente.setName(novoNome);
        } else if (alterada.equals("sobrenome")) {
            System.out.println("Qual é o novo sobrenome? ");
            String novoSobrenome = sc.nextLine();
            cliente.setSobrenome(novoSobrenome);
        } else if (alterada.equals("endereco")) {
            System.out.println("Qual é o novo endereco? ");
            String novoEndereco = sc.nextLine();
            cliente.setEndereco(novoEndereco);
        } else if (alterada.equals("telefone")) {
            System.out.println("Qual é o novo telefone? ");
            String novoTelefone = sc.nextLine();
            cliente.setTelefone(novoTelefone);
        } else if (alterada.equals("cpf")) {
            System.out.println("Qual é o novo cpf? ");
            String novoCpf = sc.nextLine();
            cliente.setCpf(novoCpf);
        } else if (alterada.equals("senha")) {
            System.out.println("Qual é a nova senha? ");
            String novaSenha = sc.nextLine();
            cliente.setSenhaClienteOriginal(novaSenha);
        } else if (alterada.equals("login")) {
            System.out.println("Qual é o novo login? ");
            String novoLogin = sc.nextLine();
            cliente.setLoginClienteOriginal(novoLogin);
        }
    }
}
