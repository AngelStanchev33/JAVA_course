import java.util.*;

public class _08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> companyMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] parts = input.split(" -> ");
            String companyName = parts[0];
            String employeeId = parts[1];

            companyMap.putIfAbsent(companyName, new LinkedHashSet<>());

            if (!companyMap.get(companyName).contains(employeeId)) {
                companyMap.get(companyName).add(employeeId);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : companyMap.entrySet()) {
            System.out.println(entry.getKey());

            Set<String> employees = entry.getValue();

            for (String employee : employees) {
                System.out.println("-- " + employee);
            }
        }
    }
}
