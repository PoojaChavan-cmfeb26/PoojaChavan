#include <iostream>
using namespace std;

class Counter {
private:
    static int count; // static variable to track number of objects

public:
    // Constructor increments count each time an object is created
    Counter() {
        count++;
    }

    // Static function to get total count
    static int getCount() {
        return count;
    }
};

// Initialize static member
int Counter::count = 0;

int main() {
    int N;
    cin >> N;

    // Create N objects
    for (int i = 0; i < N; i++) {
        Counter obj;
    }

    // Print total objects created
    cout << "Total Objects: " << Counter::getCount() << endl;

    return 0;
}