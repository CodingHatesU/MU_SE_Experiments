// Header file

#include <stdio.h>
#include <stdlib.h>

#define MAX 50

int queue_array[MAX];
int front = -1;
int rear = -1;

void enq() {
    int item;
    if (rear == MAX-1) 
    {
        printf("Queue Overflow");
    } else {
        if (front == -1 && rear == -1) {
            front = 0;
        }
        printf("Enter element to enter: ");
        scanf("%d", &item);
        rear = rear+1;
        queue_array[rear] = item;
    }
}

void display() {
    int i;
    if (front == -1 || front > rear) 
    {
        printf("Queue is empty.\n");
    } else {
        printf("Queue is:\n ");
        for (int i = front; i<=rear; i++)
            printf("%d ", queue_array[i]);
        printf("\n");
    }
}

void deq() {
    if (front == -1 || front > rear) 
    {
        printf("Queue Underflow\n");
        return ;
    } else {
        printf("Element deleted from queue is: %d\n", queue_array[front]);
        front = front + 1;
    }
}
