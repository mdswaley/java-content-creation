package PassByValueOrReference;

public class Example1 {

//    When you pass an object to a method, Java copies the
//    value of the reference to another new reference, not the
//    actual object reference variable itself.

    static void updateBalance(int balance) { // (1002) --> 5000
        balance = 10000;
        System.out.println("Inside method: " + balance);
    }

    public static void main(String[] args) {
        int myBalance = 5000; // (1001) -> 5000

        updateBalance(myBalance);

        System.out.println("Outside method: " + myBalance);
    }
}
