#include <stdio.h>
int fibbonacci(int n) {
   if(n == 0){
      return 0;
   } else if(n == 1) {
      return 1;
   } else {
      return (fibbonacci(n-1) + fibbonacci(n-2));
   }
}
int fibbonacci2(int n) 
{
    if (n > 10000) return -1;
    int arr[10000] = {};
    arr[0] = 0; arr[1] = 1;
    for(int i = 2; i < 10000; ++i) 
        arr[i] = arr[i - 1] + arr[i - 2];
    return arr[n];
}
int main(int argv, char **argc)
{
    return 0;
}