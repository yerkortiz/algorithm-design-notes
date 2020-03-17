#include <stdio.h>
#define SWAP(a, b, type) {type temp = a; a = b; b = temp;}
void selectionSort(int arr[], int n) 
{ 
    int i, j, min; 
    for (i = 0; i < n - 1; i++) { 
        min = i; 
        for (j = i + 1; j < n; j++) 
          if (arr[j] < arr[min]) 
            min = j; 
        SWAP(arr[min], arr[i], int); 
    } 
} 
void bubbleSort(int arr[], int n)
{
    int i, j;
    for(i = 0; i < n; ++i)
        for(j = i; j < n; ++j)
            if(arr[i] > arr[j])
                SWAP(arr[i]), arr[j], int);
}
void printArr(int arr[], int n)
{
    int i;
    for(i = 0; i < n; ++i)
        printf("%i ", arr[i]);
    putchar('\n');
}
int main(int argv, char **argc)
{
    int arr[] = {8, 2, 1, 4, 6, 7, 3};
    printArr(arr, 7);
    selectionSort(arr, 7);
    printArr(arr, 7);
    return 0;
}