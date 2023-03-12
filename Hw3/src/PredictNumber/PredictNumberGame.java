package PredictNumber;
import java.util.Random;
import java.util.Scanner;

public class PredictNumberGame {
	private int randomNumber;
	private int arr[][];
	private int guessCount = 1;
	private int count = 0;

	void PlayGame(int numberOfPlayer) {

		Random r = new Random();
		randomNumber = r.nextInt(100) + 1;

		arr = new int[numberOfPlayer][2];

		while (count < numberOfPlayer) {

			int playerInput;
			boolean win = false;
			do {

				System.out.println("Player " + (count + 1) + " please enter a number");
				Scanner s = new Scanner(System.in);
				playerInput = s.nextInt();
				win = !Guess(count, playerInput);
			} while (win);

			count += 1;

		}

	}

	boolean Guess(int playerNumber, int playerInput) {

		if (playerInput < 1 || playerInput > 100) {
			System.out.println("Invalid try. You must enter a number between 1 and 100.");

		}

		//System.out.println("Random number is:" + randomNumber);
		if (playerInput < randomNumber) {

			System.out.println("Too low, try again");

		} else if (playerInput > randomNumber) {
			System.out.println("Too high, try again");

		}

		else {
			arr[count][1] = guessCount;
			guessCount = 1;
			System.out.println("=============================");
			return true;
		}

		guessCount++;
		return false;

	}

	void LeadershipTable() {
		System.out.println();
		System.out.println("      Leadership Table");
		System.out.println("*****************************");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0) {
					System.out.print("Player " + (i + 1) + " - ");

				} else
					System.out.print(" number of tries: " + arr[i][j]);
			}
			System.out.println("");
		}

		System.out.println("*****************************");

	}
}

