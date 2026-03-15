package src.com.gla.interfaces-abstraction.Level1;


interface SecurityUtils{
    static boolean isStrong(String password){
        return password.length() >= 8;
    }
}

public class PasswordValidator{
    public static void main(String[] args){
        String pass = "java12345";
        System.out.println("Strong Password: " + SecurityUtils.isStrong(pass));
    }
}
