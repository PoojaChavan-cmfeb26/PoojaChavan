#include <iostream>
using namespace std;

class IntArray {
private:
    int* data;
    int size;

public:
    // Constructor: allocate memory and copy elements
    IntArray(int n, const int arr[]) {
        size = n;
        data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = arr[i];
        }
    }

    // Copy Constructor: deep copy
    IntArray(const IntArray& other) {
        size = other.size;
        data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = other.data[i];
        }
    }

    // Destructor: release memory
    ~IntArray() {
        delete[] data;
    }

    // Modify element at index
    void modify(int index, int value) {
        if (index >= 0 && index < size) {
            data[index] = value;
        }
    }

    // Print array
    void print(const string& label) const {
        cout << label << ": ";
        for (int i = 0; i < size; i++) {
            cout << data[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    int N;
    cin >> N;

    int* arr = new int[N];
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }

    // Create original IntArray
    IntArray original(N, arr);

    // Create copy using copy constructor
    IntArray copy = original;

    // Read modification input
    int index, value;
    cin >> index >> value;

    // Modify original array
    original.modify(index, value);

    // Print both arrays
    original.print("Original");
    copy.print("Copy");

    delete[] arr; // free temporary input array
    return 0;
}