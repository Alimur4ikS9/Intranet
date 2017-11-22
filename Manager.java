package Intranet;

public class Manager extends Employee {
    
    private DEPARTMENT Department;

   
    public void approveRegistration(Student student) {
    }

   
    public void assignCourse(Teacher teacher) {
    }

  
    public DEPARTMENT getDepartment() {
        return Department;
    }

    
    public void setDepartment(DEPARTMENT Department) {
        this.Department = Department;
    }
}

