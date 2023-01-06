import java.util.Scanner;

public class WordGuess {

	public static boolean checkSingleCharacter(String input) {
		if (input.length() == 1){
			return true;
		}
		return false;
	}

	public static boolean checkCorrectArray(boolean[] worldCheck) {
		for (int i = 0; i < worldCheck.length; i++) {
			if (!worldCheck[i])
				return false;
		}
		return true;
	}

	public static void handleLogic(String input, String word, boolean[] wordCheck) {
		if (checkSingleCharacter(input)) {
			for (int i = 0; i < word.length(); i++) {
				if (String.valueOf(word.charAt(i)).equals(input))
					wordCheck[i] = true;
			}
		} else if (input.equals(word)) {
			for (int i = 0; i < word.length(); i++) {
				wordCheck[i] = true;
			}
		}
	}

	public static void printResult(String word, boolean[] wordCheck) {
		for (int i = 0; i < word.length(); i++) {
			if (wordCheck[i])
				System.out.print(word.charAt(i));
			else
				System.out.print("_");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String word = "hello";
		int n = word.length();
		boolean[] wordCheck = new boolean[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("java WordGuess testing");
		int countTrial = 0;
		while (true) {
			System.out.print("Key in one characteror your guess word : ");
			String input = sc.nextLine();
			handleLogic(input, word, wordCheck);
			countTrial++;
			if (checkCorrectArray(wordCheck)){
				break;
			}
			printResult(word, wordCheck);
		}
		System.out.println("Congratulation !");
		System.out.println("You got in " + countTrial + " trials");
		sc.close();
	}
}
