//SE - 3, 20, Suraj Jagtap

//Stack.h file
#include<stdio.h>
#define size 20
int stack[size], top = -1, x, i;

void display()
{
  printf("\nCurrent Stack:\n");
  for(i = top; i >= 0; i--)
  {
    printf("%d", stack[i]);
  }
  printf("\n");
}

int isempty()
{
  if(top == -1)
    return 1;
  else
    return 0;
}

int isfull()
{
  if(top == size - 1)
    return 1;
  else
    return 0;
}

void push(int x)
{
  if(isfull())
    printf("\n Stack Overflow");
  else
  {
    top++;
    stack[top] = x;
  }
}

int pop()
{
  x = -1;
  if(isempty())
    printf("\n Stack Underflow");
  else
  {
    x = stack[top--];
  }
  return x;

}

int peek()
{
  x = -1;
  if(isempty())
    printf("\n Stack Underflow");
  else
    x = stack[top];
  return x;
}

