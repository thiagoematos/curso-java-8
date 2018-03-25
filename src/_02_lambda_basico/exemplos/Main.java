package _02_lambda_basico.exemplos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static util.StringGenerator.generate;

public class Main {

    private static void ordenacaoComClasseAnonima(List<String> array) {
        Collections.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
    }

    private static void ordenacaoComLambda(List<String> array) {
        array.sort((o1, o2) -> o1.length() - o2.length());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> nomes = generate();

        Operacao ordenarComClasseAnonima = () -> ordenacaoComClasseAnonima(nomes);
        Operacao ordenarComLambda = () -> ordenacaoComLambda(nomes);

        CompletableFuture<Void> lambda =
                CompletableFuture.runAsync(() ->
                        MedidorDeTempo
                                .inicializar("Lambda", ordenarComLambda)
                                .calcular()
                                .imprimir()
                );

        CompletableFuture<Void> classeAnonima =
                CompletableFuture.runAsync(
                        () -> MedidorDeTempo
                                .inicializar("Classe Anônima", ordenarComClasseAnonima)
                                .calcular()
                                .imprimir()
                );

        lambda.get();
        classeAnonima.get();
    }

}
