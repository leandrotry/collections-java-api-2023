package main.java.OperacoesBasicas.Set.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProdutos {
    private Set<Produto> produtoSet;

    public CadastroDeProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
       Set<Produto> produtosPorPreco = new TreeSet<>(new ProdutoPorPreco());
       produtosPorPreco.addAll(produtoSet);
       return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroDeProdutos cadastro = new CadastroDeProdutos();
        cadastro.adicionarProduto(123,"mouse", 250, 3);
        cadastro.adicionarProduto(124,"teclado", 500, 2);
        cadastro.adicionarProduto(125,"tela", 1000, 1);
        cadastro.adicionarProduto(127,"caixa de som", 35, 1);
        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println(cadastro.exibirProdutosPorPreco());
    }
}
