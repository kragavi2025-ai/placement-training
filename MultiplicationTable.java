public class MultiplicationTable {
    public static void main(String[] args) {
        // Input number without Scanner or Command Line arguments
        int number = 5;
        
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
