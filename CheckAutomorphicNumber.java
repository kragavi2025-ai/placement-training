public class CheckAutomorphicNumber {
    public static void main(String[] args) {
        // Input number without Scanner or Command Line arguments
        int number = 25;
        long square = (long) number * number;
        boolean isAutomorphic = true;

        int temp = number;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is NOT an Automorphic Number.");
        }
    }
}
