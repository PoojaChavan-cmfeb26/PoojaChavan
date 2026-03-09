#include <iostream>
#include <algorithm> 
#include <cstdio>
using namespace std;


int MaxOfFour(int a, int b, int c, int d) {

    int MaxNo= a;
    if (b > MaxNo) {
        MaxNo= b;
    }
    if (c > MaxNo) {
        MaxNo = c;
    }
    if (d > MaxNo) {
       MaxNo = d;
    }
    return MaxNo;
}

int main() {
    int a, b, c, d;
   
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = MaxOfFour(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}
