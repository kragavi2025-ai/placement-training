public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
