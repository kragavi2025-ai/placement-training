public class FactorialN {
    public static void main(String[] args) {
        // Input N without Scanner or Command Line arguments
        int n = 5;
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
