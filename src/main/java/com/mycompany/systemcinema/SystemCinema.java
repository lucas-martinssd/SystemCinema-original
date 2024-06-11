/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemcinema;

import java.io.IOException;

/**
 *
 * @author Lucas
 */
public class SystemCinema {
    
    public static void main(String[] args) throws IOException {
        
        /*
        ///Questão 1
        {
        Diagrama de Classes feito.
        }
        
        ///Questão 2
        {
        Encapsulamento feito para apenas Funcionario e Proprietario interagirem com o sistema.
        }
        
        ///Questão 3
        {
        Todas as classes com método toString()
        }
    
        ///Questão 4
        {
        //Cliente
        {
        public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario, 
            String preferenciaDeFilme, String preferenciaDeGenero, String loginClienteOriginal,
            String senhaClienteOriginal) {
            super(name, sobrenome, endereco, telefone, cpf, aniversario);
            this.preferenciaDeFilme = preferenciaDeFilme;
            this.preferenciaDeGenero = preferenciaDeGenero;
            this.loginClienteOriginal = loginClienteOriginal;
            this.senhaClienteOriginal = senhaClienteOriginal;
            setCategoria("Cliente");
            this.vendas = new ArrayList<>();
            contadorClientePrivado++;
        }
        }
        
        //Funcionario
        {
        public Funcionario(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario, String senhaFuncionarioOriginal, String loginFuncionarioOriginal) {
            super(name, sobrenome, endereco, telefone, cpf, aniversario);
            this.senhaFuncionarioOriginal = senhaFuncionarioOriginal;
            this.loginFuncionarioOriginal = loginFuncionarioOriginal;
            setCategoria("Funcionario");
        }
        }
        
        //Proprietario
        {
        public Proprietario(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario, String senhaProprietarioOriginal, String loginProprietarioOriginal){
            super(name, sobrenome, endereco, telefone, cpf, aniversario);
            this.senhaProprietarioOriginal = senhaProprietarioOriginal;
            this.loginProprietarioOriginal = loginProprietarioOriginal;
            setCategoria("Proprietario");
        }
        }
        }

        //Questão 5
        
        Estoque estoque = new Estoque();
        
        Caixa.inicializarBalcoes(estoque);
        Caixa[] balcoes = Caixa.getBalcoes();

        for (int i = 0; i < balcoes.length; i++)
        {
            System.out.println("Balcao " + (i + 1) + ": " + balcoes[i]);
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
        
        ///Questao 8
         System.out.println("Dados das vendas diárias:");
        caixa1.listarVendasDiarias();

        System.out.println("\nDados dos clientes:");
        gestaoDeClientes.listarClientes();
        
        ///Questão 9
        {
        Produtos, Filmes e Clientes estão salvos de forma dinâmica.
        
        Produto produto = new Produto();
        Filme filme = new Filme();
        Cliente cliente = new Cliente();
        
        }
        
        ///Questao 10
        {
        caixa1.extratoVenda();
        Repositorys.salvarClientesComVendas(gestaoDeClientes.getListaDeClientes(), caixa1.getVendasPorCliente()); 
        
        GestaoDeClientes gestaoDeClientes = new GestaoDeClientes();
        Caixa caixa = new Caixa(new Carrinho(new Estoque()));

        gestaoDeClientes.cadastroDeCliente();

        System.out.println("Informe o CPF do cliente para a venda: ");
        Scanner scanner = new Scanner(System.in);
        String cpf = scanner.nextLine();

        Cliente cliente = gestaoDeClientes.buscarClientePorCpf(cpf);
        if (cliente != null) {
            caixa.efetuarPagamento(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }

        // Exibir vendas do cliente
        System.out.println("Vendas do cliente: " + cliente.getVendas());
        } 
        
        ///Questao 11
        {
        //Private
        
        public class Cliente extends Pessoa {
        
            private static int contadorClientePrivado;
        
            public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario, 
                   String preferenciaDeFilme, String preferenciaDeGenero, String loginClienteOriginal,
                   String senhaClienteOriginal) {
                super(name, sobrenome, endereco, telefone, cpf, aniversario);
                this.preferenciaDeFilme = preferenciaDeFilme;
                this.preferenciaDeGenero = preferenciaDeGenero;
                this.loginClienteOriginal = loginClienteOriginal;
                this.senhaClienteOriginal = senhaClienteOriginal;
                setCategoria("Cliente");
                this.vendas = new ArrayList<>();
                contadorClientePrivado++;
            }
        
            public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
                super(name, sobrenome, endereco, telefone, cpf, aniversario);
                // Incrementar contador privado
                contadorClientePrivado++;
            }
            
            public static int getContadorClientePrivado() {
                return contadorClientePrivado;
            }

            public static void setContadorClientePrivado(int contadorClientePrivado) {
                Cliente.contadorClientePrivado = contadorClientePrivado;
            }
        
        public class Sistema {

        public int getContadorClientePrivado() {
            return Cliente.getContadorClientePrivado();
        }

        public void setContadorClientePrivado(int contador) {
            Cliente.setContadorClientePrivado(contador);
        }
        
        //Protected
         public class Cliente extends Pessoa {
        
           protected static int contadorClienteProtected;
        
            public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario, 
                   String preferenciaDeFilme, String preferenciaDeGenero, String loginClienteOriginal,
                   String senhaClienteOriginal) {
                super(name, sobrenome, endereco, telefone, cpf, aniversario);
                this.preferenciaDeFilme = preferenciaDeFilme;
                this.preferenciaDeGenero = preferenciaDeGenero;
                this.loginClienteOriginal = loginClienteOriginal;
                this.senhaClienteOriginal = senhaClienteOriginal;
                setCategoria("Cliente");
                this.vendas = new ArrayList<>();
                contadorClienteProtected++;
            }
        
            public Cliente(String name, String sobrenome, String endereco, String telefone, String cpf, LocalDate aniversario) {
                super(name, sobrenome, endereco, telefone, cpf, aniversario);
                contadorClienteProtected++;
            }
        
        public class Sistema {

        public int getContadorClienteProtected() {
            return Cliente.contadorClienteProtected;
        }

        public void setContadorClienteProtected(int contador) {
            Cliente.contadorClienteProtected = contador;
        }

        //Vantagens e Desvantagens
        
        /Private: 
        Vantagens: Controle de acesso, promove o encapsulamento, ocultando os detalhes de implementação, facilita a manutenção. 
        Desvantagens: Código adicional, aumento da complexidade.
        
        /Protected:
        Vantagens: Menos código, pois a variável pode ser acessada diretamente das sublasses e classes do mesmo pacote, facilita o 
        acesso sem precisar de códigos adicionais.
        Desvantagens: Não contem o principio de encapsulamento, tornando o código mais difícil de entender e manter, menor controle
        sobre como a variável é modificada.
        
        }
        
        ///Questao 12
        {
        Produto.getN_INSTANCIAS();
        
        Cliente cliente1 = new Cliente("Lucas", "Martins", "Diamantina", "123456789", "11122233344", LocalDate.of(2001, 11, 07), "Ação", "Drama", "lucas", "123");
        Cliente cliente2 = new Cliente("Enzo", "Veloso", "Diamantina", "987654321", "55566677788", LocalDate.of(2001, 12, 5), "Comédia", "Romance", "enzo", "123");
        
        Sistema sistema = new Sistema();
        System.out.println("Contador de Clientes: " + sistema.getContadorClientePrivado());
        }
         
        //Questao 13
        ComparacoesFilme.comparaNomes();
        ComparacoesFilme.compareTotalDuracao();
        ComparacoesFilme.compareTotalEspectadores();
        
        ComparacoesVenda.compararPorValorTotal();
        ComparacoesVenda.compararPorValorIngressos();
        ComparacoesVenda.compararPorValorProdutos();
        
        GestaoDeFilmes gestaoDeFilmesas = new GestaoDeFilmes();

        gestaoDeFilmes.cadastraFilme("Titanic", "Acao", Duration.ofMinutes(120));
        gestaoDeFilmes.cadastraFilme("Procurando Nemo", "Animacao", Duration.ofMinutes(90));
        gestaoDeFilmes.cadastraFilme("Avatar", "Ficcao Cientifica", Duration.ofMinutes(150));
        gestaoDeFilmes.cadastraFilme("Matrix", "Ficcao Cientifica", Duration.ofMinutes(136));
        gestaoDeFilmes.cadastraFilme("Interestelar", "Ficcao Cientifica", Duration.ofMinutes(169)); 
         
        ///Questao 14
        {
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
        
        ///Questao 15
        {
        GestaoDeClientes gestaoClientes = new GestaoDeClientes();
        
        Cliente cliente1 = new Cliente("Lucas", "Martins", "Diamantina", "123456789", "11122233344", LocalDate.of(2001, 11, 07), "Ação", "Drama", "lucas", "123");
        Cliente cliente2 = new Cliente("Enzo", "Veloso", "Diamantina", "987654321", "55566677788", LocalDate.of(2001, 12, 5), "Comédia", "Romance", "enzo", "123");
        
        gestaoClientes.listaDeClientes.add(cliente1);
        gestaoClientes.listaDeClientes.add(cliente2);
        
        Iterator<Cliente> iterator = gestaoClientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            System.out.println(cliente.toString());
        }
        String explicacao =
        " Criação da interface Iterable<Cliente> na classe GestaoDeClientes, que exige que a classe forneça uma implementação para o método ite"
                + "rator(), que retorna um objeto do tipo Iterator<Cliente>. A classe ClienteInterator implementa a interface Iterator<Cliente>"
                + "contendo os métodos hasNext() e next(). hasNext() verifica se ainda há elementos na lista de clientes a serem percorridos, "
                + "retorna true se gouver elementos não visitados. next() retorna o próximo elemento da lista de clientes e avança o ponteiro"
                + "para o próximo elemento, se não houver elemento ele lançca uma exceção."
                + "Foi criados dois clientes, depois chamamos o método iterator() que permite percorrer os elementos da lista de clientes."
                + "O loop percorre os elementos que nao foram visitados, verificando pelo hasNext(), e com o next() vamos obtendo o próximo"
                + "elemento. E por fim é imprimido o método toString() de cada cliente.";
        
        //foreach:
        //for (Cliente cliente : gestaoClientes.listaDeClientes) {
        //    System.out.println(cliente.toString());
        //}
        //O foreach também percorre uma coleção de elementos de forma sequencial, porem de forma mais simples mas com menos controle sobre as
        // iterações.
         
        }
        
        ///Questao 16
        // Acessa os filmes pela posição na lista
        List<Filme> filmess = gestaoDeFilmes.getFilmes();
        //Ordenacao de Filmes
        
        // Ordena a lista de Filmes pelo nome
        Collections.sort(filmess, ComparacoesFilme.comparaNomes());
        
        for (Filme filme : filmess)
        {
            System.out.println(filme);
        }
       
        // Ordena a lista de Filmes pelo total de expectadores
        Collections.sort(filmes, ComparacoesFilme.compareTotalEspectadores());
        
        // Ordena a lista de Filmes pela duracao
        Collections.sort(filmes, ComparacoesFilme.compareTotalDuracao());
        
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda(LocalDate.now(), 200.0, 150.0, 50.0));
        vendas.add(new Venda(LocalDate.now(), 300.0, 200.0, 100.0));
        vendas.add(new Venda(LocalDate.now(), 100.0, 50.0, 50.0));
        // Ordena as vendas pelo valor total
        Collections.sort(vendas, ComparacoesVenda.compararPorValorTotal());
        System.out.println("Vendas ordenadas por valor total:");
        for (Venda venda : vendas) {
            System.out.println(venda);
        }

        // Ordena as vendas pelo valor total dos ingressos
        Collections.sort(vendas, ComparacoesVenda.compararPorValorIngressos());
        System.out.println("Vendas ordenadas por valor total dos ingressos:");
        for (Venda venda : vendas) {
            System.out.println(venda);
        }

        // Ordena as vendas pelo valor total dos produtos
        Collections.sort(vendas, ComparacoesVenda.compararPorValorProdutos());
        System.out.println("Vendas ordenadas por valor total dos produtos:");
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
        
        //Questão 17
        GestaoDeClientes gestaoDeClientes = new GestaoDeClientes();
        Cliente cliente01 = (new Cliente("Lucas", "Martins", "Rua valmira pires", "11223344", "33333333333", LocalDate.of(2001, 3, 3), "Vingadores", "acao", "lucas_login", "lucas_senha"));
        Cliente cliente02 = (new Cliente("Enzo", "Veloso", "Rua valmira pires", "44332211", "44332211", LocalDate.of(2002, 4, 4), "interestellar", "ficcao", "enzo_login", "enzo_senha"));

        //Ordena a lista de clientes por ordem alfabetica
        Collections.sort(gestaoDeClientes.getListaDeClientes(), (c1, c2) -> gestaoDeClientes.compareClientesPorNome(c1, c2));
        // Teste do método find
        System.out.println("Informe qual nome deseja buscar");
        Scanner sc = new Scanner(System.in);
        String busca = sc.nextLine();
        Cliente fazerBusca = gestaoDeClientes.find(busca);
        if (fazerBusca != null)
        {
            System.out.println("Cliente encontrado: " + fazerBusca);
        }
        else
        {
            System.out.println("Cliente não encontrado");
        }

        // Teste do método binarySearch da classe Collections 
        int index = Collections.binarySearch(gestaoDeClientes.getListaDeClientes(), cliente01, (c1, c2) -> gestaoDeClientes.compareClientesPorNome(c1, c2));
        if (index >= 0)
        {
            System.out.println("Cliente encontrado: " + gestaoDeClientes.getListaDeClientes().get(index));
        }
        else
        {
            System.out.println("Cliente não.");
        }      
    */ 
    }    
}
             



