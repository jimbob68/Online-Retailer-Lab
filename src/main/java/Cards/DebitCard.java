package Cards;

public class DebitCard extends PaymentCard {
    private int sortCode;
    private int accountNumber;


    public DebitCard(int cardNumber, int expiryDate, int cvc) {
        super(cardNumber, expiryDate, cvc);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }
}