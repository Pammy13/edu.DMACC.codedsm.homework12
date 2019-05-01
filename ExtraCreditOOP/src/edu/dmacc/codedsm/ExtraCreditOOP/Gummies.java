package edu.dmacc.codedsm.ExtraCreditOOP;

public class  Gummies extends YummyStore {

    @Override
    public boolean openStore( String employeeName ) {
        if (employeeName != null && employeeName.length() > 0) {
            System.out.println(employeeName + " just opened the Gummies store");
            return true;
        }else {
            return false;
        }

    }

}
