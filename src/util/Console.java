package util;

import java.util.function.Consumer;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Console {

    public static <T> void print(String message, T[] data) {
        print(message, data, Console::print);
    }

    public static <T> void print(String message, T data) {
        print(message, data, Console::print);
    }

    private static <T> void print(String message, T data, Consumer<T> printMethod) {
        System.out.println(message + ":");
        printMethod.accept(data);
        System.out.println();
    }

    public static <T> void print(T[] array) {
        print(Stream.of(array)
                .map(Object::toString)
                .collect(joining(",", "[", "]"))
        );
    }

    public static <T> void print(T value) {
        System.out.println(value);
    }

}
