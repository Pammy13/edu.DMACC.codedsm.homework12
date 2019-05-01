package edu.dmacc.codedsm.ExtraCreditOOP;

public class Runner{
    public static void main( String[] args ) {
        YummyStore store = new Gummies();
        OpenerImpl oe = new OpenerImpl();
        oe.setName("Sarah");
        oe.setPosition("Head Baker");
        boolean storeIsOpen = store.openStore(oe.getName());
        System.out.println(storeIsOpen ? "yeah": "no!");  //ternary

    }


    }

