package Cards;

import java.util.ArrayList;

public class CreditCard  extends PaymentCard{



    private double riskMultiplier;
    private double creditLimit;

    public CreditCard(int cardNumber, int expiryDate, int cvc, double riskMultiplier, double creditLimit){
        super(cardNumber, expiryDate, cvc);
        this.riskMultiplier = riskMultiplier;
        this.creditLimit = creditLimit;

    }
    public double getRiskMultiplier() {
        return riskMultiplier;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
