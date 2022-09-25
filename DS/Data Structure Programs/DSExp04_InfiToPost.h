//SE-3, 20, Suraj Jagtap

//Stack.h File
#include<string.h>
#include<stdlib.h>
#include<stdio.h>
#define size 50

char stack[size], x;
int i, top = -1;

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

char pop()
{
    if(isempty())
        printf("\n Stack Underflow");
    else
        x = stack[top--];
    return x;
}

//Function to calculate the precendence of operators
int pre(char x)
{
	if(x == '+' || x == '-')
		return 1;
	else if(x == '*' || x == '/')
		return 2;
	else if(x == '^')
		return 3;
	return 0;
}

//Function to know whether the given character is an alphabet (operand) or not
int isOperand(char x)
{
		if((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z'))
			return 1;
		else
			return 0;
}

//Function to convert the given infix expression to postfix
char * InfixToPostfix(char *infix)
{
	int i = 0,j = 0;
	char *postfix, temp;
	int len = strlen(infix);
	postfix = (char*)malloc((len + 2)*sizeof(char));
	while(infix[i] != '\0')
	{
        if(infix[i] == '(')
        {
            push(infix[i++]);
        }
        else if(infix[i] == ')')
		{
			while(!isempty() && stack[top] != '(')
			{
				postfix[j++] = pop();
			}
			if(isempty())
                exit(1);
            temp = pop();
            i++;
		}
		else if(isOperand(infix[i]))
			postfix[j++] = infix[i++];
		
		else if (!isOperand(infix[i]))
		{
			while(!isempty() && (stack[top]!= '(') && (pre(stack[top]) > pre(infix[i])))
				postfix[j++] = pop();
			push(infix[i++]);
		}
	}
	while(!isempty())
		postfix[j++] = pop();
	postfix[j]='\0';
	return postfix;
}
