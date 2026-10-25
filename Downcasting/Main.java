package Downcasting;

class Employee {
	String name;

	public Employee(String name) {
        super();
		this.name = name;
	}
// Definition :- converting Parent class reference to the Child class
// reference


//  Downcasting: converting the Object reference into a Employee reference.
//  This allows us to access Employee-specific members like name.

    @Override
    public boolean equals(Object obj){ //Object obj = new Employee("Raaj"); // upcasting
        Employee employee = (Employee) obj; // down casting

        return employee.name.equals(this.name);
    }
}

public class Main {
	public static void main(String[] args) {

        Employee p1 = new Employee("Raaj");
		Employee p2 = new Employee("Raaj");

		System.out.println(p1.equals(p2));
	}
}
