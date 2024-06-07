/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

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
}
