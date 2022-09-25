// Yug Solanki, SE3, 57
// main file

#include<stdio.h>
#include<stdlib.h>
#include "circularQueue.h"

int main() {
    
    int choice, item;
	do
	{
		printf("1.Insert\n");
		printf("2.Delete\n");
		printf("3.Display\n");
		printf("4.Quit\n");

		printf("Enter your choice : ");
		scanf("%d",&choice);

		switch(choice)
		{
			case 1 :
				printf("Input the element for insertion in queue : ");
				scanf("%d", &item);
				enq(item);
				break;
			case 2 : deq(); break;
			case 3: display(); break;
            case 4:
				break;
				default:
				printf("Wrong choice\n");
		}
        printf("\n");
	}while(choice!=4);
    
    return 0;
}