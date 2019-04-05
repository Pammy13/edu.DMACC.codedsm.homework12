package HW142question;

public class CashRegister {

    private int itemCount;
    private double totalPrice;

    public CashRegister()
    {
        itemCount = 0;
        totalPrice = 0;
    }
    public void addItem(double price)
    {
        itemCount++;
        totalPrice = totalPrice + price;
    }
    public double getTotalPrice()
    {

        return totalPrice;
    }
    public int getItemCount()
    {
        return itemCount;
    }
    public void clear()
    {
        itemCount = 0;
        totalPrice = 0;
    }

    @Override
    public String toString() {
        return "CashRegister{" +
                "itemCount=" + itemCount +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;

    }


    }

