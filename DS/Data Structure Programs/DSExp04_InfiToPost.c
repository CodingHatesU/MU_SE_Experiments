//SE-3, 20, Suraj Jagtap

//DS Exp 04: Convert an Infix expression to a Postfix expression.

//Main C File
#include<stdio.h>
#include<string.h>
#include<conio.h>
#include "DSExp04_InfiToPost.h"

int main()
{
    char infix[50], postfix[50];
    //clrscr();
    printf("\nEnter an Infix Expression:\n");
    gets(infix);
    strcpy(postfix, InfixToPostfix(infix));
    printf("\nPostifix Expression:\n");
    puts(postfix);
    printf("\n");
    //getch();
    return 0;
}