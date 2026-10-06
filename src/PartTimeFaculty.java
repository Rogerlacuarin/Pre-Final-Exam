/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class PartTimeFaculty extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeFaculty(double hoursWorked, double hourlyRate, String employeeId, String name, String position, String department, String employeeType) {
        super(employeeId, name, position, department, employeeType);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
 
    
 @Override
     public double calculateSalary(){
     return hoursWorked * hourlyRate;
     }
     public void diplayFAcultyType(){
         System.out.println("Employee Type: FullTime Faculty");
     
     }
  public void displayFacultyType(){
      System.out.println("Employee Type: PartTime");
}
    
}
