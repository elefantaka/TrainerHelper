package systemModel;

public class MultiplexedEntry {

    private int numberOfEntries;
    public static int price = 15;

    public MultiplexedEntry(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    public int howManyToPay(int payment){
        payment = numberOfEntries*price;
        return payment;
    }

    @Override
    public String toString() {
        return "MultiplexedEntry{" +
                "numberOfEntries=" + numberOfEntries +
                '}';
    }
}
