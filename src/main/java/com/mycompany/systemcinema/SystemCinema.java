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
        Caixa caixa = new Caixa();
        Carrinho carrinho = new Carrinho();
        Estoque estoque = new Estoque();
        
        estoque.cadastrarProduto("Pipoca", "01/01/2023");
        carrinho.toString();
    }
}
