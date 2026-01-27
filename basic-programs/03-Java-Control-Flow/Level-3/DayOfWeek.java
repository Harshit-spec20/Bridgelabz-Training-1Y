// Program to find the Day of the Week using Gregorian calendar formula
// Command-line arguments: m (month), d (day), y (year)
class DayOfWeek {
    public static void main(String[] args) {
        // Read command-line arguments and convert them to integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        // Step 1: Calculate y0 based on given formula
        int y0 = year - (14 - month) / 12;
        // Step 2: Calculate x using y0
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Step 3: Calculate m0 based on given formula
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        // Step 4: Calculate d0 (day of the week)
        int d0 = (day + x + (31 * m0) / 12) % 7;
        // Print the result
        System.out.println("Day of the week = " + d0);
        System.out.println("0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday");
        System.out.println("4 = Thursday, 5 = Friday, 6 = Saturday");
    }
}
