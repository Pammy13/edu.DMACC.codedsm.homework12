package HW142question;

public class Runner {

    public static void main(String[] args) {
        CashRegister reg1 = new CashRegister();
        reg1.addItem(3.25);
        reg1.addItem(1.95);

        CashRegister reg2 = new CashRegister();
        reg2.addItem(3.25);
        reg2.clear();

        System.out.println(reg1.getItemCount());
        System.out.println(reg1.getTotalPrice());
        System.out.println(reg2.getItemCount());
        System.out.println(reg2.getTotalPrice());

    }
}