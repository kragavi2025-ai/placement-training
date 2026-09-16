public class CountOddDigits {
    public static void main(String[] args) {
        int number = 246813;
        int count = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                count++;
            }
            temp /= 10;
        }

        System.out.println("Number of odd digits in " + number + " is: " + count);
    }
}
