public class ItemSelectedState implements VendingMachineState{
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item already selected! Proceed to insert coin to dispense item!");
    }
    public void insertCoin(VendingMachine vendingMachine) {
        if (vendingMachine.getItemInvetory()!=0) {
            vendingMachine.addBalance();
            System.out.println("Coin inserted! Dispensing Item...");
            vendingMachine.setVendingMachineState(new DispensingState());
        }
        else
        System.out.println("Item is out of stock!");
    }
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Insert coin first before dispensing item!");
    }
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending Machine has now been set to Out of Order!");
        vendingMachine.setVendingMachineState(new OutOfOrderState());
    }
}
