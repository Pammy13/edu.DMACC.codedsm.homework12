package edu.dmacc.codedsm.mvc.repository;

import edu.dmacc.codedsm.mvc.PayrollData;

public class ConsoleRepository1 implements Repository{
    @Override
    public void save( PayrollData data ) {
        System.out.println("Saved the data!" + data.toString());
    }
}
