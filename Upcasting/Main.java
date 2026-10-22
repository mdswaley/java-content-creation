package Upcasting;

class Main {
    public static void main(String[] args) {

//      Upcasting is the process of assigning a child class
//      object to a parent class reference. It happens implicitly,
//      without requiring an explicit cast.
//        Dynamic method dispatch

        Employee obj = new Manager(); // auto upcasting (Heap)
        obj.markIn(); // runtime polymorphism

//      1. at the compilation, it will check the method's (markIn())
//      exist in class Employee

//        2. at the time of execution(while running),
//        it will call the method on actual object
//        every object is created at runtime

    }
}
class Employee {
    public void markIn(){
        System.out.println("Employee.markIn().....Employee mark in");
    }
}

class Manager extends Employee{
    @Override
    public void markIn(){
        System.out.println("Manager.markIn().....Manager mark in");
    }
}
