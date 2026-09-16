public class CountOccurrenceOfDigit {
    public static void main(String[] args) {
        // Input number and digit to find without Scanner or Command Line arguments
        int number = 1223422;
        int targetDigit = 2;
        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0 && targetDigit == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                if (digit == targetDigit) {
                    count++;
                }
                temp /= 10;
            }
        }

        System.out.println("Digit " + targetDigit + " occurs " + count + " times in " + number + ".");
    }
}
