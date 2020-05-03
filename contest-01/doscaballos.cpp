/*
*ALGUN DÍA DARSE LA PAJA DE PONER
*ESAS 4 FÓRMULAS DENTRO DE UNA
*ES WEAITA DE SUMAR Y RESTAR
*/
#include <iostream>
#include <math.h>
using namespace std;
typedef long long long_t;
long_t f1(long_t n) {
    return (pow(n, 3) * 2 - pow(n, 2) - 9 * n + 12) / 2;
}
long_t f2(long_t n) {
    return (pow(n, 3) * 2 - pow(n, 2) - 5 * n + 8) / 2;
}
long_t f3(long_t n) {
    return (pow(n, 3) * 2 - pow(n, 2) - n) / 2;
}
long_t f4(long_t n) {
    return (pow(n, 3) - pow(n, 2)) / 2;
}
long_t f(long_t n) {
    return (n - 2) * f1(n) + f2(n) + f3(n) - n * f4(n);
}
int main()
{
    long_t n, i; cin >> n;
    for(i = 1; i <= n; ++i)
        cout<< f(i) <<'\n';
    return 0;
}