#include <stdio.h>
void collatz(int n)
{
    printf("%i ", n);
    if(n == 1) return;
    else if(n & 1) collatz(3 * n + 1);
    else collatz(n >> 1);
}
int main(int argv, char **argc)
{
    collatz(3);
    return 0;
}