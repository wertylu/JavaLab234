package milk.products.iot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import nl.jqno.equalsverifier.EqualsVerifier;

class MilkProductTest {

    @Test
    void testToString() {
        MilkProduct m1 = new MilkProduct("milk","Poland",1,23, true);
        MilkProduct m2 = new MilkProduct("maslo", "Ukraine", 0.5, 62, false);
        MilkProduct m3 = new MilkProduct("cheese", "Poland", 2, 190, true);

        assertEquals("milk, Poland, Price: 23.0, Home made: true\n", m1.toString());
        assertEquals("maslo, Ukraine, Price: 62.0, Home made: false\n", m2.toString());
        assertEquals("cheese, Poland, Price: 190.0, Home made: true\n", m3.toString());
    }

    @Test
    void testEqualsAndHashMilkProduct() {
        EqualsVerifier.simple().forClass(MilkProduct.class).verify();
    }
    @Test
    void testEqualsAndHashCheese() {
        EqualsVerifier.simple().forClass(Cheese.class).verify();
    }
    @Test
    void testEqualsAndHashMilk() {
        EqualsVerifier.simple().forClass(Milk.class).verify();
    }
    @Test
    void testEqualsAndHashSourCream() {
        EqualsVerifier.simple().forClass(SourCream.class).verify();
    }

}
