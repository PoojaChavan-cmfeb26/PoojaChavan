#include <iostream>
using namespace std;

// Base class
class Shape {
public:
    virtual double area() = 0; // pure virtual function
    virtual ~Shape() {}        // virtual destructor
};

// Derived class Rectangle
class Rectangle : public Shape {
private:
    double length, width;
public:
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double area() override {
        return length * width;
    }
};

// Derived class Circle
class Circle : public Shape {
private:
    double radius;
public:
    Circle(double r) {
        radius = r;
    }
    double area() override {
        return 3.14 * radius * radius;
    }
};

int main() {
    int choice;
    cin >> choice;

    Shape* shape = nullptr;

    if (choice == 1) {
        double length, width;
        cin >> length >> width;
        shape = new Rectangle(length, width);
    } else if (choice == 2) {
        double radius;
        cin >> radius;
        shape = new Circle(radius);
    } else {
        cout << "Invalid choice\n";
        return 0;
    }

    cout << "Area = " << shape->area() << endl;

    delete shape; // free memory
    return 0;
}