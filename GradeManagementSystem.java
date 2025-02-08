package edu.ilstu;

import java.util.Scanner;

public class GradeManagementSystem {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int totalStudents = scan.nextInt();
		
		
		System.out.print("Enter the number of subjects: ");
		int totalSubjects = scan.nextInt();
		
		Subject[] subjects = new Subject[totalSubjects];
		Student[] students = new Student[totalStudents];
		int[][] grades = new int[totalStudents][totalSubjects];
				
		for(int i = 0; i < totalSubjects; i++) {
			System.out.print("Enter name of subject " + (i+1) + ": ");
			String subject = scan.next();
			 scan.nextLine();
			subjects[i] = new Subject(subject, totalStudents);
		}
		
		for(int i = 0; i < totalStudents; i++) {
			System.out.print("Enter name of student " + (i+1) + ": ");
			String student = scan.nextLine();
			students[i] = new Student(student, totalSubjects);
		}
		
		for(int i = 0; i < totalStudents; i++) {
			for(int j = 0; j < totalSubjects; j++) {
				System.out.print("Enter grade for " + students[i].getName() + " for " + subjects[j].getName() + ": ");
				int grade = scan.nextInt();
				students[i].setGrade(j, grade);
				subjects[j].setGrade(i, grade);
				grades[i][j] = grade;
			}
		}
		
		System.out.println("\nGrades Matrix:");
		System.out.print("\t");
		for(int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i].getName() + "\t");
		}
        System.out.println();
        
        for(int i = 0; i < totalStudents; i++) {
        	System.out.print(students[i].getName() + "\t");
        	for(int j = 0; j < totalSubjects; j++) {
        		System.out.print(grades[i][j] + "\t");
        	}
        	System.out.println();
        	
        }
        
        System.out.println("\nAverage Grade Per Student");
        for(int i = 0; i < students.length; i++) {
        	System.out.println(students[i].getName() + ": " + students[i].calculateAverage());
        }
        
        System.out.println("\nAverage Grade per Subject");
        for(int i = 0; i < subjects.length; i++) {
        	System.out.println(subjects[i].getName() + ": " + subjects[i].calculateAverage());
        }
        
        System.out.println("\nHighest and Lowest Grades per Subject:");
        for(int i = 0; i < subjects.length; i++) {
        	System.out.println(subjects[i].getName() + " - Highest: " + subjects[i].getHighestGrade() + ", Lowest: " + subjects[i].getLowestGrade());
        }
		
        scan.close();
		
	}

}
