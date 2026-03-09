
#include <stdio.h>

// Function prototypes
float celsiusToFahrenheit(float c);
float fahrenheitToCelsius(float f);

int main() {
    float celsius_temp = 30.0;
    float fahrenheit_temp = 86.0;

    // Convert Celsius to Fahrenheit and print
    float converted_f = celsiusToFahrenheit(celsius_temp);
    printf("%.2f Celsius is %.2f Fahrenheit\n", celsius_temp, converted_f);

    // Convert Fahrenheit to Celsius and print
    float converted_c = fahrenheitToCelsius(fahrenheit_temp);
    printf("%.2f Fahrenheit is %.2f Celsius\n", fahrenheit_temp, converted_c);

    return 0;
}

// Function definitions

/*
 * Converts Celsius to Fahrenheit
 * Formula: F = (C * 9/5) + 32
 */
float celsiusToFahrenheit(float c) {
    return (c * 9.0/5.0) + 32.0;
}

/*
 * Converts Fahrenheit to Celsius
 * Formula: C = (F - 32) * 5/9
 */
float fahrenheitToCelsius(float f) {
    return (f - 32.0) * 5.0/9.0;
}
