import Cards.GiftCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard("Amazon", 25.00);

    }
    @Test
    public void canGetVendor(){
        assertEquals("Amazon", giftCard.getVendor());
    }
    @Test
    public void canGetBalance(){
        assertEquals(25.00, giftCard.getBalance(),0.01);
    }
}
