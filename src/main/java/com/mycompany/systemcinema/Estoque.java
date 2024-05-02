/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
/**
 * Classe para armazenar e detalhar o Estoque.
 * <p>
 * Esta classe é usada para armazenar características de um Produto, cadastrar e remover um produto, além de listar os produtos.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Estoque 
{
    /**
     * Lista para criar diversos produtos.
     */
    private List<Produto> produto;
    
    /**
     * Contrutor que Estoque recebe um ArrayList.
     */
    public Estoque ()
    {
        this.produto = new ArrayList<>();
    }

    /**
     * Realiza o cadastro de um novo produto, em que LocalDate.Parse converte a a String ValidadeSTr que será pedida ao funcionário e converterá para o formato LocalDate.
     * @param nome nome do produto.
     * @param validadeStr validade do produto.
     */
    public void cadastrarProduto(String nome, String validadeStr)
    {   
        LocalDate validade = LocalDate.parse(validadeStr);
        this.produto.add(new Produto(nome, validade));
    }
    /**
     * Remove um produto da lista atravês de uma expressao lambda, em que caso X.getNome(chama o método getNome da clase Produto)e que em seguida compara o nome do produto X com o parâmetro nome. retorna True se forem iguais, removendo o produto da lista
     * @param nome nome do filme.
     * @return O produto removido.
     */
    public boolean removerProduto(String nome)
    {   
        return produto.removeIf(x -> x.getNome().equals(nome));
    }
    
    /**
     * Mostra todos os produtos ja cadastrados, tanto o nome quanto a data de validade.
     */
    public void listarProdutos()
    {
        for(Produto list : produto)
        {
            System.out.print(produto);
        }
    }
}