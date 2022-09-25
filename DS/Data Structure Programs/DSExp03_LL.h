//SE-3, 20, Suraj Jagtap

//List.h File
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node
{
	int data;
	struct node *next;
}*first = NULL;
struct node *last;


void create(int a)
{
	int i;
	first = (struct node*)malloc(sizeof(struct node));
	first->data = a;
	first->next = NULL;
	last = first; 
}


void display()
{
	struct node *p = first;
	if(p == NULL)
		printf("\nEmpty List\n");
	else
	{
		printf("\nCurrent Linked-List:\n");
		while(p != NULL)
		{
			printf("%d ", p->data);
			p = p->next;
		}
    	printf("\n");
	}
}

void insertB(int x)
{
	struct node *t;
	t = (struct node*)malloc(sizeof(struct node));
	t->data = x;
	t->next = first;
	first = t;
}

void insertE(int x)
{
	struct node *t;
	struct node *p = first;
	t = (struct node *)malloc(sizeof(struct node));
	t->data = x;
	t->next  = NULL;
	while(p->next != NULL)
		p = p->next;
	p->next = t;
}

int deleteB()
{
	if(first == NULL)
	{
		printf("\nInvalid Choice\n");
		return 0;
	}
	int x = -1;
	x = first->data;
	first = first->next;
	return x;
}

int deleteE()
{
	if(first == NULL)
	{
		printf("\nInvalid Choice\n");
		return 0;
	}
	int x  = -1;
	struct node* p = first;
	while(p->next->next != NULL)
		p = p->next;
	x = (p->next)->data;
	p->next = NULL;
	return x;
}
