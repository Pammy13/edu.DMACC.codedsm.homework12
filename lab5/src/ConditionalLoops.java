import sun.invoke.empty.Empty;

import java.lang.reflect.Method;

public class ConditionalLoops {
    String firstClass = "Java";
    String secondClass = "Coffee";

    public static void main(String[] args) {

        String firstMethod = "";
        String secondMethod = "";

        while (!firstMethod.isEmpty()|| !secondMethod.isEmpty() {
            System.out.println("combined =" + conditionalCombiner(firstMethod, secondMethod));
            if (firstMethod.isEmpty()) {
                firstMethod = firstMethod.substring(0, firstMethod.length() - 1);
            }
            if (secondMethod.isEmpty()) {
                secondMethod = secondMethod.substring(0, secondMethod.length() - 1):
            }
        }

    }
        do {
            System.out.println("combined = " + conditionalCombiner(firstClass, secondClass));
            if (!firstClass.isEmpty()) {
                firstClass = firstClass.substring(0, firstClass.length() - 1):
            }
            if (secondClass.isEmpty()) {
                secondClass = secondClass.substring(0, secondClass.length());
            }

            }
            }

    public static String conditionalCombiner(String firstClass, String secondClass) {


        if (firstClass.isEmpty() && secondClass.isEmpty()) {
            return firstClass + "" + secondClass;
        } else if (firstClass.isEmpty()) {
            return secondClass + "" + secondClass;
        } else if (secondClass.isEmpty()) {
            return firstClass + "" + firstClass;
        } else {
            return firstClass + "" + secondClass;

        while ()

        }


    }
}
