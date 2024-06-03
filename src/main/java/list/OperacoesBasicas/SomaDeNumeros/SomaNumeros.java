package main.java.list.OperacoesBasicas.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for(Integer i : numerosList){
            soma += i.intValue();
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = numerosList.get(0);
        for (Integer i : numerosList) {
            if (i.intValue() > maiorNumero) {
                maiorNumero = i.intValue();
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = numerosList.get(0);
        for(Integer i : numerosList){
            if(i.intValue() < menorNumero){
                menorNumero = i.intValue();
            }
        }
        return menorNumero;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numerosList=" + numerosList +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(6);
        soma.adicionarNumero(3);
        soma.adicionarNumero(2);
        soma.adicionarNumero(9);
        soma.adicionarNumero(12);
        soma.adicionarNumero(3);
        soma.adicionarNumero(4);
        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMenorNumero());
        System.out.println(soma.toString());
    }
}
