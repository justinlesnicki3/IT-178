package edu.ilstu;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scan.next();
		String reverseWord = reverseWordRecursive(word);
		System.out.println(word + " reversed is " + reverseWord);
		
	
	}
	
	public static String reverseWordRecursive(String s) {
		
		if(s.length()==0)
			return "";
		else
			return (s.charAt(s.length()-1) +
					reverseWordRecursive(s.substring(0, s.length())));
	}

}
