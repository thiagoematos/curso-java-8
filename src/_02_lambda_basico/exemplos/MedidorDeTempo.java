package _02_lambda_basico.exemplos;

import util.Console;

import static util.Console.print;

class MedidorDeTempo {

    private static final double ONE_BILLION = 1_000_000_000;

    private double value;
    private String label;
    private Operacao operacao;

    private MedidorDeTempo(String label, Operacao operacao) {
        this.label = label;
        this.operacao = operacao;
    }

    static MedidorDeTempo inicializar(String label, Operacao operacao) {
        Console.print("Começou", label);
        MedidorDeTempo medidorDeTempo = new MedidorDeTempo(label, operacao);
        return medidorDeTempo;
    }

    MedidorDeTempo calcular() {
        long inicio = System.nanoTime();
        operacao.executar();
        long fim = System.nanoTime();

        value = (fim - inicio) / ONE_BILLION;

        return this;
    }

    void imprimir() {
        System.out.printf("%s: %.3f seconds.\n", label, value);
    }

}
