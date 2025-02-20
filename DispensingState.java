public class DispensingState implements VendingMachineState{
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Dispensing Item... Please wait!");
    }
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Dispensing Item... Please wait!");
    }
    public void dispenseItem(VendingMachine vendingMachine) {
        vendingMachine.reduceItemInventory();
        System.out.println("Item dispensed! Returning to Idle State!");
        vendingMachine.setVendingMachineState(new IdleState());
    }
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending Machine has now been set to Out of Order!");
        vendingMachine.setVendingMachineState(new OutOfOrderState());
    }
    
}
