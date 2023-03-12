package ReverseWord;

import java.util.Scanner;

public class ReverseWord {

	private String wordLowerCase;
	private String reversedWord = "";

	String ReverseIt(String word) {
		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}
		return reversedWord;
	}

	boolean IsPalindrom(String word) {

		wordLowerCase = word.toLowerCase();
		if (wordLowerCase.equals(reversedWord.toLowerCase())) {
			return true;
		}

		else
			return false;

	}

}
