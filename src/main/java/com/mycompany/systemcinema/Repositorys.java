/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lucas
 */
public class Repositorys {
    
    
    
    public static void salvarClientes(List<Cliente> cliente) throws IOException{
        
        String jsonClientes = "C:/Users/Lucas/Documents/NetBeansProjects/SystemCinema/src/main/java/com/mycompany/systemcinema/ReposCliente.json";
        
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(cliente);
        
        try(FileWriter arquivo = new FileWriter(jsonClientes)){
            arquivo.write(json);
        }
        catch(IOException x){
             System.err.println("Erro ao salvar clientes: " + x.getMessage());
        }
        System.out.println("Clientes salvos.");
    }
    
    public static void salvarFuncionarios(List<Funcionario> funcionario) throws IOException{
        
        String jsonClientes = "C:/Users/Lucas/Documents/NetBeansProjects/SystemCinema/src/main/java/com/mycompany/systemcinema/ReposFuncionario.json";
        
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(funcionario);
        
        try(FileWriter arquivo = new FileWriter(jsonClientes)){
            arquivo.write(json);
        }
        catch(IOException x){
             System.err.println("Erro ao salvar funcionarios: " + x.getMessage());
        }
        System.out.println("Funcionarios salvos.");
    }
    
    public static void salvarFilmes(List<Filme> filmes) throws IOException
    {
        String addresFilme = "C:/Users/Lucas/Documents/NetBeansProjects/SystemCinema/src/main/java/com/mycompany/systemcinema/ReposFilme.json";
       
        System.out.println("Salvando filmes...");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Duration.class, new DurationAdapter());
        Gson gson = gsonBuilder.setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(addresFilme))
        {
            gson.toJson(filmes, writer);
            System.out.println("Filmes salvos com sucesso em " + addresFilme);
        }
        catch (IOException e)
        {
            System.err.println("Erro ao salvar filmes: " + e.getMessage());
        }
    }

    /**
     * Salva a lista de produtos em um arquivo JSON.
     *
     * @param produtos a lista de produtos a ser salva
     * @throws IOException se ocorrer um erro ao escrever o arquivo
     */
    public static void salvarProdutos(List<Produto> produtos) throws IOException
    {
        String addresProduto = "C:/Users/Lucas/Documents/NetBeansProjects/SystemCinema/src/main/java/com/mycompany/systemcinema/ReposProduto.json";
        
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(produtos);
        try (FileWriter arquivo = new FileWriter(addresProduto))
        {
            arquivo.write(json);
            System.out.println("Produtos salvos com sucesso em " + addresProduto);
        }
        catch (IOException e)
        {
            
        }

    }
    
     /**
     * Salva a lista de vendas em um arquivo JSON.
     *
     * @param vendas a lista de vendas a ser salva
     * @throws IOException se ocorrer um erro ao escrever o arquivo
     */
    public static void salvarVendas(List<Venda> vendas) throws IOException
    {
        String addresVendas = "C:/Users/Lucas/Documents/NetBeansProjects/SystemCinema/src/main/java/com/mycompany/systemcinema/ReposVendas.json";
        
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(vendas);
        try (FileWriter arquivo = new FileWriter(addresVendas))
        {
            arquivo.write(json);
            System.out.println("Vendas salvos com sucesso em " + addresVendas);
        }
        catch (IOException e)
        {
            System.err.println("Erro ao salvar vendas: " + e.getMessage());
        }
    }
    
    public static void salvarClientesComVendas(List<Cliente> clientes, Map<Cliente, List<Venda>> vendasPorCliente) throws IOException
    {
        String addresClienteVenda = "C:/Users/Lucas/Documents/NetBeansProjects/SystemCinema/src/main/java/com/mycompany/systemcinema/ReposClientesVendas.json";

        // Cria um mapa para armazenar os dados do cliente junto com suas vendas
        Map<String, Object> dadosClientesComVendas = new HashMap<>();

        for (Cliente cliente : clientes)
        {
            Map<String, Object> dadosCliente = new HashMap<>();
            dadosCliente.put("cliente", cliente);
            dadosCliente.put("vendas", vendasPorCliente.get(cliente));
            dadosClientesComVendas.put(cliente.getCpf(), dadosCliente);
        }

        // Configura o Gson para serializar os dados corretamente
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .registerTypeAdapter(Duration.class, new DurationAdapter())
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(dadosClientesComVendas);
        try (FileWriter arquivo = new FileWriter(addresClienteVenda))
        {
            arquivo.write(json);
            System.out.println("Clientes com vendas salvos com sucesso em " + addresClienteVenda);
        }
        catch (IOException e)
        {
            System.err.println("Erro ao salvar clientes com vendas: " + e.getMessage());
            throw e;
        }
    }
}
