package Intranet;

import java.util.HashMap;
import java.util.Vector;

public class Teacher extends Employee {

    private DEGREE degree;

    private Vector<HashMap<Course, Vector<Student>>> courses;

    public void addFolder() {
    }

    public void putMark(Student student, Mark mark) {
    }

    public void viewStudent(Student student) {
    }

    public Vector<Course> getCourses() {
        Vector<Course> course = new Vector<Course>();
        for(HashMap<Course, Vector<Student>> h: courses) {
         for(Course c: h.keySet()) {
          course.add(c);
         }
        }
           return course;
       }

    public void setCourses(Vector<Course> courses) {
    }

    public void putAttendance(Student param1, ATTENDANCE param2) {
    }

	public DEGREE getDegree() {
		return degree;
	}

	public void setDegree(DEGREE degree) {
		this.degree = degree;
	}
}

