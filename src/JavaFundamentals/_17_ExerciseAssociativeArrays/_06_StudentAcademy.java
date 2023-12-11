package JavaFundamentals._17_ExerciseAssociativeArrays;

import java.util.*;

public class _06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studnetsInfoMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studnetsInfoMap.containsKey(student)) {
                studnetsInfoMap.put(student, new ArrayList<>());
            }
            studnetsInfoMap.get(student).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studnetsInfoMap.entrySet()) {
            List<Double> grades = entry.getValue();

            double gradesTotal = 0;
            double overallGrade = 0;

            for (Double grade : grades) {
                gradesTotal += grade;
                overallGrade = gradesTotal / entry.getValue().size();
            }
            if (overallGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), overallGrade);
            }
        }
    }
}
