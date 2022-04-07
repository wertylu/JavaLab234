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

        Milk milk = new Milk ("milk","Poland",1,23, true, 23, true);
        Cheese cheese = new Cheese("cheese","Ukraine",3,142, false, "Serenada", false);
        SourCream yoghurt = new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2);
        SourCream smetana = new SourCream("smetana", "Greece", 0.52, 41, true, 20);
        Milk kefir = new Milk("kefir","Germany", 0.98, 28, true, 5, true);
        Milk maslo = new Milk("maslo", "Ukraine", 0.5, 62, false, 40, false);
        Cheese cheese2 = new Cheese("cheese", "Poland", 2, 190, true, "Kamamber", true);
        SourCream yoghurt2 = new SourCream("yoghurt", "Germany", 0.48, 44, true, 0);
        Milk milk2 = new Milk("milk", "Ukraine", 1, 34, false, 10, false);

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

        System.out.println(manager.sortByPrice(milkbox, false));
        System.out.println(manager.sortByOrigin(milkbox, true));


    }
}
