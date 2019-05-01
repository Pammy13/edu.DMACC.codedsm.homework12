package edu.dmacc.codedsm.ExtraCreditOOP;

import sun.java2d.pipe.OutlineTextRenderer;

public class  Chocolate extends YummyStore {

            @Override
            public boolean openStore( String employeeName ) {
                if (employeeName != null && employeeName.length() > 0) {
                    System.out.println(employeeName + " just opened the Chocolate store");
                    return true;
                }else {
                    return false;
                }

            }
        }
