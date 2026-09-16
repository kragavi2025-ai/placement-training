public class ReverseNumber {
    public static void main(String[] args) {
        
        int number = 12345;
        int reversed = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (number < 0) {
            reversed = -reversed;
        }

        System.out.println("Reverse of " + number + " is: " + reversed);
    }
}
