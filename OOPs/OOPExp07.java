//SE-3, 20, Suraj Jagtap

//OOPM(Java) Experiment No: 07

import java.io.*;

public class OOPExp07 {
    public static void main(String args[]) throws IOException {
    // creating InputStreamReader class object and wrapping it with BufferedReader Class
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);

    //Taking the no. of elements as input
    System.out.print("\nEnter the number of elements : ");
    int m = Integer.parseInt(br.readLine());
    int A[][] = new int[m][m];

    //Accepting the Matrix elements
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < m; j++) {
        System.out.print("Enter the element a" + (i+1) + (j+1) + ": ");
        A[i][j] = Integer.parseInt(br.readLine());
    }
  }

    //Printing the Original Matrix
    System.out.println("\nThe Original Matrix is : ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println();
    }

    //Checking whether the matrix is symmetric or not
    int flag = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < m; j++) {
            if (A[i][j] != A[j][i]) {
            flag = 1;
            break;
        }     
        }
    }

    if (flag == 1)
        System.out.println("\nThe given Matrix is Not Symmetric\n.");
    else
        System.out.print("\nThe given Matrix is Symmetric");
    System.out.print("\n.");
  }
}
