public class ProductOfDigits {
    public static void main(String[] args) {
        
        int number = 234;
        int product = 1;
        int temp = Math.abs(number);

        if (temp == 0) {
            product = 0;
        } else {
            while (temp != 0) {
                product *= (temp % 10);
                temp /= 10;
            }
        }

        System.out.println("Product of digits of " + number + " is: " + product);
    }
}
