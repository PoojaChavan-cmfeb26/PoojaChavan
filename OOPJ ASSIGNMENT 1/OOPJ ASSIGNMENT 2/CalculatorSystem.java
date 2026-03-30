public class CalculatorSystem {
    // Overloaded methods named calculate

    // Method for two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Method for two doubles
    double calculate(double a, double b) {
        return a + b;
    }

    // Method for three integers
    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CalculatorSystem calc = new CalculatorSystem();

        System.out.println("--- Calculator Results ---");
        System.out.println("Sum of 2 ints (10+20): " + calc.calculate(10, 20));
        System.out.println("Sum of 2 doubles (5.5+6.5): " + calc.calculate(5.5, 6.5));
        System.out.println("Sum of 3 ints (1+2+3): " + calc.calculate(1, 2, 3));
    }
}