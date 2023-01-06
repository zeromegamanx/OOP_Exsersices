import java.util.Scanner;

public class NumberGuess {
	final int SECRET_NUMBER = (int) (Math.random() * 100);

	public static void main(String[] args) {
		int countTrial = 0;
		Scanner sc = new Scanner(System.in);
		NumberGuess ng = new NumberGuess();
		System.out.println("java NumberGuess");
		System.out.println("Key in your guess: ");
		while (true) {
			countTrial++;
			int number = sc.nextInt();
			if (number == ng.SECRET_NUMBER) {
				System.out.println("you got it in " + countTrial + " trials !");
				break;
			}
			if (number < ng.SECRET_NUMBER) {
				System.out.println("Try higher");
			}
			if (number > ng.SECRET_NUMBER) {
				System.out.println("Try lower");
			}
		}
		sc.close();
	}
}
