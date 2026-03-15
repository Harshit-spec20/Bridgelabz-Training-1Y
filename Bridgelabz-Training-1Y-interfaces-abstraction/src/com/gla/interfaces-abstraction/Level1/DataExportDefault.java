package src.com.gla.interfaces-abstraction.Level1;


interface DataExporter{
    void exportCSV();

    default void exportJSON(){
        System.out.println("Exported JSON");
    }
}

class Report implements DataExporter{
    public void exportCSV(){
        System.out.println("Exported CSV");
    }
}

public class DataExportDefault{
    public static void main(String[] args){
        Report r = new Report();
        r.exportCSV();
        r.exportJSON();
    }
}
