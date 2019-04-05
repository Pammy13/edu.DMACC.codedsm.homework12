package edu.dmacc.codedsm.Homework14twice;

import java.util.List;

public class QuickPackage {
    public String shampoo;
    public String earcleaning;
    public String nailtrim;

    public QuickPackage() {
        this.shampoo = shampoo;
        this.earcleaning = earcleaning;
        this.nailtrim = nailtrim;

    }

    public QuickPackage( String type, String ear, String nail ) {
        shampoo = type;
        earcleaning = ear;
        nailtrim = nail;
    }


    @Override
    public String toString() {
        return "QuickPackage{" +
                "shampoo='" + shampoo + '\'' +
                ", earcleaning='" + earcleaning + '\'' +
                ", nailtrim='" + nailtrim + '\'' +
                '}';
    }

    public String getShampoo() {
        return shampoo;
    }

    public void setShampoo( String shampoo ) {
        this.shampoo = shampoo;
    }

    public String getEarcleaning() {
        return earcleaning;
    }

    public void setEarcleaning( String earcleaning ) {
        this.earcleaning = earcleaning;
    }

    public String getNailtrim() {
        return nailtrim;
    }

    public void setNailtrim( String nailtrim ) {
        this.nailtrim = nailtrim;
    }
}