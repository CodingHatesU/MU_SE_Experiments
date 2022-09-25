//SE - 3, 20, Suraj Jagtap

//OOPM(JAVA) Experiment No: 05

import java.util.*;

class Shape {

	static final double PI = Math.PI;

    //Calculating the Area of the Rectangle:
	void Area(int a, int b)
	{
		int A = a * b;
		System.out.println("Area of the Rectangle: " + A + "\n.");
	}

	//Calculating the Area of the Square:
	void Area(float a)
	{
		float A = a * a;
		System.out.println("Area of the Square: " + A + "\n.");
	}

	//Calculating the Area of the Circle:
	void Area(double a)
	{
		double A = PI * a * a;
		System.out.println("Area of the Circle: " + A + "\n.");
	}
}

//Main Class:
public class OOPExp05 {
	public static void main(String[] args)
	{

		//Creating the Object of Shape class
		Shape obj = new Shape();

        int choice, l, b;
        float s;
        double r;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMenu:");
        System.out.println("1.Rectangle\n2.Square\n3.Circle");
        System.out.print("\nEnter the choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nEnter the Length and the Breadth: ");
                l = sc.nextInt();
                b = sc.nextInt();
                obj.Area(l, b);
                break;
            case 2:
                System.out.print("\nEnter the Side: ");
                s = sc.nextFloat();
                obj.Area(s);
                break;
            case 3:
                System.out.print("\nEnter the Radius: ");
                r= sc.nextDouble();
                obj.Area(r);
                break;
            default:
                break;
        }
        sc.close();
	}
}
