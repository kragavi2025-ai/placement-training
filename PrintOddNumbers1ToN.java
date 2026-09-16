public class PrintOddNumbers1ToN {
    public static void main(String[] args) {
        // Input N without Scanner or Command Line arguments
        int n = 20;
        
        System.out.println("Printing Odd Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
