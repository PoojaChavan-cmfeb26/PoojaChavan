//============================================================================
// Name        : rectangle1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <stdexcept> // For exception handling
using namespace std;

class Rectangle {
private:
    double length;
    double width;

public:
    // Default constructor
    Rectangle() : length(0), width(0) {}


    void setDimensions(double l, double w) {
        if (l <= 0 || w <= 0) {
            throw invalid_argument("Length and width must be positive numbers.");
        }
        length = l;
        width = w;
    }


    double getArea() const {
        return length * width;
    }

    void display() const {
        cout << "Length: " << length << ", Width: " << width << endl;
    }
};

int main() {
    Rectangle rect;

    try {
        double l, w;
        cout << "Enter length and width: ";
        if (!(cin >> l >> w)) {
            cerr << "Invalid input. Please enter numeric values.\n";
            return 1;
        }

        // Assign values using setDimensions()
        rect.setDimensions(l, w);

        // Display assigned values and area
        rect.display();
        cout << "Area: " << rect.getArea() << endl;
    }
    catch (const exception &e) {
        cerr << "Error: " << e.what() << endl;
        return 1;
    }

    return 0;
}

