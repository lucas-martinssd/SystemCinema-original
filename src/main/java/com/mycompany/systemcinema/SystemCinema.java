/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemcinema;

import java.time.Duration;

/**
 *
 * @author Lucas
 */
public class SystemCinema {
    
    public static void main(String[] args) {
              
        Cliente cliente = new Cliente();
        cliente.setName("Lucas");
        
        GestaoDeClientes gestao = new GestaoDeClientes();
        gestao.cadastroDeCliente(cliente);
        gestao.editarCadastroCliente(cliente);
    }

    
}
