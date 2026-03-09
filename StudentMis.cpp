#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
using namespace std;

// Structure definition
struct Student {
    int rollNumber;
    string name;
    float marks;
};

// Function to determine grade based on marks
char calculateGrade(float marks) {
    if (marks >= 75) return 'A';
    else if (marks >= 60) return 'B';
    else if (marks >= 40) return 'C';
    else return 'F';
}

int main() {
    int n;
    cin >> n;

    vector<Student> students(n);
    float totalMarks = 0;

    // Read student data
    for (int i = 0; i < n; ++i) {
        cin >> students[i].rollNumber >> students[i].name >> students[i].marks;
        totalMarks += students[i].marks;
    }

    // Print student details
    for (int i = 0; i < n; ++i) {
        cout << "Roll Number: " << students[i].rollNumber << endl;
        cout << "Name: " << students[i].name << endl;
        cout << "Marks: " << students[i].marks << endl;
        cout << "Grade: " << calculateGrade(students[i].marks) << endl;
    }

    // Print class average
    cout << fixed << setprecision(2);
    cout << "Class Average: " << (totalMarks / n) << endl;

    return 0;
}
