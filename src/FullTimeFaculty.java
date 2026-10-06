/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class FullTimeFaculty extends Employee {
    
    private double monthlySalary;
    private double allowance;

    public FullTimeFaculty(double monthlySalary, double allowance, String employeeId, String name, String position, String department, String employeeType) {
        super(employeeId, name, position, department, employeeType);
        this.monthlySalary = monthlySalary;
        this.allowance = allowance;
    }

    
    
     @Override
     public double calculateSalary(){
     return monthlySalary + allowance;
     }
     public void diplayFAcultyType(){
         System.out.println("Employee Type: FullTime Faculty");
     
     }
    
    
}
