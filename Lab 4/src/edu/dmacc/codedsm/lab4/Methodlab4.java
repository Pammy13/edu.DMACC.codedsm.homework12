package edu.dmacc.codedsm.lab4;

public class Methodlab4 {
    public static void main(String[] args) {
        int numberFive = 5;
        int numberTen = 10;
        int numberEightyFive = 85;
        int numberSixteen = 16;
        int numberTwo = 2;

        int resultone = adder(numberFive, numberTen);
        int resulttwo = subber(numberEightyFive, resultone);
        int resultthree = multi(resulttwo, numberSixteen);
        int resultfour = div(resultthree, numberTwo);

        System.out.println("resultfive = " + resultfour);


    }

    public static int adder(int x, int y) {
        return x + y;
    }

    public static int subber(int x, int y) {
        return x - y;
    }

    public static int multi(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
