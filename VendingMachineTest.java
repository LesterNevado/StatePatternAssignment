public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        vendingMachine.selectItem();
        vendingMachine.insertCoin();
        vendingMachine.dispenseItem();
        vendingMachine.setOutOfOrder();
        System.out.println(vendingMachine.toString());
    }
}