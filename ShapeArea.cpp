#include <iostream>
#include <iomanip>
using namespace std;

// Base class
class Shape {
public:
    virtual double area() = 0; // pure virtual function
    virtual ~Shape() {}        // virtual destructor
};

// Rectangle class
class Rectangle : public Shape {
    double length, width;
public:
    Rectangle(double l, double w) : length(l), width(w) {}
    double area() override {
        return length * width;
    }
};

// Triangle class
class Triangle : public Shape {
    double base, height;
public:
    Triangle(double b, double h) : base(b), height(h) {}
    double area() override {
        return 0.5 * base * height;
    }
};

// Circle class
class Circle : public Shape {
    double radius;
public:
    Circle(double r) : radius(r) {}
    double area() override {
        return 3.14 * radius * radius;
    }
};

int main() {
    int type;
    cout<<"Enter Choice | 1 for Rectangle | 2 for Triangle | 3 for Circle  :"<<endl;

    cin >> type;

    Shape* shape = nullptr;


    if (type == 1) {
    	cout<<"For Area of Rectangle enter length and width:"<<endl;
        double l, w;
        cin >> l >> w;
        shape = new Rectangle(l, w);
    } else if (type == 2) {
    	cout<<"For Area of Triangle enter Breadth and Height:"<<endl;
        double b, h;
        cin >> b >> h;
        shape = new Triangle(b, h);
    } else if (type == 3) {
    	cout<<"For Area of Circle enter Radius:"<<endl;
        double r;
        cin >> r;
        shape = new Circle(r);
    }

    if (shape) {
        double result = shape->area();
        if (type == 2) {
            cout << fixed << setprecision(2);

        }
        cout << "Area = " << result << endl;
        delete shape; // free memory
    }

    return 0;
}
