//SE-3, 20, Suraj Jagtap

//OOPM(JAVA) Experiment No: 06

import java.util.*;
import org.calculator.Arithmetic; //importing arithmatic
import org.calculator.CalcPower; //importing calcpower
public class OOPExp06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic a = new Arithmetic();
        CalcPower c = new CalcPower();
        int x;
        int y;
        int z = 0;
        System.out.println("\n1)Addition \n2)Subtraction \n3)Multiplication \n4)Division \n5)Square \n6)Cube");
        System.out.print("Enter the operation: ");
        int r = sc.nextInt();
        switch (r) {
            case 1:
                System.out.print("\nEnter the two operands: ");
                x = sc.nextInt();
                y = sc.nextInt();
                z = a.add(x,y);
                break;
            case 2:
                System.out.print("\nEnter the two operands: ");
                x = sc.nextInt();
                y = sc.nextInt();
                z = a.sub(x,y);
                break;
            case 3:
                System.out.print("\nEnter the two operands: ");
                x = sc.nextInt();
                y = sc.nextInt();
                z = a.multi(x,y);
                break;
            case 4:
                System.out.print("\nEnter the two operands: ");
                x = sc.nextInt();
                y = sc.nextInt();
                z = a.div(x,y);
                break;
            case 5:
                System.out.print("\nEnter the operand: ");
                x = sc.nextInt();
                z = c.sqr(x);
                break;
            case 6:
                System.out.print("\nEnter the operand: ");
                x = sc.nextInt();
                z = c.cube(x);
                break;
        }
        System.out.print("\nResult is: " + z + "\n.");
        sc.close();
    }
}