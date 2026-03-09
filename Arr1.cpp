//============================================================================
// Name        : Arr1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
int main() {
    // Allocate an array of 5 integers using new
    int* arr = new int[5];

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
    delete[] arr;

    return 0;
}


/* Explanation
- new int[5] dynamically allocates memory for 5 integers on the heap.
- The program takes input from the user and stores it in the array.
- It then prints the values back to the console.
- Finally, delete[] arr frees the allocated memory to avoid memory leaks.
This is a classic example of manual memory management in C++.
Would you like me to also show you a modern C++ version using std::vector or std::unique_ptr, which avoids manual new and delete[]?*/
