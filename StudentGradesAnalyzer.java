package edu.ilstu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class StudentGradesAnalyzer {

    public static void main(String[] args) throws IOException {

        try {
            StudentDataReader reader = new StudentDataReader();
            Student[] students = reader.readDataFromFile("grades.txt");

            double totalGrades = 0;
            
            int highestGrade = students[0].getGrade();
            int lowestGrade = students[0].getGrade();
            
            for(int i = 0; i < students.length; i++) {
            	
            	totalGrades += students[i].getGrade();
            	
            	if(students[i].getGrade() < lowestGrade) {
            		lowestGrade = students[i].getGrade();
            	}
            	if(students[i].getGrade() > highestGrade) {
            		highestGrade = students[i].getGrade();
            	}
            	
            }
            
            double averageGrade = totalGrades / students.length;
            
            //found this way of sorting off Baeldung.com, article written by Uzma Khan
            Arrays.sort(students, (first, second) -> first.getName().compareTo(second.getName()));

            System.out.println("Average Grade: " + averageGrade);
            System.out.println("Highest Grade: " + highestGrade);
            System.out.println("Lowest Grade: " + lowestGrade + "\n");
            
            System.out.println("Sorted List of Students: ");
            for(int i = 0; i < students.length; i++) {
            	System.out.println(students[i].getName() + " " + students[i].getGrade());
            }
            
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
