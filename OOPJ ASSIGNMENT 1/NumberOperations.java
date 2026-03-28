public class NumberOperations

 {
    public static void main(String[] args)

 {
        int intNum = 25;
        double doubleNum = 12.5;

        // Addition
        double additionResult = intNum + doubleNum;

        // Division
        double divisionResult = intNum / doubleNum;

        // Type casting division result to int
        int castedResult = (int) divisionResult;

        // Printing results
        System.out.println("Integer number: " + intNum);
        System.out.println("Double number: " + doubleNum);
        System.out.println("Addition result: " + additionResult);
        System.out.println("Division result: " + divisionResult);
        System.out.println("Casted division result (int): " + castedResult);
    }
}