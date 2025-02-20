public class VendingMachine {
    private int itemInventory;
    private int balance;
    private VendingMachineState vendingMachineState;

    public VendingMachine(int itemInventory){
        this.itemInventory = itemInventory;
        this.balance = 0;
        this.vendingMachineState = new IdleState();
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public void selectItem(){
        vendingMachineState.selectItem(this);
    }

    public void insertCoin(){
        vendingMachineState.insertCoin(this);
    }

    public void dispenseItem(){
        vendingMachineState.dispenseItem(this);
    }

    public void setOutOfOrder(){
        vendingMachineState.setOutOfOrder(this);
    }

    public int getBalance(){
        return balance;
    }

    public int getItemInvetory(){
        return itemInventory;
    }

    public void addBalance(){
        balance += 1;
    }

    public void reduceItemInventory(){
        itemInventory--;
    }

    public String toString(){
        String output = "Vending Machine Inventory: " + itemInventory + "\nVending Machine Balance: " + balance;
        return output;
    }
}
