package main.java.OperacoesBasicas.Set.ListaDeTarefas;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean tarefaConcluida = false;

    public String getDescricao(){
        return descricao;
    }

    public boolean isTarefaConcluida(){
        return tarefaConcluida;
    }
    public void setTarefaConcluida(boolean status){
        this.tarefaConcluida = status;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "\n" +"{" + "descricao = '" + descricao + '\'' +
                ", tarefaConcluida = " + tarefaConcluida +
                '}';
    }
}
