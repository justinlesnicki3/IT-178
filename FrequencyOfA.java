package edu.ilstu;

import java.util.Scanner;

public class FrequencyOfA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.next();
		
		
	}
	
	public static int countNumbersOfARecursive(String s) {
		if(s.length()==0)
			return 0;
		else if(s.charAt(s.length()-1)=='A')
			return (1 + countNumberOfARecursive(s.substring(0,s.length()-1)));
	}

}
