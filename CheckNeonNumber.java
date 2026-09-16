public class CheckNeonNumber {
    public static void main(String[] args) {
        // Input number without Scanner or Command Line arguments
        int number = 9;
        int square = number * number;
        int sumOfDigits = 0;

        int temp = square;
        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (sumOfDigits == number) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is NOT a Neon Number.");
        }
    }
}
