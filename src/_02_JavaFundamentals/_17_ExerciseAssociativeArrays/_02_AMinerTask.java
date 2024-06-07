import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        while (true) {
            String resource = scanner.nextLine().trim();
            if ("stop".equals(resource)) {
                break;
            }

            int quantity = Integer.parseInt(scanner.nextLine().trim());

            resourceMap.put(resource, resourceMap.getOrDefault(resource, 0) + quantity);
        }

        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s –> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
