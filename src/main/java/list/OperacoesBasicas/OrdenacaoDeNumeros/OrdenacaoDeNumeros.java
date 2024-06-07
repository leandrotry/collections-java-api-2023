package main.java.list.OperacoesBasicas.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeNumeros{
    List<Integer> numerosList;
    public OrdenacaoDeNumeros(){
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenada = new ArrayList<>(numerosList);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenadaReversa = new ArrayList<>(numerosList);
        listaOrdenadaReversa.sort(Collections.reverseOrder());
        return listaOrdenadaReversa;
    }

    @Override
    public String toString() {
        return "OrdenacaoDeNumeros{" +
                "numerosList=" + numerosList +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoDeNumeros numeros = new OrdenacaoDeNumeros();
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(34);
        numeros.adicionarNumero(42);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(40);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(45);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }

}
