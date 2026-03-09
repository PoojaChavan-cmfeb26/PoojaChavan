#include <iostream>
#include <string>
using namespace std;

class Student {
private:
    string name;
    int age;
    double grade;

public:
    
    Student() : name("Unknown"), age(0), grade(0.0) {
        cout << "Default constructor called.\n";
    }

    // Parameterized constructor
    Student(string n, int a, double g) : name(n), age(a), grade(g) {
        cout << "Parameterized constructor called.\n";
    }

    // Display function
    void display() const {
        cout << "Name: " << name
             << ", Age: " << age
             << ", Grade: " << grade << "\n";
    }
};

int main() {
    // Using default constructor
    Student s1;
    s1.display();

    // Using parameterized constructor
    Student s2("Alice", 20, 88.5);
    s2.display();

    // Using uniform initialization (C++11+)
    Student s3{"Bob", 22, 91.2};
    s3.display();

    return 0;
}
