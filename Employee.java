package Intranet;

public class Employee extends Person {
    
    private DEPARTMENT department;
 
    private int insuranceNumber;

    private double salary;

    public int getInsuranceNumber() {
		return insuranceNumber;
    }

 
    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

   
    public DEPARTMENT getDepartment() {
        return this.department;
    }

    public void setDepartment(DEPARTMENT department) {
        this.department = department;
    }

  
    public double getSalary() {
        return salary;
    }

  
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

