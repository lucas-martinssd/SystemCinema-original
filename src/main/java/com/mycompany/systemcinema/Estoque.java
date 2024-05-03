/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    
    public List<Produto> getProduto(){
        return produto;
    }
    
    private int quantidadePipoca;
    private int quantidadeBebidas;
    private int quantidadeGuloseimas;
    
    /**
     * Contrutor que Estoque recebe um ArrayList.
     */
    public Estoque ()
    {
        this.produto = new ArrayList<>();
    }

    public Estoque(int quantidadePipoca, int quantidadeBebidas, int quantidadeGuloseimas) {
        this.quantidadePipoca = quantidadePipoca;
        this.quantidadeBebidas = quantidadeBebidas;
        this.quantidadeGuloseimas = quantidadeGuloseimas;
    }
    

    /**
     * Realiza o cadastro de um novo produto, em que LocalDate.Parse converte a a String ValidadeSTr que será pedida ao funcionário e converterá para o formato LocalDate.
     * @param nome nome do produto.
     * @param validadeStr validade do produto.
     */
    public void cadastrarProduto(String nome, String validadeStr)
    {   
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate validade = LocalDate.parse(validadeStr, formatoData);
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
            System.out.print("\nProduto: " + list.getNome());
        }
    }

    public int getQuantidadePipoca() {
        return quantidadePipoca;
    }

    public int getQuantidadeBebidas() {
        return quantidadeBebidas;
    }

    public int getQuantidadeGuloseimas() {
        return quantidadeGuloseimas;
    }

    public void setQuantidadePipoca(int quantidadePipoca) {
        this.quantidadePipoca = quantidadePipoca;
    }

    public void setQuantidadeBebidas(int quantidadeBebidas) {
        this.quantidadeBebidas = quantidadeBebidas;
    }

    public void setQuantidadeGuloseimas(int quantidadeGuloseimas) {
        this.quantidadeGuloseimas = quantidadeGuloseimas;
    }
    
    
}