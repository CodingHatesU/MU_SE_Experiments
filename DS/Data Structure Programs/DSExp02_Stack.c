//SE - 3, 20, Suraj Jagtap

//DS Exp 02:  Write a program to implement Stack ADT using Array.

//Main C File
#include<stdio.h>
#include<conio.h>
#include "DSExp02_Stack.h"

void main() {
	int n, i;
	//clrscr();

	do
	{
		printf("\n1: push \n");
		printf("2: Pop \n");
		printf("3: Top Element \n");
		printf("4: Exit \n");
		printf("Enter the choice: ");
		scanf("%d", &n);
		switch(n)
		{
			case 1 : if(isfull())
						printf("\nStack is full\n");
					else
					{
						printf("Enter the item to be pushed: ");
						scanf("%d", &i);
						push(i);
					}
			break;

			case 2 :
					if(isempty())
						printf("\nStack is Empty\n");
					else
					{
						i=pop();
						printf("Popped item is: %d\n", i);
					}
			break;

			case 3:
					if(isempty())
						printf("\nStack is Empty\n");
					else
					{
						i=peek();
						printf("Item on top is: %d\n", i );
					}
			break;
			
			case 4 :
					display();
					printf("Terminated\n");
			break;

			default:
					printf("Invalid Input");
		}
	}
	while( n!=4);

	//getch();

}

