//SE-3, 20, Suraj Jagtap

//Stack.h File
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#define size 100

float stack[size], x;
int top = -1, i;

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

void push(float value)
{
    if(isfull())
        printf("\n Stack Overflow");
    else
    {
        top++;
        stack[top]=value;
    }
}

float pop()
{
    float value = -1;
    if(isempty())
        printf("\n Stack Underflow");
    else
        value = stack[top--];
    return value;
}

//Function to check whether the digit
int isdigit(int x)
{
    if (x >= 1 && x <= 9)
        return 1;
    else
        return 0;
}

//Function to evluate the given postfix expression
float evaluate(char *postfix)
{
    int i=0;
    float x1, x2, value = 0;
    for(i = 0; postfix[i] !='\0'; i++)
    {
        if(isdigit(postfix[i]))
            push(postfix[i] - '0');
            else
        {
            x2 = pop();
            x1 = pop();
            switch(postfix[i])
            {
                case '+': value = x1 + x2; break;
                case '-': value = x1 - x2; break;
                case '*': value = x1 * x2; break;
                case '/': value = x1 / x2; break;
                case '%': value = (int)x1 % (int)x2; break;
            }
            push(value);
        }
    }
    return stack[top];
}