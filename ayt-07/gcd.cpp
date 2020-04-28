#include <iostream>
using namespace std;
int sol(int a, int b) { //euclides
      if(b == 0) return a;
      return sol(b, a % b);
}
int main() {
    int n; cin >> n;
    int arr[n];
    for(int i = 0; i < n; ++i)
        cin >> arr[i];
    if(n == 1) {
        cout << arr[0]<<'\n';
        return 0;
    } 
    int gcd = sol(arr[0], arr[1]);
    for(int i = 2; i < n; ++i) 
        gcd = sol(gcd, arr[i]);
    cout<<gcd<<'\n';
    return 0;
}