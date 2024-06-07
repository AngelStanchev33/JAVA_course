package _03_JavaAdvanced._17_ExamPrep.workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {

    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public String getType() {
        return type;
    }

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < exerciseCount) {
            exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {

        if (exercises.isEmpty()) {
            return false;
        }

        return exercises.removeIf(exercise ->
                exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)
        );
    }

    public Exercise getExercise(String name, String muscle) {
        if (exercises.isEmpty()) {
            return null;
        }

        return exercises.stream()
                .filter(exercise -> exercise.getName().equals(name) && exercise.getMuscle().equals(muscle))
                .findFirst()
                .orElse(null);
    }

    public Exercise getMostBurnedCaloriesExercise() {
        if (exercises.isEmpty()) {
            return null;
        }

        return exercises.stream()
                .max(Comparator.comparingInt(Exercise::getBurnedCalories))
                .orElse(null);
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getStatistics() {
        if (exercises.isEmpty()) {
            return "No exercises added yet.";
        }

        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(String.format("Workout type: %s%n", getType()));

        exercises.forEach(exercise -> reportBuilder.append(exercise).append("\n"));
        return reportBuilder.toString();
    }

}
