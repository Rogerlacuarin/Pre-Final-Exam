/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Employee { 
    private String employeeId;
    private String name;
    private String department;
   

    public Employee(String employeeId, String name, String position, String department, String employeeType) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    

    public String getDepartment() {
        return department;
    }

    
     public double calculateSalary(){
     
     return 0.0;
     }
     public void display(){
         System.out.println("EmployeeId: " + employeeId);
         System.out.println("Name: " + name);
         System.out.println("Department: " + department);
     }
     public static int getEmployeeCount(){
     return 0;
     }
    
    
    
}
