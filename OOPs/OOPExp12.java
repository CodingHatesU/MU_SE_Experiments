package com.company;
import java.util.*;

class Student {
    int rollNo;
    String  name;
}

class Test extends Student {
    String s1;
    float m1;
    String s2;
    float m2;
}

interface MarksheetCalc {
    String collegeName = "SAKEC";
    public float CalculateMarksheet();
}

class Marksheet extends Test implements MarksheetCalc {
    String collegeName = "SAKEC";
    public float CalculateMarksheet() {
        return (m1 + m2) / 2;
    }
}

class Main {
    public static void main(String[] args) {
        float result;
        Scanner sc = new Scanner(System.in);
        Marksheet m = new Marksheet();
        System.out.println("Enter Student Name:");
        m.name = "";
        m.name += sc.nextLine();
        System.out.println("Enter Student Roll No:");
        m.rollNo = sc.nextInt();
        System.out.println("Enter Name of Subject 1:");
        m.s1 = sc.next();
        System.out.println("Enter Marks in " + m.s1 + ":");
        m.m1 = sc.nextInt();
        System.out.println("Enter Name of Subject 2:");
        m.s2 = sc.next();
        System.out.println("Enter Marks in " + m.s2 + ":");
        m.m2 = sc.nextInt();
        result = m.CalculateMarksheet();
        System.out.println(".\n.\n.\n.\n.\n.\n.");
        System.out.println("Marksheet:");
        System.out.println("College Name: \t Roll No. \t Name: \t\t\t Result: ");
        System.out.println(m.collegeName + "\t\t\t\t" + m.rollNo + "\t\t" + m.name + "\t\t" + result);
    }
}