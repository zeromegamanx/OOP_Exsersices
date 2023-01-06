import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = 5;
        System.out.println("Number of students: " + numberOfStudents);
        int [] grade = new int[numberOfStudents];
        int sum = 0;
        for (int i = 0; i < numberOfStudents ; i++) {
            System.out.println("Enter the grade of student " + i + ": ");
            grade[i] = sc.nextInt();
            sum += grade[i];
        }
        double average = (double) sum / numberOfStudents;
        System.out.printf("The average is: %.2f/n", average);
        int max = grade[1];
        for (int i = 0; i < grade.length; i++) {
            if (max < grade[i]){
                max = i;
            }
        }
        System.out.println("Max grade is: " + max);

        int min = grade[1];
        for (int i = 0; i < grade.length; i++) {
            if (min > grade[i]){
                min = i;
            }
        }
        System.out.println("Min grade is: " + min);

    }
}
