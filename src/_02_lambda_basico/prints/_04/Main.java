package _02_lambda_basico.prints._04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static util.Console.print;

public class Main {

    public static void main(String[] args) {
        Button ok = new Button();
        // Interface Funcional: Convertendo uma classe anônima em uma função:
        // Obrigatório
        // ( ) Omitir interface e nome do método
        // ( ) Separar argumentos e corpo da função com lambda
        // Opcional
        // ( ) Omitir tipo dos parâmetros
        // ( ) Remover parênteses se for só um parâmetro
        // ( ) Remover chaves e ponto-e-vírgula se tiver somente uma linha
        // Hi-Level
        // ( ) Formatar
        // ( ) Referenciar somente o método
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                print( e );
            }
        });
    }

}
