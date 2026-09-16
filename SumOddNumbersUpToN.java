public class SumOddNumbersUpToN {
    public static void main(String[] args) {
        // Input N without Scanner or Command Line arguments
        int n = 10;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        
        System.out.println("Sum of Odd Numbers up to " + n + " is: " + sum);
    }
}
