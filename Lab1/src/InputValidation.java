import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int numberIn;
        boolean isValid = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number: ");
            numberIn = sc.nextInt();
            if (numberIn > 0 && numberIn < 9 || numberIn > 90 && numberIn < 100) {
                System.out.println("You have entered : " + numberIn);
                isValid = true;
                break;
            } else {
                System.out.println("Invalid number, try again!");
            }
        } while (!isValid);

    }
}
