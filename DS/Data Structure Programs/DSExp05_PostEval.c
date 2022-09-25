//SE-3, 20, Suraj Jagtap

//DS Exp 05: Write a program to evaluate Postfix Expression. 

//C File
#include<stdio.h>
#include<conio.h>
#include "DSExp05_PostEval.h"

int main()
{
    float value;
    char postfix[50];
    //clrscr();
    printf("\nEnter a Postfix Expression:\n");
    gets(postfix);
    value = evaluate(postfix);
    printf("\nValue of the Postfix Expression = %.2f", value);
    printf("\n ");
    //getch();
    return 0;
}