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
        Proprietario proprietario = new Proprietario();
        Estoque estoque = new Estoque();
        estoque.setQuantidadePipoca(1);
        
        proprietario.compraDeEstoque(estoque);
    }

    
}
