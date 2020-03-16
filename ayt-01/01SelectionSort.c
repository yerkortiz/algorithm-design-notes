#include <stdio.h>
#define SWAP(a, b, type) {type temp = a; a = b; b = temp;}
void selectionSort(int arr[], int n)
{
    int i, j;
    for(i = 0; i < n; ++i)
        for(j = i + 1; j < n; ++j) 
            if(arr[i] < arr[j]) 
                SWAP(arr[j], arr[i], int);
}
int main(int argv, char **argc)
{
    return 0;
}