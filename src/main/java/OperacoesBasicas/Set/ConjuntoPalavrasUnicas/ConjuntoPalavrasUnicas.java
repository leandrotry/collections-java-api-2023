package main.java.OperacoesBasicas.Set.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraUnica = new HashSet<>();

    public Set<String> getPalavraUnica() {
        return palavraUnica;
    }

    public void adicionarPalavra(String palavra){
        palavraUnica.add(palavra);
    }

    public void removerPalavra(String palavraARemover){
        palavraUnica.removeIf(s -> s.equalsIgnoreCase(palavraARemover));
        /*for(String s : palavraUnica){
            if (s.equalsIgnoreCase(palavraARemover)) {
                palavraUnica.remove(s);
            }
        }*/
    }

    public String verificarPalavra(String palavra){
        for(String s : palavraUnica){
            if(s.equalsIgnoreCase(palavra)){
                palavra = s;
            }
        }
        return palavra;

        //return palavraUnica.contains(palavra) ? palavra: "Não contem a palavra buscada!";
    }

    public Set<String> exibirPalavrasUnicas(){
        return palavraUnica;
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavraUnica=" + palavraUnica +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("leandro");
        conjunto.adicionarPalavra("leandro");
        conjunto.adicionarPalavra("teste");
        conjunto.adicionarPalavra("void");

        System.out.println(conjunto.exibirPalavrasUnicas());
        conjunto.removerPalavra("zeandro");
        System.out.println(conjunto.exibirPalavrasUnicas());
        System.out.println("Buscado: " + conjunto.verificarPalavra("Leandro"));
    }
}
