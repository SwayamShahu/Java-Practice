// Problem 2: Interfaces (Data Exporting)
// **Task ■■■** - Create an interface Exportable with method: void exportToCSV(). - Create UserReport and SalesData classes implementing Exportable. - Implement exportToCSV() in both with appropriate print statements. - In main, create a list of Exportable objects and call exportToCSV() polymorphically. **Why it's asked:** Tests understanding of interfaces for creating loosely coupled systems


import java.util.*;

interface Exportable {
    void exportToCSV();
}

class UserReport implements Exportable {
    @Override
    public void exportToCSV() {
        System.out.println("Exporting User Report data to CSV...");
    }
}

class SalesData implements Exportable {
    @Override
    public void exportToCSV() {
        System.out.println("Exporting Sales Data to CSV...");
    }
}

public class Program6 {
    public static void main(String[] args) {
        List<Exportable> exports = new ArrayList<>();

        exports.add(new UserReport());
        exports.add(new SalesData());

        for (Exportable e : exports) {
            e.exportToCSV();
        }
    }
}
