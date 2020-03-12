/* 
    Código para transformar un natural base 10, 
    en un natural base k.
*/
#include <stdio.h>
#include <stdlib.h>

typedef unsigned long long int uint64_t;

#define EXIT_PROGRAM return 0
/* transformacion de un entero base 10 a base k */
void solution(uint64_t n, uint64_t k)
{
    if(n > 1) solution(n / k, k);
    printf("%llu ", n % k);
}
/* transformacion de un entero base 10 a base 2 
    usando operaciones binarias */
void bin(uint64_t n)
{
    if(n > 1) bin(n >> 1);
    printf("%llu ", n & 1);
}
int main(int argc, char **argv)
{
    /* natural number n, base k*/
    uint64_t n, k;
    //scanf("%llU %llU", &n, &k);
    if(argc != 3) EXIT_PROGRAM;
    n = atoi(argv[1]);
    k = atoi(argv[2]);
    if(k < 2) EXIT_PROGRAM;
    solution(n, k);
    EXIT_PROGRAM;
}