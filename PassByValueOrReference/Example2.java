package PassByValueOrReference;

public class Example2 {
//    emp --> (1001)  e --> (1002)
    static void change(Employee e) {
        e = new Employee();
        e.name = "Akash";
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Raaj";

        change(emp);

        System.out.println(emp.name);
    }
}
class Employee {
    String name;
}

