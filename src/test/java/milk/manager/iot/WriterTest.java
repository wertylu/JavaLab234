package milk.manager.iot;

import milk.products.iot.Cheese;
import milk.products.iot.Milk;
import milk.products.iot.MilkProduct;
import milk.products.iot.SourCream;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WriterTest {

    @Test
    void writeToCSV() throws IOException {
        Manager manager = new Manager();
        List<MilkProduct> milkbox = new ArrayList<>(Arrays.asList(
                new Milk("milk","Poland",1,23, true, 23, true),
                new Cheese("cheese","Ukraine",3,142, false, "Serenada", false),
                new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2),
                new SourCream("smetana", "Greece", 0.52, 41, true, 20),
                new Milk("kefir","Germany", 0.98, 28, true, 5, true)));


        manager.sortByOrigin(milkbox, true);
        File file = new File("C:\\Users\\alfez\\Desktop\\java repos\\Java2\\JavaLab234\\src\\main\\resources\\META-INF\\result.csv");
        Writer.writeToCSV(milkbox);
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextLine()){
            result.append(scanner.nextLine());
        }

        String expected = "Product, Price, HomeMademilk, 23.0, trueProduct," +
                " Price, HomeMadecheese, 142.0, falseProduct, Price," +
                " HomeMadeyoghurt, 36.0, falsesmetana, 41.0," +
                " trueProduct, Price, HomeMadekefir, 28.0, true";
        assertEquals(expected, result.toString());

        }

    @Test
    void writeToCSVOneClass() throws IOException {
        Manager manager = new Manager();
        List<MilkProduct> milkbox = new ArrayList<>(Arrays.asList(
                new SourCream("yoghurt", "Ukraine", 0.45, 36, false, 2),
                new SourCream("smetana", "Greece", 0.52, 41, true, 20),
                new SourCream("yoghurt", "Germany", 0.48, 44, true, 0)));


        manager.sortByOrigin(milkbox, true);
        File file = new File("C:\\Users\\alfez\\Desktop\\java repos\\Java2\\JavaLab234\\src\\main\\resources\\META-INF\\result.csv");
        Writer.writeToCSV(milkbox);
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextLine()){
            result.append(scanner.nextLine());
        }

        String expected = "Product, Price, HomeMadeyoghurt, 36.0, falsesmetana, 41.0, trueyoghurt, 44.0, true";
        assertEquals(expected, result.toString());

    }

    @Test
    void writeToCSVEmty() throws IOException {

        File file = new File("C:\\Users\\alfez\\Desktop\\java repos\\Java2\\JavaLab234\\src\\main\\resources\\META-INF\\result.csv");
        Writer.writeToCSV(new ArrayList<>());
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextLine()){
            result.append(scanner.nextLine());
        }

        String expected = "";
        assertEquals(expected, result.toString());

    }

}
