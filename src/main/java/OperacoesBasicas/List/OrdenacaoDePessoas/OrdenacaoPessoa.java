package main.java.OperacoesBasicas.List.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;
    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoaList.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
        pessoa.adicionarPessoa("leandro", 27, 1.82);
        pessoa.adicionarPessoa("camila", 25, 1.70);
        pessoa.adicionarPessoa("cida", 53, 1.65);
        System.out.println(pessoa.ordenarPorIdade());
        System.out.println(pessoa.ordenarPorAltura());

    }
}
