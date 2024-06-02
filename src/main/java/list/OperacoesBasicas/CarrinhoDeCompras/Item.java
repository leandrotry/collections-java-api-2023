package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

public class Item {
    private String nome;
    private double preço;
    private int quantidade;

    public Item(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreço(){
        return this.preço;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preço=" + preço +
                ", quantidade=" + quantidade +
                '}';
    }
}
