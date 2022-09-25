//SE - 3, 20, Suraj Jagtap

//OOPM(JAVA) Experiment No: 02

/*
    Following data has been assumed while writing the program:
        HRA = 10 % of the Basic Salary;
        DA = 50 % of the Basic Salary;
        Gross = Basic Salary + DA + HRA;
        Income Tax = 30 % of Gross;
        Gross Salary = Gross - Income Tax
 */

import java.util.*;

class Employee
{
    //Declaring the private members of the Employee class
    private String EmpID;
    private String EmpName;
    private double Basic,HRA,DA,GS,IT,Gross;

    //Function to Read the Employee data:
    public void Read()
    {
        Scanner s  =  new Scanner(System.in);
        System.out.print('\n' + "Enter the Employee id: ");
        EmpID = s.next();
        System.out.print("Enter the Employee name: ");
        EmpName = s.next();
        System.out.print("Enter the Basic Salary of the Employee: ");
        Basic = s.nextDouble();
        s.close();
    }

    //Function to Calculate different parameters:
    public void Calculate()  
    {
        HRA = 0.1 * Basic;
        DA = 0.5 * Basic;
        Gross = Basic + DA + HRA;
        IT = 0.3 * Gross;
        GS = Gross - IT;
    }

    //Function to Display the Employee data:
    public void Display() 
    {
        System.out.print
        (
            '\n' + "Employee ID: "+ EmpID + '\n' + "Employee Name: "+ EmpName + 
            '\n' + "Baic Salary: " + Basic + '\n' + "HRA: " + HRA + 
            '\n' + "DA: " + DA + '\n' + "Gross: " + Gross + 
            '\n' + "Income Tax: " + IT + 
            '\n' + "Gross Salary: " + GS
        );
        System.out.print("\n");
    }

}

//Main Class:
public class OOPExp02
{
    public static void main (String args[])
    {
        Employee e = new Employee(); 
        e.Read();
        e.Calculate();
        e.Display(); 
    }
}