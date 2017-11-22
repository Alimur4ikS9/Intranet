package Intranet;

public abstract class Person {
   
    private String name;

   
    private String email;

  
    private String surname;

    
    private String phoneNumber;

  
    private boolean isWorking;


    private boolean isTeaching;

    public void loginToIntranet() {
    }


    public void loginToOR() {
    }

 
    public boolean getIsTeaching() {
        return isTeaching;
    }

    
    public void setIsTeaching(boolean isTeaching) {
        this.isTeaching = isTeaching;
    }

   
    public boolean getIsWorking() {
        return isWorking;
    }

    
    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public String getSurname() {
        return surname;
    }

    
    public void setSurname(String surname) {
        this.surname = surname;
    }

   
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}

