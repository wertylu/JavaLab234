package milk.shop.iot;


//        Молочний магазин. Реалізувати ієрархію товарів, присутніх в молочному магазині.
//        Реалізувати пошук товарів, для організації сніданку в дитячому садочку.
//        Реалізувати можливість  сортування знайденого товару за двома типами параметрів
//        (на вибір, реалізовано як два окремі методи)
//        Реалізація сортування має передбачати можливість сортувати як за спаданням, так і за зростанням

//        Реалізувати ієрархію класів
//        Важливо: необхідно реалузвати лише ієрархію класів
//        Також слід створити обєкти реалізованих вами класів у окремому класі Main, який міститиме main метод





public class Main {

    public static void main(String[] args) {
        MilkProduct shop = new MilkProduct("a thing","where", 3.14, 3.133, true);
        System.out.println(shop);
        System.out.println();
        Cheese cheese = new Cheese("kamamber", "Poland", 3, 123, true, "dyriavyi", true);
        System.out.println(cheese);
        System.out.println();System.out.println();
        SourCream sourCream = new SourCream("sour cream","Chineeeeese", 125, 92, false, 12.5);
        System.out.println(sourCream);System.out.println();System.out.println();
        Milk milk = new Milk("milk","greek", 7, 3, false, 2, false);
        System.out.println(milk);System.out.println();System.out.println();


    }
}
