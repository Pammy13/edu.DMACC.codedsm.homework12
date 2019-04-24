package edu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner{
    public static void main( String[] args ) {

        Function<String, Integer> books = s -> s.length();
        BiFunction<String, String, Integer> movies = ( x, y) -> x.length() + y.length();
        Consumer<String> cassettes =  x -> System.out.println(x);
        Supplier<String> records = () -> "Hello";

        System.out.println(books.apply( "Ryla"));
        System.out.println(movies.apply(  "Hellfighters", "Ghost"));
        cassettes.accept("Teagan");
        System.out.println(records.get());
}
}