package _01_revisao.exemplos._02_generics;

import util.Console;

import static util.Console.print;

public class Main {

    public static void main(String[] args) {
        String[] nomes = {"Rose", "Howard", "Carolyn"};

        String pessoaSorteada = Sorteio.sortear(nomes);
        Console.print("Pessoa sorteada", pessoaSorteada);

        Cor[] cores = {Cor.AZUL, Cor.VERDE, Cor.VERMELHO};
        Cor corSorteada = Sorteio.sortear(cores);
        Console.print("Cor sorteada", corSorteada);

        String letrasDoAlfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letraSorteada = Sorteio.sortear(letrasDoAlfabeto);
        Console.print("Letra sorteada", letraSorteada);

        Combinacao<String, Integer> endereco = new Combinacao<>("Av. Sete de Setembro", 12);
        Combinacao<String, Cor> roupa = new Combinacao<>("Vestido", Cor.VERMELHO);
        Combinacao<String, String> duplaSertaneja = new Combinacao<>("Leandro", "Leonardo");
        Combinacao[] combinacoes = {endereco, roupa, duplaSertaneja};
        Console.print(combinacoes);
    }

}
