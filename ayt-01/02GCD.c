#include <stdio.h>
int gcd(int m, int n)
{
    return (m < n) ? gcd(n, m) : (m % n == 0) ? n : gcd(n, m % n);
}
int main(int argv, char **argc)
{
    return 0;
}