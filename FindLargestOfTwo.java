public class FindLargestOfTwo {
    public static void main(String[] args) {
        
        int num1 = 45;
        int num2 = 78;

        if (num1 > num2) {
            System.out.println(num1 + " is the largest of two numbers.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest of two numbers.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
