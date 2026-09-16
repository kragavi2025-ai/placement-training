public class FindLastDigit {
    public static void main(String[] args) {
        
        int number = 458;
        int lastDigit = Math.abs(number) % 10;

        System.out.println("The last digit of " + number + " is: " + lastDigit);
    }
}
