package Cards;

import java.util.ArrayList;

public abstract class PaymentCard {


    private int cardNumber;
    private int expiryDate;
    private int cvc;
    private ArrayList<Double> charges;

    public PaymentCard(int cardNumber, int expiryDate, int cvc){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvc = cvc;
        this.charges = new ArrayList<Double>();

    }
    public int getCardNumber() {
        return cardNumber;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public int getCvc() {
        return cvc;
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }
    public int getNumberOfCharges(){
        return charges.size();
    }

}
