package employee;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ShowEmpMain {
    public static void main(String [] args){

        System.out.println("--------------------");
        List<Employee> employees = EmployeeTable.findAllStudent();
        
        for(int i = 0; i < employees.size(); i++){
            System.out.println("ID : " + employees.get(i).getEmployeeid());
            System.out.println("Name : " + employees.get(i).getName());
            System.out.println("Job : " + employees.get(i).getJob());
            System.out.println("Salary : " + employees.get(i).getSalary());
            System.out.println("Department : " + employees.get(i).getDepartmentid());
            System.out.println("--------------------");
            System.out.println();
        }
    }
}
