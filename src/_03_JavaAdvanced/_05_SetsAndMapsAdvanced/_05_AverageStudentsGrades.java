package _03_JavaAdvanced._05_SetsAndMapsAdvanced;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Double>> studentsAndGradesMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {

            String[] info = scanner.nextLine().trim().split("\\s+");
            String name = info[0];
            Double grade = Double.valueOf(info[1]);

            if (!studentsAndGradesMap.containsKey(name)) {
                ArrayList<Double> grades = new ArrayList<>();
                grades.add(grade);
                studentsAndGradesMap.put(name, grades);
            } else {
                ArrayList<Double> grades = studentsAndGradesMap.get(name);
                grades.add(grade);
            }
        }

        for (Map.Entry<String, ArrayList<Double>> entry : studentsAndGradesMap.entrySet()) {
            System.out.print(entry.getKey() + " " + "->");

            ArrayList<Double> value = entry.getValue();

            double sumGrade = 0;

            for (Double v : value) {
                sumGrade += v;
                System.out.printf(" %.2f",v);
            }
            sumGrade /= value.size();
            System.out.printf(" (avg: %.2f)", sumGrade);
            System.out.println();
        }

    }
}
