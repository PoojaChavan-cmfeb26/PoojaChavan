#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void swapValue(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

int main() {
   int a, b;
    if (scanf("%d %d", &a, &b) != 2) 
     {
        return 1; 
     }
    swapValue(a, b);
    printf("%d %d\n", a, b);

    return 0;
}