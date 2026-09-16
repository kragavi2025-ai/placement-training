public class PrintNTo1 {
    public static void main(String[] args) {
        // Input N without Scanner or Command Line arguments
        int n = 10;
        
        System.out.println("Printing " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
