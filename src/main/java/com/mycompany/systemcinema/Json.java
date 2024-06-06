/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Json {
    
    
    
    public static void salvarClientes(List<Cliente> cliente) throws IOException{
        
        String jsonClientes = "C:/Users/Lucas/Documents/NetBeansProjects/SystemCinema/src/main/java/com/mycompany/systemcinema/ClientesJson.json";
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        String json = gson.toJson(cliente);
        
        try(FileWriter arquivo = new FileWriter(jsonClientes)){
            arquivo.write(json);
        }
        catch(IOException x){
            x.printStackTrace();
        }
        System.out.println("Certo");
    }
}
