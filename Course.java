package Intranet;

import java.util.Vector;

public class Course {
    
    private String courseTitle;

    private Vector<Textbook> courseBook;

    private CourseFile courseFiles;


    public Vector<Textbook> getCourseBook() {
        return courseBook;
    }

  
    public void setCourseBook(Textbook Book) {
        this.courseBook.add(Book);
    }


    public String getCourseTitle() {
        return courseTitle;
    }

  
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public CourseFile getCourseFiles() {
        return courseFiles;
    }

    public void setCourseFiles(CourseFile courseFiles) {
        this.courseFiles = courseFiles;
    }
}

