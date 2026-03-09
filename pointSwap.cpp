#include <iostream>

using namespace std;

int main() {
    // 1. Declare variables
    int x = 10, y = 20, z = 30;

    // 2. Create pointers
    int *px = &x;
    int *py = &y;
    int *pz = &z;

    // 3. Print before swap and show addresses
    cout << "Before Swap:" << endl;
    cout << "x = " << *px << " (Address: " << px << ")" << endl;
    cout << "y = " << *py << " (Address: " << py << ")" << endl;
    cout << "z = " << *pz << " (Address: " << pz << ")" << endl;

    // 4. Swap x and z using pointer dereferencing
    int temp = *px;
    *px = *pz;
    *pz = temp;

    // 5. Print after swap and show addresses
    cout << "\nAfter Swap:" << endl;
    cout << "x = " << *px << " (Address: " << px << ")" << endl;
    cout << "y = " << *py << " (Address: " << py << ")" << endl;
    cout << "z = " << *pz << " (Address: " << pz << ")" << endl;

    return 0;
}
