//============================================================================
// Name        : arr2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdlib>  // for malloc and free
using namespace std;

int main() {
    // Allocate an array of 5 integers using malloc
    int* arr = (int*) malloc(5 * sizeof(int));

    if (arr == nullptr) {
        cout << "Memory allocation failed!" << endl;
        return 1;
    }

    // Take user input
    cout << "Enter 5 integers: ";
    for (int i = 0; i < 5; i++) {
        cin >> arr[i];
    }

    // Print the values
    cout << "You entered: ";
    for (int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    // Deallocate memory
    free(arr);

    return 0;
}
