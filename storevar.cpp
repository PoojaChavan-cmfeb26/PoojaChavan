//============================================================================
// Name        : storevar.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

    int num = 10;
    cout << "Initial value: " << num << endl;
//Create a pointer pointing to the variable
    int* ptr = &num;
// Create a reference to the same variable
    int& ref = num;
 //  Modify the value using the pointer
    *ptr = 20;
    cout << "Value after modifying via pointer: " << num << endl;
// Modify the value using the reference
    ref = 30;
    cout << "Value after modifying via reference: " << num << endl;
 return 0;
}
