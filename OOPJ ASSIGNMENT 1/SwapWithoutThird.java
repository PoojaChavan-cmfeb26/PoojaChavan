public class SwapWithoutThird {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap without third variable
        a = a + b;  // a becomes 30
        b = a - b;  // b becomes 10
        a = a - b;  // a becomes 20

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}