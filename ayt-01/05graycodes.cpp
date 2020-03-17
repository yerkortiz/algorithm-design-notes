#include<iostream>
#include<vector>
using namespace std;
void generateGray(vector<int>&arr, int n, int &num){
   if(n==0){
      arr.push_back(num);
      return;
   }
   generateGray(arr, n-1, num);
   num = num ^ (1 << (n-1));
   generateGray(arr, n-1, num);
}
vector<int> gray(int n){
   vector<int> arr;
   int num = 0;
   generateGray(arr, n, num);
   return arr;
}
int main() {
   int n;
   cout << "Enter number of bits: ";
   cin >> n;
   vector<int> grayCode = gray(n);
   for(int i = 0; i<grayCode.size(); i++)
      cout << grayCode[i] << endl;
}