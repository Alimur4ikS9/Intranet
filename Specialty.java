package Intranet;

import java.util.Vector;

public class Specialty{
  private String specialtyName;
  private Vector<String> specialtyPlan;
  
  public void setSpecialtyPlan(String plan){
      specialtyPlan.add(plan);
  }
  public Vector<String> getSpecialtyPlan(){
      return specialtyPlan;
  }
  public void setSpecialtyName(String name){
      specialtyName = name;
  }
  public String getSpecialtyName(){
      return specialtyName;
  }
}
