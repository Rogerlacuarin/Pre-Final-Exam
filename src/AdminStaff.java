/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class AdminStaff  extends Employee{
    private double basicSalary;
    private double overtimePay;

    public AdminStaff(double basicSalary, double overtimePay, String employeeId, String name, String position, String department, String employeeType) {
        super(employeeId, name, position, department, employeeType);
        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
    }
    
   @Override
     public double calculateSalary(){
     return  basicSalary + overtimePay;
     }
     public void diplayFAcultyType(){
         System.out.println("Employee Type: Administrative ");
     
     }
    
}
