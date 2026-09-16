public class FindLargestOfThree {
    public static void main(String[] args) {
        
        int num1 = 25;
        int num2 = 89;
        int num3 = 47;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest of three numbers.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest of three numbers.");
        } else {
            System.out.println(num3 + " is the largest of three numbers.");
        }
    }
}
