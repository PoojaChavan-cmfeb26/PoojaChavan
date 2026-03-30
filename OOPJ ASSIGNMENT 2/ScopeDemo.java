public class ScopeDemo {
    public static void main(String[] args) {
        int methodVar = 10; // Declared inside method

        System.out.println("Method variable: " + methodVar);

        // Loop scope
        for (int i = 0; i < 3; i++) {
            int loopVar = i * 2; // Declared inside loop
            System.out.println("Loop variable: " + loopVar);
        }
        // System.out.println(loopVar); // ERROR: loopVar not accessible outside loop

        // Block scope
        {
            int blockVar = 50;
            System.out.println("Block variable: " + blockVar);
        }
        // System.out.println(blockVar); // ERROR: blockVar not accessible outside block
    }
}