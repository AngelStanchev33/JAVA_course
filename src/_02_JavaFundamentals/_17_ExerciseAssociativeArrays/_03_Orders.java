package _02_JavaFundamentals._17_ExerciseAssociativeArrays;

import java.util.*;

public class _03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> beveragesMap = new LinkedHashMap<>();

        String line = scanner.nextLine().trim();
        while (!"buy".equals(line)) {
            String[] parts = line.split("\\s+");
            String product = parts[0];
            double price = Double.parseDouble(parts[1]);
            double quantity = Double.parseDouble(parts[2]);

            if (!beveragesMap.containsKey(product)) {
                List<Double> values = new ArrayList<>();
                values.add(price);
                values.add(quantity);
                beveragesMap.put(product, values);
            } else {
                List<Double> values = beveragesMap.get(product);
                values.remove(0);
                values.add(0, price);
                double updatedQuantity = values.get(1) + quantity;
                values.set(1, updatedQuantity);
            }
            line = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : beveragesMap.entrySet()) {

            String productFinal = entry.getKey();
            List<Double> values = entry.getValue();
            double priceFinal = values.get(0);
            double quantityFinal = values.get(1);

            double total = priceFinal * quantityFinal;

            System.out.printf("%s -> %.2f%n",productFinal,total);
        }

    }
}
