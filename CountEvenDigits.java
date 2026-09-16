public class CountEvenDigits {
    public static void main(String[] args) {
        // Input number without Scanner or Command Line arguments
        int number = 246813;
        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0) {
            count = 1; // 0 is even
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    count++;
                }
                temp /= 10;
            }
        }

        System.out.println("Number of even digits in " + number + " is: " + count);
    }
}
