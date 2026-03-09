
#include <iostream>
using namespace std;


void findMinMax(int a, int b, int c, int &minVal, int &maxVal) {

    minVal = a;
    maxVal = a;


    if (b < minVal) minVal = b;
    if (c < minVal) minVal = c;

    if (b > maxVal) maxVal = b;
    if (c > maxVal) maxVal = c;
}

int main() {
    int x, y, z;
    int lo = 0, hi = 0; 
    cout << "enter 3 integers: ";
    cin >> x >> y >> z;

  
    findMinMax(x, y, z, lo, hi);

    cout << "--- Result ---" << endl;
    cout << " (Minimum): " << lo << endl;
    cout << "(Maximum): " << hi << endl;

    return 0;
}
