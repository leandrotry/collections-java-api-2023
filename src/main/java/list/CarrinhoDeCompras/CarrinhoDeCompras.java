package main.java.list.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    private List<Item> listaDeItems;

    public CarrinhoDeCompras() {
        this.listaDeItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeItems.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item i: listaDeItems){
        if(i.getNome().equalsIgnoreCase(nome)){
            itemsParaRemover.add(i);
            }
        }
        listaDeItems.removeAll(itemsParaRemover);
    }
    public void exibirItens(){
        System.out.println(listaDeItems);
    }
    public double calcularValorTotal(){
        double valorTotalCarrinho = 0;
        for (Item i: listaDeItems){
            valorTotalCarrinho += i.getPreço() * i.getQuantidade();
        }
        return valorTotalCarrinho;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("mouse", 250, 3);
        carrinho.adicionarItem("mouse", 270, 1);
        carrinho.adicionarItem("teclado", 250, 1);
        System.out.println("total "+ carrinho.calcularValorTotal());
        carrinho.removerItem("mouse");
        carrinho.exibirItens();
        System.out.println("total "+carrinho.calcularValorTotal());
    }
}
