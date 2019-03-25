import java.util.ArrayList;

public class lab7 {
    public static final int[] INTEGERS = new int[10];
    //public static final String[] STRINGS = new String[10];
    public static final ArrayList<String> STRINGS = new ArrayList<String>();

    public static void main(String[] args){
        for(int i = 0; i< 10;i++){
            INTEGERS[i]=i;
        }

        STRINGS.add("zero");
        //STRINGS[0] = "one";
        //STRINGS[0] = "two";
        //STRINGS[0] = "three";
        //STRINGS[0] = "four";
        //STRINGS[0] = "five";
        //STRINGS[0] = "six";
        //STRINGS[0] = "seven";
        //STRINGS[0] = "eight";
        //STRINGS[0] = "nine";

        for (int j = 0; j <INTEGERS.length; j++){
            System.out.println(j + "was \'" + STRINGS.get(j) + "");
        }


        ArrayList<String> myString = new ArrayList<>();
        final boolean addnate = myString.add("nate");
    }
}
//_________
//enhanced 4 look example
import java.util.ArrayList;

public class lab7 {
    public static final int[] INTEGERS = new int[10];
    //public static final String[] STRINGS = new String[10];
    public static final ArrayList<String> STRINGS = new ArrayList<String>();

    public static void main(String[] args){
        for(int i = 0; i< 10;i++){
            INTEGERS[i]=i;
        }

        STRINGS.add("zero");
        //STRINGS[0] = "one";
        //STRINGS[0] = "two";
        //STRINGS[0] = "three";
        //STRINGS[0] = "four";
        //STRINGS[0] = "five";
        //STRINGS[0] = "six";
        //STRINGS[0] = "seven";
        //STRINGS[0] = "eight";
        //STRINGS[0] = "nine";

        for (int j = 0; j <INTEGERS.length; j++){
            System.out.println(j + "was \'" + STRINGS.get(j) + "");
        }

        for (String s: STRINGS){
            System.out.println("s = " +s);
        }


        ArrayList<String> myString = new ArrayList<>();
        final boolean addnate = myString.add("nate");
    }
}
