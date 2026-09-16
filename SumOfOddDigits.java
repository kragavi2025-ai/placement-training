public class SumOfOddDigits {
    public static void main(String[] args) {
        
        int number = 246813;
        int sum = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            temp /= 10;
        }

        System.out.println("Sum of odd digits in " + number + " is: " + sum);
    }
}
