import java.util.function.BiFunction;

public class FIRunner{
    public static void main( String[] args ) {
        IntToString myFunction = ( String integerParameter ) -> {
            return Integer.toString(integerParameter);
        };

        System.out.println(myFunction.apply(5));

        Apple strawberry = ( String s ) -> {
            return s + "is a strawberry";
        };
        BiFunction<String, String, Integer> stringIntegerBiFunction;
        ( x, y ) -> Integer.parseInt(x) + Integer.parseInt(y)


        System.out.println(strawberry.orange("Dog"));

    }

    Integer somethingResult = doSomething(s:"dog",Foo:::addTwenty)
            System.out.println("somethingResult = "+somethingResult)
}
}
