#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void swapReference(long long &a, long long &b) {
    long long temp = a;
    a = b;
    b = temp;
}


int main() {
    long long a, b;
    if (!(std::cin >> a >> b)) {
        return 1;
    }
    swapReference(a, b);
    std::cout << a << " " << b << std::endl;
    return 0;
}

