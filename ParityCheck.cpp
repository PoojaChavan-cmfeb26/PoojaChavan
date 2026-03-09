#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    long long a, b;

    cin >> a >  b;

    long long sum = a + b;

    cout << sum <<\endl;

   if (sum % 2 == 0) 
   {
    cout << "Even" \t;
   } else 
   {
   cout << "Odd" << \t;
   }

    return 0;
}
