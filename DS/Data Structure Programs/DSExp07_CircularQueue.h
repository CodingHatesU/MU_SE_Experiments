// Yug Solanki, SE3, 57
// Header file (.h) file

#include<stdio.h>
#include<stdlib.h>

#define SIZE 5
int arr[SIZE];
int front = -1, rear = -1;

int isFull() {
    if ((front == rear + 1) || (front == 0 && rear == SIZE -1)) return 1;
    return 0;
}

int isEmpty() {
    if (front == -1) return 1;
    return 0;
}

void enq(int item) {
    if (isFull()) {
        printf("Queue is full");
        return ;
    }
    if (front == -1) {
        front = 0;
        rear = 0;
    } else {
        if (rear == SIZE-1)
            rear = 0;
        else 
            rear = rear+1;
    }
    arr[rear] = item;
}

void deq() {
    if (isEmpty()) {
        printf("Queue is empty");
        return;
    } 
    printf("Element deleted from queue is: %d\n", arr[front]);
    if (front == rear) {
        front = -1;
        rear = -1;
    } else {
        if (front == SIZE-1)
            front = 0;
        else 
            front = front + 1;
    }
}

void display()
{
	int front_pos = front,rear_pos = rear;
	if(isEmpty())
	{
		printf("Queue is empty\n");
		return;
	}
	printf("Queue elements :\n");
	if( front_pos <= rear_pos )
		while(front_pos <= rear_pos)
		{
			printf("%d ", arr[front_pos]);
			front_pos++;
		}
	else
	{
		while(front_pos <= SIZE -1)
		{
			printf("%d ", arr[front_pos]);
			front_pos++;
		}
		front_pos = 0;
		while(front_pos <= rear_pos)
		{
			printf("%d ", arr[front_pos]);
			front_pos++;
		}
	}
	printf("\n");
}