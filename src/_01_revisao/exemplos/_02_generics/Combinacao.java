package _01_revisao.exemplos._02_generics;

public class Combinacao<X, Y> {

    private final X x;
    private final Y y;

    Combinacao(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

}
