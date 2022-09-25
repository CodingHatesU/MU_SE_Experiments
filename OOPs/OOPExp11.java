import java.util.*;
interface Area
{
    float calculateArea(float x, float y);
}

class Rectangle implements Area
{
    public float calculateArea(float x, float y)
    {
        float area = x * y;
        return area;
    }
}

class Triangle implements Area
{
    public float calculateArea(float x, float y) {
        float area = (float) 0.5 * x * y;
        return area;
    }
}

class Circle implements Area
{
    public float calculateArea(float x,float y) {
        float area = (float) 3.14159*x*x*y;
        return area;
}
}

public class Main
{
    public static void main(String[] args)
    {
        float area = 0,a,b;
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        System.out.println("Enter the Shape: (Type the exact word including capitalization)\nTriangle\nCircle\nRectangle");
        String d = sc.next();
        switch (d) {
            case "Triangle" -> {
                System.out.println("Enter Base:");
                a = sc.nextFloat();
                System.out.println("Enter Height:");
                b = sc.nextFloat();
                area = triangle.calculateArea(a,b);
                break;
            }
            case "Rectangle" -> {
                System.out.println("Enter Breadth:");
                a = sc.nextFloat();
                System.out.println("Enter Height:");
                b = sc.nextFloat();
                area = rectangle.calculateArea(a,b);
                break;
            }
            case "Circle" -> {
                System.out.println("Enter Radius:");
                a = sc.nextFloat();
                area = circle.calculateArea(a,1);
                break;
            }
        }
        System.out.println("The area of the given " + d + " is " + area);
        sc.close();
    }
}