#include <iostream>
using namespace std;

// Base class
class Person {
    string name;
    int age;

public:
    // Constructor for Person
    Person(string n, int a) {
        name = n;
        age = a;
        cout << "Person constructor called: " << name << ", Age: " << age << endl;
    }
};

// Derived class
class Student : public Person {
    int rollNo;

public:
    // Constructor for Student
    Student(string n, int a, int r) : Person(n, a) {  // Call Person constructor
        rollNo = r;
        cout << "Student constructor called: Roll No: " << rollNo << endl;
    }
};

int main() {
    // Create Student object
    Student s("Pooja", 20, 101);
    return 0;
}
