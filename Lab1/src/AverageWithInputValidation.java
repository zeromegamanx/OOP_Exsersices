import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int numberOfStudents = 3;
        int numberIn;
        int sum = 0;
        double average;

        for (int i = 1; i <= numberOfStudents; i++) {
            boolean isValid = false;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your mark of student " + i + ": ");
                numberIn = sc.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                    sum += numberIn;
                } else {
                    System.out.println("Invalid mark, try again!");
                }
            } while (!isValid);
        }
        average = (double) sum / numberOfStudents;
        System.out.printf("The average is: %.2f%n", average);
    }
}
