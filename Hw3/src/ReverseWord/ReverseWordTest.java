package ReverseWord;

import java.util.Scanner;

public class ReverseWordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		ReverseWord r = new ReverseWord();

		System.out.println("Reversed word is: " + r.ReverseIt(word));

		if (r.IsPalindrom(word)) {
			System.out.println(word + " is a palindrom");
		} else {
			System.out.println(word + " is not a palindrom");
		}

	}

}
