#include<stdio.h>
#include<stdlib.h>
struct Node  {
   struct Node *previous;
   int item;
   struct Node *next;
};
struct Node *head;
struct Node *GetNewNode(int ele) {
   struct Node *ptr = (struct Node*)malloc(sizeof(struct Node));
   ptr->item = ele;
   ptr->previous = NULL;
   ptr->next = NULL;
   return ptr;
}
void InsertBeginning(int ele) {
   struct Node *ptr = GetNewNode(ele);
   if(head == NULL) {
   head = ptr;
   return;
   }
   head->previous = ptr;
   ptr->next = head;
   head = ptr;
}
void DeleteBeginning() {
   struct Node *ptr;
   //checking if the list is empty or not
   if(head == NULL) {
      printf("\n Sorry there are no items in the list");
   }
   //if there is only one item present in the list
   else if(head->next == NULL)
   {
      head = NULL;
      free(head);
      printf("\nCongratulations!! Node has been successfully deleted \n");
   }
   //if there are more than one item present in the list
   else
   {
      ptr = head;
      head = head -> next;
      head -> previous = NULL;
      free(ptr);
   printf("\n Congratulations!! Node has been successfully deleted \n");
   }
}
//Printing all the elements of the list in forward direction
void DisplayForward() {
   struct Node *ptr1 = head;
   if(ptr1 == NULL)
   {
   printf("\n Sorry there are no items in the list");
   }
   else
   {
   printf("Elements in the forward Direction ");
   while(ptr1 != NULL) {
      printf("%d  ",ptr1->item);
      ptr1 = ptr1->next;
   }
   printf("\n");  
   }
}
//Printing all the elements in the reverse direction
void DisplayReverse() {
   struct Node *ptr1 = head;
   if(ptr1 == NULL)
   {
      printf("\n Sorry there are no items in the list");
   }
   else
   {
      // traversing till the last node
      while(ptr1->next != NULL) {
         ptr1 = ptr1->next;
      }
      // Traversing backward with the help of previous pointer
      printf("Elements in the Reverse Direction ");
      while(ptr1 != NULL) {
         printf("%d ",ptr1->item);
         ptr1 = ptr1->previous;
      }
      printf("\n");
   }
}