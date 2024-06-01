package main.java.list.OperacoesBasicas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");

        System.out.println("Número de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("Tarefa 1");
        listaTarefas.obterDescricoesTarefas();
        System.out.println("Número de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
    }
}