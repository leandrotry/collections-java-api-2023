package main.java.list.OperacoesBasicas.Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {
    private Set<Convidados> convidadosSet;

    public ConjuntoDeConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidados convidadosRemover = null;
        for(Convidados c : convidadosSet){
            if(codigoConvite == c.getCodigoConvite()){
                convidadosRemover = c;
            }
        }
        convidadosSet.remove(convidadosRemover);
    }
    public Set<Convidados> imprimirConvidados(){
        return convidadosSet;
    }

    public static void main(String[] args) {
        ConjuntoDeConvidados convidados = new ConjuntoDeConvidados();
        convidados.adicionarConvidado("leandro", 12345);
        convidados.adicionarConvidado("leandro2", 1234);
        convidados.adicionarConvidado("leandro3", 12347);
        convidados.adicionarConvidado("leandro4", 12345);
        System.out.println(convidados.imprimirConvidados());
        convidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println(convidados.imprimirConvidados());
    }
}
