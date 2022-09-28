#include<stdio.h>
#include<conio.h>
#include <stdlib.h>
#include <stdbool.h>
#include"DSExp8_Doubly.h"

int main() {
  struct Node* head = NULL;
  int a,r = 1;
  while (r != 6)
  {
   printf("Select the option: \n1)Insert Front \n2)Insert End \n3)Delete Front \n4)Delete End  \n5)Display \n6)Quit\n\n");
  scanf("%d",&r);
  switch (r)
  {
   case 1:
      printf("Enter the number: ");
      scanf("%d",&a);
      InsertBeginning(a);
      break;
   case 2:
      printf("Enter the number: ");
      scanf("%d",&a);
      insertEnd(a);
      break;
   case 3:
      DeleteBeginning();
      break;
   case 4:
      DeleteEnd();
      break;
   case 5:
      printf("\n\n\n\n\n");
      DisplayForward();
      break;
  default:
   break;
  }
  }
  return 0;
}