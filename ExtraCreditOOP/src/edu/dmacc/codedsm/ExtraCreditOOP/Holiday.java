package edu.dmacc.codedsm.ExtraCreditOOP;

public class Holiday extends YummyStore {

    @Override
    public boolean openStore( String employeeName ) {
        if (employeeName != null && employeeName.length() > 0) {
            System.out.println(employeeName + " just opened the Holiday store");
            return true;
        }else {
            return false;
        }
    }
}
