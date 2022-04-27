package milk.lab3.iot;
//        Лабораторна робота 3

//        Необхідно створити клас - Менеджер, що міститиме логіку
//        Реалізувати пошук товарів, для організації сніданку в дитячому садочку.
//        Реалізувати можливість  сортування знайденого товару:
//        за ціною
//        за походженням
//        Реалізація сортування має передбачати можливість сортувати як за спаданням, так і за зростанням

//        Для сортування слід використати вбудовані методи сортування, доступні в мові Java
//        Сортування слід реалізувати в окремому методі

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Manager manager = new Manager();

        MilkProduct milk = new Milk ("milk","Poland",1,23, true, 23, true);
        MilkProduct cheese = new Cheese("cheese","Ukraine",3,142, false, "Serenada", false);
        MilkProduct yoghurt = new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2);
        MilkProduct smetana = new SourCream("smetana", "Greece", 0.52, 41, true, 20);
        MilkProduct kefir = new Milk("kefir","Germany", 0.98, 28, true, 5, true);
        MilkProduct maslo = new Milk("maslo", "Ukraine", 0.5, 62, false, 40, false);
        MilkProduct cheese2 = new Cheese("cheese", "Poland", 2, 190, true, "Kamamber", true);
        MilkProduct yoghurt2 = new SourCream("yoghurt", "Germany", 0.48, 44, true, 0);
        MilkProduct milk2 = new Milk("milk", "Ukraine", 1, 34, false, 10, false);

    List<MilkProduct> milkbox = new ArrayList<>();
        milkbox.add(milk);
        milkbox.add(cheese);
        milkbox.add(yoghurt);
        milkbox.add(smetana);
        milkbox.add(kefir);
        milkbox.add(maslo);
        milkbox.add(cheese2);
        milkbox.add(yoghurt2);
        milkbox.add(milk2);



        List<MilkProduct> byPrice = manager.sortByPrice(milkbox, false);
        byPrice.forEach(System.out::println);

        List<MilkProduct> byOrigin = manager.sortByOrigin(milkbox, true);
        byOrigin.forEach(System.out::println);

        List<MilkProduct> homeMade = manager.searchByHomeMadeBoolean(milkbox);
        homeMade.forEach(System.out::println);
    }
}
