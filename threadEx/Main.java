package threadEx;

public class Main {
    public static void main(String[] args) {
//        interrupted() :-
//        It checks the interrupt status of the current thread.
//        It returns true if the current thread is interrupted.
//        Most importantly,
//        it clears the interrupt status after checking it.

        Thread.currentThread().interrupt();

        System.out.println(Thread.interrupted()); // true
        System.out.println(Thread.interrupted()); // false
    }
}
