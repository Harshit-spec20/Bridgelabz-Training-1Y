package JavaString.Extras;
import java.util.Scanner;
import java.time.LocalDate;
public class DateArithmetic{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date (yyyy-mm-dd):");
        LocalDate date=LocalDate.parse(sc.nextLine());
        LocalDate result=date.plusDays(7).plusMonths(1).plusYears(2);
        result=result.minusWeeks(3);
        System.out.println("Final Date: "+result);
    }
}