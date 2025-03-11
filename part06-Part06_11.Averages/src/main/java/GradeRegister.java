
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> addition;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.addition = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.addition.add(points);
    }

    public double averageOfPoints() {
        if(addition.isEmpty()) return -1;
            int sum = 0;
            int counter = 0;
            for(int i = 0; i<addition.size(); i++) {
                sum += addition.get(i);
                counter++;
            } return (sum * 1.0) / counter;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades() {
            if(grades.isEmpty()) return -1;
            int sum = 0;
            int counter = 0;
            for(int i = 0; i<grades.size(); i++) {
                sum += grades.get(i);
                counter++;
            }
            return (sum * 1.0) / counter;
    }
    
    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
