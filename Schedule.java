package Intranet;

import java.util.Date;

public class Schedule {

    private DAYS day;

    private Date time;

    private Student student;

	public DAYS getDay() {
		return day;
	}

	public void setDay(DAYS day) {
		this.day = day;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}

