public class SumHundred {
    public static void main(String[] args) {
        int firstInput = 6;
        int secondInput = 1;
        int numberOfLoops = 0;
        int total = 0;

        while (total < 100) {
            total = addNumbers(firstInput, secondInput, total);
            numberOfLoops++;

        }

        System.out.println(total);
        output(total, numberOfLoops);
    }

    public static int addNumbers(int firstInput, int secondInput, int priorResult) {
        return firstInput + secondInput + priorResult;

    }

    public static void output(int finalResult, int iterations) {
        System.out.println("The first result greater than 100 was " + finalResult + " and took " + iterations + " to complete");

    }
}


