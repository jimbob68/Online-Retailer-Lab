import Cards.CreditCard;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(12345, 1221, 345, 0.05, 5000.00);
    }
    @Test
    public void canGetCardNumber(){
        assertEquals(12345, creditCard.getCardNumber());
    }
    @Test
    public void canGetExpiryDate(){
        assertEquals(1221, creditCard.getExpiryDate());
    }
    @Test
    public void canGetCvc(){
        assertEquals(345, creditCard.getCvc());
    }
    @Test
    public void canGetRiskMultiplier(){
        assertEquals(0.05, creditCard.getRiskMultiplier(),0.01);
    }
    @Test
    public void canGetCreditLimit(){
        assertEquals(5000.00, creditCard.getCreditLimit(), 0.01);
    }
    @Test
    public void numberOfChargesStartsAtZero(){
        assertEquals(0, creditCard.getNumberOfCharges());
    }
}
