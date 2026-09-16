public class CheckContainsZero {
    public static void main(String[] args) {
        // Input number without Scanner or Command Line arguments
        int number = 1052;
        boolean containsZero = false;
        int temp = Math.abs(number);

        if (temp == 0) {
            containsZero = true;
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                if (digit == 0) {
                    containsZero = true;
                    break;
                }
                temp /= 10;
            }
        }

        if (containsZero) {
            System.out.println(number + " contains digit 0.");
        } else {
            System.out.println(number + " does NOT contain digit 0.");
        }
    }
}
