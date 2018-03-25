package _01_revisao.exemplos._02_generics;

class Sorteio {

    private static int obterNumeroRandomico(int intervalo) {
        return new java.util.Random().nextInt(intervalo);
    }

    static <T> T sortear(T[] array) {
        int indice = obterNumeroRandomico(array.length);
        return array[indice];
    }

    static char sortear(String palavra) {
        int indice = obterNumeroRandomico(palavra.length());
        char letraSorteada = palavra.charAt(indice);
        return letraSorteada;
    }

}
