public class CheckStrongNumber {
    public static void main(String[] args) {
        
        int number = 145;
        int originalNumber = number;
        int sum = 0;

        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Strong Number.");
        }
    }
}
