package src.com.gla.interfaces-abstraction.Level1;


interface UnitConverter{
    static double kmToMiles(double km){
        return km * 0.621;
    }

    static double kgToLbs(double kg){
        return kg * 2.204;
    }
}

public class UnitConversionTool{
    public static void main(String[] args){
        System.out.println("10 km = " + UnitConverter.kmToMiles(10) + " miles");
    }
}
