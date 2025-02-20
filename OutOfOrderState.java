public class OutOfOrderState implements VendingMachineState{
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is Out of Order! Select Item is Not Allowed!");
    }
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is Out of Order! Insert Coin is Not Allowed!");
    }
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is Out of Order! Dispense Item is Not Allowed!");
    }
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is already set to Out of Order!");
    }
}
