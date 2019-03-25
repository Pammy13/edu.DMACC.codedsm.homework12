package edu.dmacc.codedsm.homework9;

import java.util.ArrayList;

public class RandomInteger {

    public static void main(String[] args) {
        ArrayList<Integer> firstHeathList = new ArrayList<>();

        firstHeathList.add(110);
        firstHeathList.add(90);
        firstHeathList.add(120);
        firstHeathList.add(100);
        firstHeathList.add(80);


        ArrayList matches = new ArrayList();
        for (double element : firstHeathList) {
            if (element > 100) {
                matches.add(element);
            }
            System.out.println(firstHeathList);
            System.out.println(matches);
        }


        //secondAmandaList.add("Ten");
        //secondAmandaList.add("Blue");

        //secondAmandaList.addAll(firstHeathList);

        //System.out.println(secondAmandaList);
        //secondAmandaList.clear();


    }
}
