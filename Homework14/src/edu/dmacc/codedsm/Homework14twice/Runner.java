package edu.dmacc.codedsm.Homework14twice;

public class Runner {

    public static void main( String[] args ) {


        FullPackage FullPackageObject = new FullPackage("reg", "blow", "both", "yuck", "almound", "na" +
                "both");
        System.out.println(FullPackageObject);
        QuickPackage QuickPackageObject = new QuickPackage("flea", "both", "paws");
        System.out.println(QuickPackageObject);
        PersonAnimal PersonAnimalObject = new PersonAnimal("Buffy", "Jody");
        System.out.println(PersonAnimalObject);


    }
}


