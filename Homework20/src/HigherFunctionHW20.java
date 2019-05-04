import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.toList;

public class HigherFunctionHW20{

    public static void main( String[] args ) {

        List<String> animals = Arrays.asList("Bird", "Monkey", "Dog", "Cat", "Donkey");

        List<Character> wild = animals.stream()
                .flatMap(x -> x.chars().mapToObj(y -> (char) y))
                .collect(toList());
        System.out.println(wild);

        List<String> dWords = animals.stream()
                .filter(s -> s.startsWith("D"))
                .collect(toList());
        System.out.println(dWords);

        List<Integer> eachLength = animals.stream()
                .map(s -> s.length())
                .collect(toList());
        System.out.println(eachLength);

        int total = animals.stream()
                .map(String::length)
                .reduce(0, ( x1, x2 ) -> x1 + x2);
        System.out.println(total);

    }

}
