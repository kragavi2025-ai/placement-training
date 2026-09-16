public class FindLargestDigit {
    public static void main(String[] args) {
        int number = 38291;
        int maxDigit = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            int digit = temp % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            temp /= 10;
        }

        System.out.println("Largest digit in " + number + " is: " + maxDigit);
    }
}
