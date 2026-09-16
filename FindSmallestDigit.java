public class FindSmallestDigit {
    public static void main(String[] args) {
        // Input number without Scanner or Command Line arguments
        int number = 38291;
        int minDigit = 9;
        int temp = Math.abs(number);

        if (temp == 0) {
            minDigit = 0;
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                if (digit < minDigit) {
                    minDigit = digit;
                }
                temp /= 10;
            }
        }

        System.out.println("Smallest digit in " + number + " is: " + minDigit);
    }
}
