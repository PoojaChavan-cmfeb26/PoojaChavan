#include <iostream>
using namespace std;

class Box {
private:
    int length;
    int width;
    int height;

public:
    // Parameterized constructor
    Box(int length, int width, int height) {
        // Using this-> to differentiate between member variables and parameters
        this->length = length;
        this->width = width;
        this->height = height;
    }

    // Function to set dimensions using this-> pointer
    void setDimensions(int length, int width, int height) {
        this->length = length;
        this->width = width;
        this->height = height;
    }

    // Function to compute volume
    int volume() const {
        return length * width * height;
    }

    // Function to display dimensions
    void displayDimensions() const {
        cout << "Length: " << length
             << ", Width: " << width
             << ", Height: " << height << endl;
    }
};

int main() {
    // Create a Box object using parameterized constructor
    Box box1(10, 5, 3);
    cout << "Box 1 dimensions: ";
    box1.displayDimensions();
    cout << "Volume of Box 1: " << box1.volume() << endl;

    // Change dimensions using setDimensions
    box1.setDimensions(7, 4, 6);
    cout << "\nAfter changing dimensions:" << endl;
    box1.displayDimensions();
    cout << "Volume of Box 1: " << box1.volume() << endl;

    return 0;
}
