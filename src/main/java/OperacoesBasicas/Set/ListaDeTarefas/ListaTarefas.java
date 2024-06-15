package main.java.OperacoesBasicas.Set.ListaDeTarefas;
import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Set<Tarefa> tarefasARemover = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if (t.getDescricao() == descricao) {
                tarefasARemover.add(t);
            }
        }
        for(Tarefa r : tarefasARemover){
            tarefaSet.remove(r);
        }
    }

    public Set<Tarefa> exibirTarefas(){
        return this.tarefaSet;
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa buscada : tarefaSet){
            if (buscada.getDescricao() == descricao){
                buscada.setTarefaConcluida(true);
                tarefaSet.add(buscada);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa buscada : tarefaSet){
            if(buscada.getDescricao() == descricao){
                buscada.setTarefaConcluida(false);
                tarefaSet.add(buscada);
                break;
            }
        }
    }
    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Cortar Cana");
        lista.adicionarTarefa("Despalhar");
        lista.adicionarTarefa("Moer");
        lista.adicionarTarefa("Separar Bagaço");
        lista.adicionarTarefa("Filtrar Caldo");


        System.out.println(lista.exibirTarefas());;
        lista.marcarTarefaConcluida("Despalhar");
        System.out.println(lista.contarTarefas());
        lista.removerTarefa("Cortar Cana");
        System.out.println(lista.exibirTarefas());
        lista.marcarTarefaPendente("Despalhar");
        System.out.println(lista.exibirTarefas());
        lista.limparListaTarefas();
        System.out.println(lista.contarTarefas());
        System.out.println(lista.exibirTarefas());
    }
}