public class Print1ToN {
    public static void main(String[] args) {
        // Input N without Scanner or Command Line arguments
        int n = 10;
        
        System.out.println("Printing 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
