import java.util.*;

public class _04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> registerMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] lines = scanner.nextLine().split("\\s+");

            if (lines[0].equals("register")) {
                String username = lines[1];
                String licencePlate = lines[2];

                if (!registerMap.containsKey(username)) {
                    registerMap.put(username, new ArrayList<>());
                }

                boolean isExist = false;
                for (List<String> list : registerMap.values()) {
                    if (list.contains(licencePlate)) {
                        isExist = true;
                        System.out.printf("ERROR: already registered with plate number %s%n", licencePlate);
                    }
                }
                if (!isExist) {
                    registerMap.get(username).add(licencePlate);
                    System.out.printf("%s registered %s successfully%n", username, licencePlate);
                }

            } else {
                String username = lines[1];
                if (!registerMap.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    registerMap.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);

                }
            }
        }

        for (Map.Entry<String, List<String>> entry : registerMap.entrySet()) {
            String username = entry.getKey();
            List<String> plates = entry.getValue();

            String joinedPlates = String.join(", ", plates);

            System.out.printf("%s => %s%n", username, joinedPlates);
        }
    }
}
