package _03_JavaAdvanced._05_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Double>> data = new TreeMap<>();

        while (!"Revision".equals(line)) {

            String[] split = line.split(", ");

            String shop = split[0];
            String product = split[1];
            double price = Double.parseDouble(split[2]);

            data.putIfAbsent(shop, new LinkedHashMap<>());
            LinkedHashMap<String, Double> innerData = data.get(shop);
            innerData.putIfAbsent(product, price);

            line = scanner.nextLine();


        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : data.entrySet()) {
            System.out.println(entry.getKey() + "->");
            LinkedHashMap<String, Double> innerData = entry.getValue();

            for (var productData : innerData.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",productData.getKey(),productData.getValue());
            }
        }
    }
}
