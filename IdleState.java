public class IdleState implements VendingMachineState{
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item has been selected!");
        vendingMachine.setVendingMachineState(new ItemSelectedState());
    }
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Select an Item first before inserting coin!");
    }
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("No Item Selected! Select an Item first!");
    }
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending Machine has now been set to Out of Order!");
        vendingMachine.setVendingMachineState(new OutOfOrderState());
    }
}