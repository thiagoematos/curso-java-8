package _01_revisao.prints._06;

public class Main {

    public static void main(String[] args) {
        MinhaClasse<Integer> objetoNumerico = new MinhaClasse<>();
        objetoNumerico.meuMetodo(1);

        MinhaClasse<String> objetoString = new MinhaClasse<>();
        objetoString.meuMetodo("UM");

        Integer doisNumerico = MinhaClasse.metodoEstatico(2);
        String doisString = MinhaClasse.metodoEstatico("DOIS");

        // Integer tresMisto = MinhaClasse.metodoEstatico("TRES");
    }

}
