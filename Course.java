package edu.ilstu;

public class Course {
	
	private String courseNumber;
	private String courseTitle;
	
	public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
	
	public String toString() {
		return "Course Information: " + "\nCourse Number: " + courseNumber + "\nCourse Title: " + courseTitle;
	}

}
