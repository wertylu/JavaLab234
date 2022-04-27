package milk.products.iot;

import milk.manager.iot.Manager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class ManagerTest {
    Manager manager = new Manager();
    List<MilkProduct> milkbox = new ArrayList<>(Arrays.asList(
            new Milk ("milk","Poland",1,23, true, 23, true),
            new Cheese("cheese","Ukraine",3,142, false, "Serenada", false),
            new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2),
            new SourCream("smetana", "Greece", 0.52, 41, true, 20),
            new Milk("kefir","Germany", 0.98, 28, true, 5, true),
            new Milk("maslo", "Ukraine", 0.5, 62, false, 40, false),
            new Cheese("cheese", "Poland", 2, 190, true, "Kamamber", true),
            new SourCream("yoghurt", "Germany", 0.48, 44, true, 0),
            new Milk("milk", "Ukraine", 1, 34, false, 10, false)));


    @Test
    void sortByPriceDecr() {
        List<MilkProduct> actual = manager.sortByPrice(milkbox, true);
        List<MilkProduct> expected = new ArrayList<>(Arrays.asList(
                new Cheese("cheese", "Poland", 2, 190, true, "Kamamber", true),
                new Cheese("cheese","Ukraine",3,142, false, "Serenada", false),
                new Milk("maslo", "Ukraine", 0.5, 62, false, 40, false),
                new SourCream("yoghurt", "Germany", 0.48, 44, true, 0),
                new SourCream("smetana", "Greece", 0.52, 41, true, 20),
                new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2),
                new Milk("milk", "Ukraine", 1, 34, false, 10, false),
                new Milk("kefir","Germany", 0.98, 28, true, 5, true),
                new Milk ("milk","Poland",1,23, true, 23, true)
                ));
        assertThat(actual, is(expected));
    }

    @Test
    void sortByOriginDecr() {
        List<MilkProduct> actual = manager.sortByOrigin(milkbox, true);
        List<MilkProduct> expected = new ArrayList<>(Arrays.asList(
                new Cheese("cheese","Ukraine",3,142, false, "Serenada", false),
                new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2),
                new Milk("maslo", "Ukraine", 0.5, 62, false, 40, false),
                new Milk("milk", "Ukraine", 1, 34, false, 10, false),
                new Milk ("milk","Poland",1,23, true, 23, true),
                new Cheese("cheese", "Poland", 2, 190, true, "Kamamber", true),
                new SourCream("smetana", "Greece", 0.52, 41, true, 20),
                new Milk("kefir","Germany", 0.98, 28, true, 5, true),
                new SourCream("yoghurt", "Germany", 0.48, 44, true, 0)
                ));
        assertThat(expected, is(actual));

    }

    @Test
    void searchByHomeMadeBoolean() {
        List<MilkProduct> actual = manager.searchByHomeMadeBoolean(milkbox);
        List<MilkProduct> expected = new ArrayList<>(Arrays.asList(
                new Milk ("milk","Poland",1,23, true, 23, true),
                new SourCream("smetana", "Greece", 0.52, 41, true, 20),
                new Milk("kefir","Germany", 0.98, 28, true, 5, true),
                new Cheese("cheese", "Poland", 2, 190, true, "Kamamber", true),
                new SourCream("yoghurt", "Germany", 0.48, 44, true, 0)
        ));
        assertThat(actual, is(expected));
    }

    @Test
    void sortByPriceIncr() {
        List<MilkProduct> actual = manager.sortByPrice(milkbox, false);
        List<MilkProduct> expected = new ArrayList<>(Arrays.asList(
                new Milk ("milk","Poland",1,23, true, 23, true),
                new Milk("kefir","Germany", 0.98, 28, true, 5, true),
                new Milk("milk", "Ukraine", 1, 34, false, 10, false),
                new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2),
                new SourCream("smetana", "Greece", 0.52, 41, true, 20),
                new SourCream("yoghurt", "Germany", 0.48, 44, true, 0),
                new Milk("maslo", "Ukraine", 0.5, 62, false, 40, false),
                new Cheese("cheese","Ukraine",3,142, false, "Serenada", false),
                new Cheese("cheese", "Poland", 2, 190, true, "Kamamber", true)
                ));
        assertThat(actual, is(expected));
    }

    @Test
    void sortByOriginIncr() {
        List<MilkProduct> actual = manager.sortByOrigin(milkbox, false);
        List<MilkProduct> expected = new ArrayList<>(Arrays.asList(

                new Milk("kefir","Germany", 0.98, 28, true, 5, true),
                new SourCream("yoghurt", "Germany", 0.48, 44, true, 0),
                new SourCream("smetana", "Greece", 0.52, 41, true, 20),
                new Milk ("milk","Poland",1,23, true, 23, true),
                new Cheese("cheese", "Poland", 2, 190, true, "Kamamber", true),
                new Cheese("cheese","Ukraine",3,142, false, "Serenada", false),
                new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2),
                new Milk("maslo", "Ukraine", 0.5, 62, false, 40, false),
                new Milk("milk", "Ukraine", 1, 34, false, 10, false)

                ));
        assertThat(actual, is(expected));
    }


}