package edu.ilstu;

import java.util.Scanner;

public class OutputWithSpace {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word containing $: ");
		String word = scan.next();
		
		System.out.println("The original is " + word);
		System.out.print("The word with spaces is ");
		outputWordWithSpaceRecursive(word);
		System.out.println();
		
	}
	
	public static void outputWordWithSpaceRecursive(String s) {
		
		if(s.length()>0) {
			System.out.print(s.charAt(0));
			System.out.print(" ");
			outputWordWithSpaceRecursive(s.substring(1));
		}
	}

}
