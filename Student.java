package Intranet;

import java.util.HashMap;
//import java.util.Vector;

public class Student extends Person {
    
    private double gpa;

    private String ID;

    private String intranetLogin;

    private DEGREE levelOfEducation;

    private HashMap<Course, MarkAttendance> attestation;
    
    private int yearOfStudy;
    
    Specialty specialty;

    private DATABASE Schedule;

	public Student(MarkAttendance markAttendance){
        markAttendance = new MarkAttendance();
    }
    
    public void registerForCourse(Course course) {
    }


    public void viewTranscript() {
    }

    public void dropCourse(Course course) {
    }

    public String getIntranetLogin() {
        return intranetLogin;
    }

    public void setIntranetLogin(String intranetLogin) {
    	this.intranetLogin = intranetLogin;
    }
    
//    public Vector<Course> getCourse(){
//    	return attestation.key;
//    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
    	this.gpa = gpa;
    }

    public DEGREE getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(DEGREE levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }

    public HashMap<Course, MarkAttendance> getAttestation() {
        return attestation;
    }

    public void setAttestation(HashMap<Course, MarkAttendance> attestation) {
        
    }
  
    public DATABASE getSchedule() {
		return Schedule;
	}

	public void setSchedule(DATABASE schedule) {
		Schedule = schedule;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public class MarkAttendance {

        private Mark mark;

        private ATTENDANCE attendance;
        
        public MarkAttendance(){
            
        }
        public Mark getMark() {
            return mark;
        }

        public void setMark(Mark mark) {
            this.mark = mark;
        }

        public ATTENDANCE getAttendance() {
            return attendance;
        }

        public void setAttendance(ATTENDANCE attendance) {
            this.attendance = attendance;
        }
    }


}

