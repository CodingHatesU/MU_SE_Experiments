//SE-3, 20, Suraj Jagtap

//DS Exp 03: Write a program to implement operations on Singly Linked List ADT

//Main File
#include<stdio.h>
#include<conio.h>
#include "DSExp03_LL.h"

int main()
{
	int i, n, choice, *a, x;
	//clrscr();
	printf("Enter an element to initiate linked list: ");
	scanf("%d", &n);
	create(n);
	display();
	do
	{
		printf("\n1: Insert at the beginning\n");
		printf("2: Insert at the end\n");
		printf("3: Delete from the beginning\n");
		printf("4: Delete from the end\n");
        printf("5: Exit\n");
		printf("Enter the choice: ");
		scanf("%d", &choice);
		switch(choice)
		{
			case 1:
				printf("Enter the element to insert at the beginning: ");
				scanf("%d", &x);
				insertB(x);
				display();
			break;
			
			case 2:
				printf("Enter the element to insert at the end: ");
				scanf("%d", &x);
				insertE(x);
				display();
			break;

			case 3:
				x = deleteB();
				if(x == -1 || x == 0)
					printf("Empty list\n");
				else
				{
					printf("Element deleted from the beginning: %d\n", x);
					display();
				}
			break;

			case 4:
				x = deleteE();
				if(x == -1 || x == 0)
					printf("Empty list\n");
				else
				{
					printf("Element deleted from the end: %d\n", x);
					display();
				}
			break;

			case 5:
				display();
				printf("\nTerminated");
			break;
				
			default:
				printf("Invalid Input");                                              
		}
	}
	while(choice != 5);
	//getch();
	return 0;
}