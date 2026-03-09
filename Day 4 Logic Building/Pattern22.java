public class Pattern22 {
    public static void main(String[] args) {
        String str = "MUMBAI";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, i + 1));
        }
    }
}