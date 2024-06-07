package _03_JavaAdvanced._18_ExamPrep.cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    private List<Employee> employees;
    private String name;
    private int capacity;

    public Cafe(String cafe, int capacity) {
        this.employees = new ArrayList<>();
        this.name = cafe;
        this.capacity = capacity;
    }

    public void addEmployee(Employee employee) {
        if (employees.size() < capacity) {
            employees.add(employee);

        }
    }

    public boolean removeEmployee(String name) {
        return employees.removeIf(employee -> employee.getName().equals(name));
    }

    public Employee getOldestEmployee() {
        return employees.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .orElse(null);
    }

    public Employee getEmployee(String name) {
        return employees.stream()
                .filter(employee -> employee.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return employees.size();
    }

    public String report(){
        System.out.printf("Employees working at Cafe %s:%n",name);

        return employees.stream()
                .map(Employee::toString)
                .collect(Collectors.joining("\n"));
    }
}
