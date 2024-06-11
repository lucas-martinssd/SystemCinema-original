/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Classe responsável pela gestão das operações de caixa do cinema. Essa classe
 * cuida de tudo que envolve dinheiro: vendas de ingressos, produtos, e registro
 * de vendas diárias e mensais.
 */
public class Caixa {

    private double valorIngresso;
    private Carrinho carrinho;
    public List<Venda> vendasDiarias;
    private List<Venda> vendasMensais;
    private Map<Cliente, List<Venda>> vendasPorCliente; // Mapeamento das vendas por cliente
    private static final Caixa[] balcoes = new Caixa[5]; // Balcões de atendimento sendo estáticos

    public Caixa(Carrinho carrinho) {
        this.carrinho = carrinho;
        this.vendasDiarias = new ArrayList<>();
        this.vendasMensais = new ArrayList<>();
    }

    // Getters e Setters
    public double getValorIngresso() { return valorIngresso; }
    public void setValorIngresso(double valorIngresso) { this.valorIngresso = valorIngresso; }

    public Carrinho getCarrinho() { return carrinho; }
    public void setCarrinho(Carrinho carrinho) { this.carrinho = carrinho; }

    public List<Venda> getVendasDiarias() { return vendasDiarias; }
    public void setVendasDiarias(List<Venda> vendasDiarias) { this.vendasDiarias = vendasDiarias; }

    public List<Venda> getVendasMensais() { return vendasMensais; }
    public void setVendasMensais(List<Venda> vendasMensais) { this.vendasMensais = vendasMensais; }

    public Map<Cliente, List<Venda>> getVendasPorCliente() { return vendasPorCliente; }
    public void setVendasPorCliente(Map<Cliente, List<Venda>> vendasPorCliente) { this.vendasPorCliente = vendasPorCliente; }

    public static void inicializarBalcoes(Estoque estoque) {
        for (int i = 0; i < 5; i++) {
            balcoes[i] = new Caixa(new Carrinho(estoque));
        }
    }

    public static Caixa[] getBalcoes() {
        return balcoes;
    }

    public void informarValorIngresso(double valor) {
        this.valorIngresso = valor;
    }

    public double valorTotalIngressos() {
        return valorIngresso * carrinho.getQuantidadeIngressos();
    }

    public double valorDeCadaProduto(Produto produto) {
        return produto.getPreco() * carrinho.getQuantidadeProdutos().get(produto);
    }

    public double valorTotalProdutos() {
        double total = 0;
        for (Map.Entry<Produto, Integer> entry : carrinho.getQuantidadeProdutos().entrySet()) {
            total += entry.getKey().getPreco() * entry.getValue();
        }
        return total;
    }

    public double valorTotalCompra() {
        return valorTotalIngressos() + valorTotalProdutos();
    }

    public void efetuarPagamento(Cliente cliente) {
        if (carrinho.getSessao() == null || carrinho.getFilme() == null) {
            System.out.println("Erro: Sessão ou filme não encontrado no carrinho ao efetuar pagamento.");
            return;
        }

        double totalCompra = valorTotalCompra();
        System.out.println("Pagamento efetuado no valor de: R$" + totalCompra);
        carrinho.getSessao().registrarEspectadores(carrinho.getQuantidadeIngressos());
        Venda venda = new Venda(LocalDate.now(), totalCompra, valorTotalIngressos(), valorTotalProdutos());
        vendasDiarias.add(venda);
        vendasMensais.add(venda);

        if (!vendasPorCliente.containsKey(cliente)) {
            vendasPorCliente.put(cliente, new ArrayList<>());
        }
        vendasPorCliente.get(cliente).add(venda);

        // Gera o extrato da venda
        String extrato = extratoVenda();
        System.out.println(extrato);
        venda.setExtrato(extrato);

        // Resetar carrinho após o pagamento
        carrinho.setFilme(null);
        carrinho.setSessao(null);
        carrinho.setQuantidadeIngressos(0);
        carrinho.getPoltronasSelecionadas().clear();
        carrinho.getProdutosSelecionados().clear();
        carrinho.getQuantidadeProdutos().clear();
    }

    public void cancelarPagamento() {
        double totalCompra = valorTotalCompra();
        double taxaCancelamento = totalCompra * 0.25;
        double valorReembolsado = totalCompra - taxaCancelamento;
        System.out.println("Pagamento cancelado. Valor reembolsado (após taxa de cancelamento de 25%): R$" + valorReembolsado);
    }

    public double valorTotalVendasDiarias() {
        return vendasDiarias.stream().mapToDouble(Venda::getValorTotal).sum();
    }

    public double valorTotalIngressosDiarios() {
        return vendasDiarias.stream().mapToDouble(Venda::getValorIngressos).sum();
    }

    public double valorTotalProdutosDiarios() {
        return vendasDiarias.stream().mapToDouble(Venda::getValorProdutos).sum();
    }

    public double valorTotalVendasMensais() {
        return vendasMensais.stream().mapToDouble(Venda::getValorTotal).sum();
    }

    public double valorTotalIngressosMensais() {
        return vendasMensais.stream().mapToDouble(Venda::getValorIngressos).sum();
    }

    public double valorTotalProdutosMensais() {
        return vendasMensais.stream().mapToDouble(Venda::getValorProdutos).sum();
    }

    public void listarVendasDiarias() {
        for (Venda venda : vendasMensais) {
            System.out.println(venda);
        }
    }

    public String extratoVenda() {
        if (carrinho.getFilme() == null || carrinho.getSessao() == null) {
            return "Erro ao gerar extrato: filme ou sessão não selecionado.";
        }

        return "Extrato da venda{" +
                "valorTotalIngressos: " + valorTotalIngressos() +
                ", filme selecionado: " + carrinho.getFilme().getTitulo() +
                ", sessao: " + carrinho.getSessao().getHorarioInicio().format(DateTimeFormatter.ofPattern("HH:mm")) + ", " + carrinho.getSessao().getSalas() +
                ", Poltrona(s) selecionada(s): " + carrinho.getPoltronasSelecionadas() +
                ", valorTotalProdutos: " + valorTotalProdutos() +
                ", Produto selecionado: " + (carrinho.getProdutosSelecionados() != null ? carrinho.getProdutosSelecionados() : "Nenhum produto selecionado") +
                ", valorTotalCompra: " + valorTotalCompra() +
                ", Tenha uma ótima experiência no CineDjamas " +
                '}';
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "valorIngresso=" + valorIngresso +
                ", valorTotalIngressos: " + valorTotalIngressos() +
                ", valorTotalProdutos: " + valorTotalProdutos() +
                ", valorTotalCompra: " + valorTotalCompra() +
                '}';
    }
}