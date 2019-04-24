import java.util.function.BiFunction;

@FunctionalInterface
public interface Apple{
    String orange (String x, String y);

    BiFunction<String, String, Integer> stringyInt =
            (String x String y) -> {
        return Integer.parseInt (x) + Integer.parseInt (y);
    };
}
