package edu.ilstu;
import java.util.ArrayList;
import java.util.Scanner;

public class MakeCodesList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int iterations;
		
		ArrayList<String>list = new ArrayList<>();
		
		System.out.print("Enter number of iterations: ");
		iterations = scan.nextInt();
		
		for(int i = 0; i < iterations; i++) {
			list.add("M");
			list.add("C");
		}
		
		for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i) + " ");
        }
		
	}

}
