public class Sum1ToN {
    public static void main(String[] args) {
        // Input N without Scanner or Command Line arguments
        int n = 10;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Sum of 1 to " + n + " is: " + sum);
    }
}
