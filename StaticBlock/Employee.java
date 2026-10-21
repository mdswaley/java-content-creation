package StaticBlock;

public class Employee {
    static String url;

//    A static block is used to initialize static variables or
//    perform one-time initialization when a class is loaded by the JVM.
    static {
        System.out.println("Initializing database configuration...");
        url = "jdbc:mysql://localhost:3306/mydb";
    }

    public static void main(String[] args) {
//        Employee emp = new Employee();
//
//        Employee emp2 = new Employee();
    }
}
