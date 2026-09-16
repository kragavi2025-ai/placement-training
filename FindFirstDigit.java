public class FindFirstDigit {
    public static void main(String[] args) {
        
        int number = 458;
        int temp = Math.abs(number);

        while (temp >= 10) {
            temp /= 10;
        }

        int firstDigit = temp;
        System.out.println("The first digit of " + number + " is: " + firstDigit);
    }
}
