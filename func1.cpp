#include <iostream>
#include <iomanip>


const float PI = 3.14159f;

// @return The area (PI * r^2)

float circleArea(float radius) {
    return PI * radius * radius;
}

// @return The perimeter (2 * PI * r)
 
float circlePerimeter(float radius) {
    return 2.0f * PI * radius;
}

int main() {
    float radius = 7.0f;

    
    std::cout << std::fixed << std::setprecision(4);

    std::cout << "Radius: " << radius << std::endl;
    std::cout << "Area: " << circleArea(radius) << std::endl;
    std::cout << "Perimeter: " << circlePerimeter(radius) << std::endl;

    // PI = 3.0f; // attempt to modify const
    // Compiler Error: error: assignment of read-only variable 'PI'

    return 0;
}
