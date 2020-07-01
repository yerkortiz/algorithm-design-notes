#include <bits/stdc++.h>
using namespace std;

vector<int> prefix(string &S) {
    vector<int> p(S.size()); p[0] = 0;
    for(int i = 1;i < S.size();++i) {
        p[i] = p[i-1];
        while(p[i]>0 && S[p[i]]!=S[i]) p[i] = p[p[i]-1];
        if(S[p[i]]==S[i]) p[i]++;
    }
    return p;
}
int KMP(string &P, vector<int> &pi, string &S) {
    int n = S.length(), m = P.length();
    int j = 0, ans = 0;
    for(int i = 0; i < n; ++i) {
        while(j > 0 && S[i] != P[j]) j = pi[j-1];
        if(S[i] == P[j]) ++j;
        if(j == P.length()) {
        ++ans;
        j = pi[j-1];
        }
    }
    return ans;
}