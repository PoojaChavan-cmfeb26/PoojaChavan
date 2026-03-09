#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// Define the Student structure
struct Student {
    int rollNumber;
    string name;
    float marks;
};

int main() {
    Student studentDetails;
    cin >> studentDetails.rollNumber >> studentDetails.name >> studentDetails.marks;

    // Determine the grade based on the marks
    char grade;
    if (studentDetails.marks >= 75) {
        grade = 'A';
    } else if (studentDetails.marks >= 60 && studentDetails.marks < 75) {
        grade = 'B';
    } else if (studentDetails.marks >= 40 && studentDetails.marks < 60) {
        grade = 'C';
    } else {
        grade = 'F';
    }

    // Print the student details and grade
    cout << "Roll Number: " << studentDetails.rollNumber << endl;
    cout << "Name: " << studentDetails.name << endl;
    cout << "Marks: " << studentDetails.marks << endl;
    cout << "Grade: " << grade << endl;

    return 0;
}
