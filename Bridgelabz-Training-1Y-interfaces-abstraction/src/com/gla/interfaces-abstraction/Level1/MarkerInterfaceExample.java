package src.com.gla.interfaces-abstraction.Level1;


interface SensitiveData{}

class UserData implements SensitiveData{
    String name="Rahul";
}

public class MarkerInterfaceExample{
    public static void main(String[] args){
        UserData d = new UserData();

        if(d instanceof SensitiveData){
            System.out.println("Sensitive data - encrypt before saving");
        }
    }
}
