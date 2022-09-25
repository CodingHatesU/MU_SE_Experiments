//SE - 3, 20, Suraj Jagtap

//OOPM(JAVA) Experiment No: 03

import java.util.*;

class ComplexNumber {
    int real_part, imag_part;

    //Non-parameterized Constructor:
    public ComplexNumber() 
    {
        real_part = 0;
        imag_part = 0;
    }

    //Parameterized Constructor with Single integer argument:
    public ComplexNumber(int n)
    {
        real_part = imag_part = n;
    }

    //Parameterized Constructor with two integer arguments:
    public ComplexNumber(int r, int i)
    {
        real_part = r;
        imag_part = i;
    }

    //Function to Display the Complex Number:
    public void showC()
    {
        System.out.print(real_part + " + " + imag_part + "i" );
    }

    //Function to Add Two Complex Numbers:
    public static ComplexNumber Add(ComplexNumber C1, ComplexNumber C2)
    {
        ComplexNumber C3 = new ComplexNumber();
        C3.real_part = C1.real_part + C2.real_part;
        C3.imag_part = C1.imag_part + C2.imag_part;
        return C3;
    }
}

//Main Class:
public class OOPExp03 {
    public static void main(String args[])
    {
        int r, i;
        Scanner s  =  new Scanner(System.in);

        System.out.print("\n");
        System.out.println("Enter the Real & the Imaginary part values of C1: ");
        r = s.nextInt();
        i = s.nextInt();

        ComplexNumber C1 = new ComplexNumber(r, i);
        System.out.println("Enter the Real & the Imaginary part values of C2: ");
        r = s.nextInt();
        i = s.nextInt();

        ComplexNumber C2 = new ComplexNumber(r, i);
        ComplexNumber C3 = ComplexNumber.Add(C1, C2);

        System.out.print("\nC1 = ");
        C1.showC();
        System.out.print("\nC2 = ");
        C2.showC();

        System.out.print("\n\nC3 = C1 + C2 = ");
        C3.showC();

        C1 = ComplexNumber.Add(C1, C2);
        System.out.print("\nC1 = C1 + C2 = ");
        C1.showC();

        s.close();
    }

}
