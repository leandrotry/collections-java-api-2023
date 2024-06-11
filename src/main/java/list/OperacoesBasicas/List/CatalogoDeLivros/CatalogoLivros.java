package main.java.list.OperacoesBasicas.List.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        this.listaLivros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> autoresList = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l: listaLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    autoresList.add(l);
                }
            }
        }else{
            System.out.println("lista vazia!");
        }
        return autoresList;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> anoList = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    anoList.add(l);
                }
            }
        }else{
            System.out.println("lista Vazia");
        }
        return anoList;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> tituloList = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    tituloList.add(l);
                }
            }
        }else{
            System.out.println("lista Vazia");
        }
        return tituloList;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Leandro", 1996);
        catalogo.adicionarLivro("Livro 2", "Leandro Torres", 1997);
        catalogo.adicionarLivro("Livro 3", "Leandro", 2000);
        catalogo.adicionarLivro("Livro 1", "Camila", 2023);

        System.out.println(catalogo.pesquisarPorAutor("Leandro"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(1996, 2000));
        System.out.println(catalogo.pesquisarPorAutor("Camila"));
    }
}