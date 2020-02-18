package Cards;

public class GiftCard {



    private String vendor;
    private double balance;

    public GiftCard(String vendor, double balance){
        this.vendor = vendor;
        this.balance = balance;
    }
    public String getVendor() {
        return vendor;
    }

    public double getBalance() {
        return balance;
    }
}
