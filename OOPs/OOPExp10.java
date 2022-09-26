import java.util.*;

class Employee {
    int employeeNumber;
    String name;
    String job;
    int salary;
}

class FullTimeEmployee extends Employee {
    int basic;
    int hra;
    int da;
}

class PartTimeEmployee extends Employee {
    int workingHours;
    int wage;
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int n = sc.nextInt();
        PartTimeEmployee[] pe = new PartTimeEmployee[n];
        FullTimeEmployee[] fe = new FullTimeEmployee[n];
        int fcount = 0;
        int pcount = 0;
        for(int i = 1; i <=n; i++) {
            System.out.println("Is the Employee No."+i+": \n1)Full Time \n2)Part Time");
            int o = sc.nextInt();
            switch (o) {
                case 1 -> {
                    fcount++;
                    fe[fcount] = new FullTimeEmployee();
                    fe[fcount].employeeNumber = i;
                    System.out.println("Enter Name:");
                    fe[fcount].name = sc.next();
                    System.out.println("Enter Job:");
                    fe[fcount].job = sc.next();
                    System.out.println("Insert Basic:");
                    fe[fcount].basic = sc.nextInt();
                    System.out.println("Enter HRA:");
                    fe[fcount].hra = sc.nextInt();
                    System.out.println("Enter DA: ");
                    fe[fcount].da = sc.nextInt();
                    fe[fcount].salary = fe[fcount].basic + fe[fcount].hra + fe[fcount].da;
                }
                case 2 -> {
                    pcount++;
                    pe[pcount] = new PartTimeEmployee();
                    pe[pcount].employeeNumber = i;
                    System.out.println("Enter Name:");
                    pe[pcount].name = sc.next();
                    System.out.println("Enter Job:");
                    pe[pcount].job = sc.next();
                    System.out.println("Enter Working Hours:");
                    pe[pcount].workingHours = sc.nextInt();
                    System.out.println("Enter Wage:");
                    pe[pcount].wage = sc.nextInt();
                    pe[pcount].salary = pe[pcount].workingHours * pe[pcount].wage;
                }
            }
        }
        int fc = fcount;
        int pc = pcount;
        System.out.println(".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\nDetails:\n");
        System.out.println("Full Time Employees:\n");
        System.out.println("Employee No:\tEmployee Name:\tEmployee Job:\tEmployee Salary:");
        for (fcount = 1; fcount <= fc; fcount++) {
            System.out.println(fe[fcount].employeeNumber + "\t" + fe[fcount].name + "\t" + fe[fcount].job + "\t" + fe[fcount].salary);
        }
        System.out.println("Part Time Employees:\n");
        System.out.println("Employee No:\tEmployee Name:\tEmployee Job:\tEmployee Salary:");
        for (pcount = 1; pcount <= pc; pcount++) {
            System.out.println(pe[pcount].employeeNumber + "\t" + pe[pcount].name + "\t" + pe[pcount].job + "\t" + pe[pcount].salary);
        }
    }
}