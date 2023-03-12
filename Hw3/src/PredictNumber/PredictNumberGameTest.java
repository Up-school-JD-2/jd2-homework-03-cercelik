package PredictNumber;

import java.util.Scanner;

public class PredictNumberGameTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("How many player will play the game?");
		int numberOfPlayer = s.nextInt();

		PredictNumberGame p = new PredictNumberGame();

		p.PlayGame(numberOfPlayer);
		p.LeadershipTable();

	}

}
