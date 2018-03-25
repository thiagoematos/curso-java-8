package _02_lambda_basico.prints._09;

import java.awt.*;

import static util.Console.print;

public class Main {

    public static void main(String[] args) {
        Button ok = new Button();
        // Interface Funcional: Convertendo uma classe anônima em uma função:
        // Obrigatório
        // (X) Omitir interface e nome do método
        // (X) Separar argumentos e corpo da função com lambda
        // Opcional
        // (X) Omitir tipo dos parâmetros
        // (X) Remover parênteses se for só um parâmetro
        // (X) Remover chaves e ponto-e-vírgula se tiver somente uma linha
        // Hi-Level
        // ( ) Formatar
        // ( ) Referenciar somente o método
        ok.addActionListener(

                                                    e  ->
                print( e )

         );
    }

}
