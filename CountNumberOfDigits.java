public class CountNumberOfDigits {
    public static void main(String[] args) {
       
        int number = 98765;
        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);
    }
}
