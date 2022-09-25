//SE-3, 20, Suraj Jagtap

//DS Exp 01: Write a Program to implement Binary Search Technique.

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

typedef struct {
    int *a;
    int size;
    int length;
}array;

void swap(int *a, int *b);
void create(array *arr);
void initialise(array *arr);
void display(array arr);
void BubbleSort(array *arr);
int BinSearch(array arr, int key);

int main() {
    array arr;
    int key, ans;
    //clrscr();
    create(&arr);
    initialise(&arr);
    BubbleSort(&arr);
    printf("\nSorted Array:\n");
    display(arr);
    printf("\n\nEnter the element to search: ");
    scanf("%d", &key);
    ans = BinSearch(arr, key);
    if (ans != -1)
        printf("The key is found at the index no: %d", ans);
    else
        printf("The key is not found in the given array");
    //getch();
    return 0;
    
}

void swap(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

void create(array *arr)
{
    printf("Enter the size of the array: ");
    scanf("%d", &arr->size);
    arr->a = (int*)malloc(arr->size*sizeof(int));
}

void initialise(array *arr)
{
    int i;
    printf("Enter the number of elements: ");
    scanf("%d", &arr->length);
    printf("Enter the elments:\n");
    for (i = 0; i <arr->length; i++)
        scanf("%d", &arr->a[i]);
}

void display(array arr)
{
    int i;
    for (i = 0; i < arr.length; i++)
        printf("%d ", arr.a[i]);
}

void BubbleSort(array *arr)
{
    int i, j;
    for (i = 0 ; i < arr->length - 1; i++)
    {
        for (j = 0; j < arr->length - i - 1; j++)
        {
            if (arr->a[j] > arr->a[j+1])
                swap(&(arr->a[j]), &(arr->a[j+1]));
        }
    }
}

int BinSearch(array arr, int key)
{
    int low = 0, high = (arr.length)-1, mid;
    while (low <= high)
    {
        mid = ((low + high)/2);
        if (key > arr.a[mid])
            low = mid + 1;
        else if (key < arr.a[mid])
            high = mid - 1;
        else if (key == arr.a[mid])
            return mid;
    }
    return -1;
}