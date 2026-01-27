// Program to check Harshad Number
import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
