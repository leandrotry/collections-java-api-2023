package main.java.OperacoesBasicas.Set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> agendaContatos;

    public AgendaContatos(){
        this.agendaContatos = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContato(){
        return agendaContatos;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> nomePesquisado = new HashSet<>();
        for(Contato c : agendaContatos){
            if (c.getNome().startsWith(nome)) {
                nomePesquisado.add(c);
            }
        }
        return nomePesquisado;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for(Contato c : agendaContatos){
            if(c.getNome() == nome){
                c.setNumero(novoNumero);
            }
        }
    }



    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("teste", 1234);
        contatos.adicionarContato("teste", 1233);
        contatos.adicionarContato("teste2", 1235);
        contatos.adicionarContato("teste4", 1236);
        contatos.adicionarContato("teste3", 1234);
        System.out.println(contatos.pesquisarPorNome("t"));
        contatos.atualizarNumeroContato("teste4", 654321);
        System.out.println(contatos.exibirContato());


    }
}
