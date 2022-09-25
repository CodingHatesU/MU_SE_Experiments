//SE - 3, 20, Suraj Jagap

//OOPM(JAVA) Experiment No: 01

import java.util.*;
public class OOPExp01
{
    //Cheking whether the given number is prime or not:
    static boolean isprime(int n)
    {
        int i;
        if (n <= 1)
            return false;
        for (i = 2; i*i < n; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    //Finding the prime numbers within the given two numbers:
    static int primelist(int a, int b, int []arr)
    {
        int i, j, k;
        k = a;
        i = 0;
        while (k <= b)
        {
	        if (isprime (k))
	        {
	            arr[i] = k;
	            i++;
	        }
	        k++;
        }
        System.out.println('\n' + "Array of Prime-Numbers:");
        for (j = 0; j < i; j++)
            System.out.print (arr[j] + " ");

        System.out.print ('\n' + "Smallest Prime No: " + arr[0]);
        System.out.print ('\n' + "Largest Prime No: " + arr[i - 1]);
        System.out.print ('\n' + "List-Count: " + i + '\n');
        return i;
    }

    //Finding the last (nth) element of the Fibonacci series:
    static int fibo(int a, int b, int n)
    {
        int sum = 0, i;
        if( n <= 0)
        return a;
        System.out.print('\n' + "Fibonacci Series:" + '\n' + a + " " + b);
        for(i = 3; i <= n; i++)
        {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
        return b;
    }

    //Main Function:
    public static void main (String[]args)
    {
        Scanner s = new Scanner (System.in);
        System.out.print ('\n' + "Enter the limit: ");
        int a = s.nextInt ();
        int b = s.nextInt ();
        int[] arr;
        arr = new int[50];
        int i = primelist(a,b, arr);
        int f = fibo(arr[0], arr[i-1], i);
        System.out.println ("\n" + i + "th Element of Fibonacci Series = " + f + "\n");
        s.close();
    }
}