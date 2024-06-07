/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemcinema;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class SystemCinema {
    
    public static void main(String[] args) throws IOException {
        
        /**
        ///Questão 3
        {
        //Pessoa
        {
        LocalDate dataPessoa = LocalDate.of(2001, 11, 07);
        Pessoa pessoa = new Pessoa("Lucas", "Martins", "Diamantina", "(31)98448-9509", "155.150.566-55", dataPessoa);
        System.out.println(pessoa.toString());
        }
        
        //Cliente
        {
        LocalDate dataPessoa = LocalDate.of(2001, 11, 07);
        Cliente cliente = new Cliente("Lucas", "Martins", "Diamantina", "(31)98448-9509", "155.150.566-55", dataPessoa, "Batman", "Ação", "lucas", "1234");
        System.out.println(cliente.toString());
        }
        
        //Funcionario
        {
        LocalDate dataPessoa = LocalDate.of(2001, 11, 07);
        Funcionario funcionario = new Funcionario("Lucas", "Martins", "Diamantina", "(31)98448-9509", "155.150.566-55", dataPessoa, "lucas", "1234");
        System.out.println(funcionario.toString());
        }
        
        //Proprietario
        {
        LocalDate dataPessoa = LocalDate.of(2001, 11, 07);
        Proprietario proprietario = new Proprietario("Lucas", "Martins", "Diamantina", "(31)98448-9509", "155.150.566-55", dataPessoa, "lucas", "1234");
        System.out.println(proprietario.toString());
        }
        }
    
        ///Questão 4
        {
        //Cliente
        {
        LocalDate dataPessoa = LocalDate.of(2001, 11, 07);
        Cliente cliente = new Cliente("Lucas", "Martins", "Diamantina", "(31)98448-9509", "155.150.566-55", dataPessoa, "Batman", "Ação", "lucas", "1234");
        System.out.println(cliente.toString());
        }
        
        //Funcionario
        {
        LocalDate dataPessoa = LocalDate.of(2001, 11, 07);
        Funcionario funcionario = new Funcionario("Lucas", "Martins", "Diamantina", "(31)98448-9509", "155.150.566-55", dataPessoa, "lucas", "1234");
        System.out.println(funcionario.toString());
        }
        
        //Proprietario
        {
        LocalDate dataPessoa = LocalDate.of(2001, 11, 07);
        Proprietario proprietario = new Proprietario("Lucas", "Martins", "Diamantina", "(31)98448-9509", "155.150.566-55", dataPessoa, "lucas", "1234");
        System.out.println(proprietario.toString());
        }
        }

        ///Questão 6
        {
        GestaoDeFuncionarios gestaoFuncionarios = new GestaoDeFuncionarios();
            gestaoFuncionarios.cadastroDeFuncionario();
            gestaoFuncionarios.cadastroDeFuncionario();
             
        System.out.println("Funcionarios cadastrados:");
        for (Funcionario funcionario : gestaoFuncionarios.getListaDeFuncionarios()) {
            System.out.println(funcionario);
        }

        gestaoFuncionarios.excluirFuncionario();

        System.out.println("Funcionarios restantes:");
        for (Funcionario funcionario : gestaoFuncionarios.getListaDeFuncionarios()) {
            System.out.println(funcionario);
        }
        }
        
        ///Questao 7
        {
        GestaoDeClientes gestaoClientes = new GestaoDeClientes();
            gestaoClientes.cadastroDeCliente();
            gestaoClientes.cadastroDeCliente();
             
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : gestaoClientes.getListaDeClientes()) {
            System.out.println(cliente);
        }

        gestaoClientes.excluirCliente();

        System.out.println("Clientes restantes:");
        for (Cliente cliente : gestaoClientes.getListaDeClientes()) {
            System.out.println(cliente);
        }
        }
        */
        
        ///Questao 14
        
        //Cliente
        Repositorys json = new Repositorys();
        GestaoDeClientes gestaoClientes = new GestaoDeClientes();
            gestaoClientes.cadastroDeCliente();
        json.salvarClientes(gestaoClientes.getListaDeClientes());
        
        //Funcionario
        GestaoDeFuncionarios gestaoFuncionarios = new GestaoDeFuncionarios();
            gestaoFuncionarios.cadastroDeFuncionario();
        json.salvarFuncionarios(gestaoFuncionarios.getListaDeFuncionarios());
    }
}

