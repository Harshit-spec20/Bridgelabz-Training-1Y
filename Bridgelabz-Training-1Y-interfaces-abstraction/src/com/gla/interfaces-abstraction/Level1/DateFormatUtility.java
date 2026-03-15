package src.com.gla.interfaces-abstraction.Level1;


import java.time.LocalDate;

interface DateUtil{
    static String formatDate(){
        return LocalDate.now().toString();
    }
}

public class DateFormatUtility{
    public static void main(String[] args){
        System.out.println("Date: " + DateUtil.formatDate());
    }
}
