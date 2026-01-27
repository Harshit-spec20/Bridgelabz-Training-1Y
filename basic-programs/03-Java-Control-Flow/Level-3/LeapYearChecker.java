// Program to check Leap Year using multiple if-else conditions
import java.util.Scanner;
class LeapYearChecker {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        // Take year input
        int year = input.nextInt();
        // Check Gregorian calendar condition
        if (year >= 1582) {
            // Check leap year rules
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582");
        }
    }
}
