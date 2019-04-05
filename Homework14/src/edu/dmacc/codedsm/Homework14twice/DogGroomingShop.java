package edu.dmacc.codedsm.Homework14twice;

import java.util.ArrayList;
import java.util.List;

public class DogGroomingShop {

    private Object packages;
    private Object employees;
    private Object supplies;
    private Object cashOnHand;
    private Object isOpen;

    FullPackage FullPackageObject = new FullPackage("reg", "blow", "both", "yuck", "almound", "na" +
            "both");
    QuickPackage QuickPackageObject = new QuickPackage("flea", "both", "paws");
    PersonAnimal PersonAnimalObject = new PersonAnimal("Buffy", "Jody");


    @Override
    public String toString() {
        return "DogGroomingShop{" +
                "packages=" + packages +
                ", employees=" + employees +
                ", supplies=" + supplies +
                ", cashOnHand=" + cashOnHand +
                ", isOpen=" + isOpen +
                ", ";
    }


    public void setPackages( List<String> packages ) {
        this.packages = packages;
    }

    public void setEmployees( List<String> employees ) {
        this.employees = employees;
    }

    public void setSupplies( List<String> supplies ) {
        this.supplies = supplies;
    }

    public void setCashOnHand( Double cashOnHand ) {
        this.cashOnHand = cashOnHand;
    }

    public Boolean getOpen() {
        return true;
    }

    public void setOpen( Boolean open ) {
        isOpen = open;
    }

    public DogGroomingShop() {
        this.packages = new ArrayList();
        this.employees = new ArrayList();
        this.supplies = new ArrayList();
        this.cashOnHand = 200.00;
        this.isOpen = true;
    }

    public Boolean openTheStore( String employeeName ) {
        return true;
    }

    private void supplies( String supplies ) {
    }

//    public boolean getpackages( 'FullPackage QuickPackage ) {
//         return getpackage
//     }
//
//    public boolean getpackages( String FullPackage, QuickPackage ) {
//         boolean b = false;
//         return b;
//            }


    public Object getPackages() {
        return packages;
    }

    public Object getEmployees() {
        return employees;
    }

    public Object getSupplies() {
        return supplies;
    }

    public Object getCashOnHand() {
        return cashOnHand;
    }

    public Object getIsOpen() {
        return isOpen;
    }
}

