#include <iostream>
using namespace std;
int main() {
    int t; cin >> t;
    int a, b, c;
    for(int i = 0; i < t; ++i) {
        cin >> a >> b;
        if(not (a & 1) and not (b & 1)) c = ((b - a) >> 1);
        else c = ((b - a) >> 1) + 1;
        cout<<c<<'\n';
    }
}