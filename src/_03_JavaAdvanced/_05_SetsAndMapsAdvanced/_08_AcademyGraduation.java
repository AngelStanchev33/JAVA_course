package _03_JavaAdvanced._05_SetsAndMapsAdvanced;

import java.util.*;

public class _08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Double>> studentsMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine().trim();
            double[] grades = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            studentsMap.putIfAbsent(studentName, new ArrayList<>());
            ArrayList<Double> gradesList = studentsMap.get(studentName);
            for (double grade : grades) {
                gradesList.add(grade);
            }
        }
        studentsMap.entrySet()
                .forEach(entry -> {
                    System.out.printf("%s is graduated with ",entry.getKey());

                    ArrayList<Double> value = entry.getValue();

                    double averageGrade = 0;
                    for (Double v : value) {
                        averageGrade += v;
                    }
                    averageGrade /= value.size();
                    System.out.print(averageGrade);
                    System.out.println();
                });
    }
}
