package concorrence;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<Integer> tarefa1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 executada por: " + Thread.currentThread().getName());
            return 10;
        }, executor);

        CompletableFuture<Integer> tarefa2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 executada por: " + Thread.currentThread().getName());
            return 20;
        }, executor);

        CompletableFuture<Integer> tarefa3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tarefa 3 executada por: " + Thread.currentThread().getName());
            return 30;
        }, executor);

        CompletableFuture<Void> todasTarefas = CompletableFuture.allOf(tarefa1, tarefa2, tarefa3);

        todasTarefas.thenRun(() -> {
            try {
                int resultado = tarefa1.get() + tarefa2.get() + tarefa3.get();
                System.out.println("Soma dos resultados: " + resultado);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }).join();  // Bloqueia até que todas as tarefas sejam concluídas

        executor.shutdown();
    }
}
