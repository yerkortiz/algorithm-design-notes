#include <stdio.h>
int gcd(int m, int n)
{
    printf("%i %i\n", m, n);
    return (m < n) ? gcd(n, m) : (m % n == 0) ? n : gcd(n, m % n);
}
int main(int argv, char **argc)
{
    gcd(9, 4);
    return 0;
}