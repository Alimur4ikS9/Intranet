package Intranet;
import java.util.*;

/**
 * The faculty is an abstract class that contains general information about the subjects and teachers of the faculty
 */
public class Faculty {
    
    public static String facultyName;

    private Vector<Teacher> listOfTeachers;
    
    private Vector<Student> listOfStudents;
    
    private Vector<Specialty> listOfSpecialties;
    
    private static STAFF dean;

    
    public void shutFaculty(Faculty faculty) {
    }

   
    public String getFacultyName() {
        return facultyName;
    }

    
    public void setFacultyName(String facultyName) {
        Faculty.facultyName = facultyName;
    }


    public STAFF getDean() {
        return dean;
    }

    public void setDean(STAFF dean) {
        Faculty.dean = dean;
    }

    public Collection<Teacher> getListOfTeachers() {
        return listOfTeachers;
    }

 
    public void setTeacher(Teacher teacher) {
    }


	public Vector<Student> getListOfStudents() {
		return listOfStudents;
	}


	public void setListOfStudents(Vector<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}


	public Vector<Specialty> getListOfSpecialties() {
		return listOfSpecialties;
	}


	public void setListOfSpecialties(Vector<Specialty> listOfSpecialties) {
		this.listOfSpecialties = listOfSpecialties;
	}
}

