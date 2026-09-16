public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int originalNumber = number;
        int reversed = 0;

        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a Palindrome Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome Number.");
        }
    }
}
