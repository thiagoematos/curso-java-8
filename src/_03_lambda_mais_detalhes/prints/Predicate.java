package _03_lambda_mais_detalhes.prints;

@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);
}