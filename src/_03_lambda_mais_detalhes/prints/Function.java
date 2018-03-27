package _03_lambda_mais_detalhes.prints;

@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}