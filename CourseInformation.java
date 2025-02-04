package edu.ilstu;
import java.util.Scanner;

public class CourseInformation {
   public static void main(String[] args) {
	   
      Scanner scan = new Scanner(System.in);
	  Course myCourse = new Course();
      OfferedCourse myOfferedCourse = new OfferedCourse();
      
      String courseNumber, courseTitle;
      String oCourseNumber, oCourseTitle, instructorName, location, classTime;
      
	  System.out.print("Enter course number: ");
      courseNumber = scan.nextLine();
	  System.out.print("Enter course title: ");
      courseTitle = scan.nextLine();
      
	  System.out.print("Enter course number: ");
      oCourseNumber =  scan.nextLine();
	  System.out.print("Enter course title: ");
      oCourseTitle =  scan.nextLine();
	  System.out.print("Enter instructor name: ");
      instructorName = scan.nextLine();
	  System.out.print("Enter location: ");
      location = scan.nextLine();
	  System.out.print("Enter class time: ");
      classTime = scan.nextLine();
      
	//Call the appropriate set methods
      myCourse.setCourseNumber(courseNumber);
      myCourse.setCourseTitle(courseTitle);

      myOfferedCourse.setCourseNumber(oCourseNumber);
      myOfferedCourse.setCourseTitle(oCourseTitle);
      myOfferedCourse.setInstructorName(instructorName);
      myOfferedCourse.setLocation(location);
      myOfferedCourse.setClassTime(classTime);
      
      System.out.println("\n" + myCourse);
      System.out.println("\n" + myOfferedCourse);
      
      System.out.println("   Instructor Name: " + instructorName);
      System.out.println("   Location: " + location);
      System.out.println("   Class Time: " + classTime);
   }
}
