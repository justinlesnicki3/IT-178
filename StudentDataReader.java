package edu.ilstu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class StudentDataReader {
	
	public Student1[] readDataFromFile(String fileName) throws IOException {
		Student1[] students = new Student1[5];
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {	
		String line;
		int index = 0;
		
		while((line = br.readLine()) != null) {
			String[] parts = line.split(" ");
			String name = parts[0];
			int grade = Integer.parseInt(parts[1]);
			students[index++] = new Student1(name, grade);
			
			}
		}
		
		return students;		
		
	}
	
	
}