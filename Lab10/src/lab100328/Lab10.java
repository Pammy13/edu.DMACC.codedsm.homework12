package lab100328;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Lab10 {

    private List<String> equipment;
    private List<String> employees;
    private List<String> inventory;
    private Double cashOnHand;
    private Boolean isOpen;

        // Bakery
    public Lab10() {
        this.equipment = Arrays.asList();
        this.employees = Arrays.asList();
        this.inventory = new ArrayList<>();
        this.cashOnHand = 100.0d;
        this.isOpen = true;
    }

    public abstract List<String> bakeTheGoods;

    public Boolean openTheStore(String employeeName) {
        return false;
    }

    private void performInventory(List<String> goods) {
    }

    public String performSale(String good, String customerName, String DoublemoneyAmount) {
        return "receipt";
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;

    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public Double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(Double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "Lab10{" +
                "equipment=" + equipment +
                ", employees=" + employees +
                ", inventory=" + inventory +
                ", cashOnHand=" + cashOnHand +
                ", open=" + open +
                '}';
    }
}


