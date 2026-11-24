package threadEx;

public class Main {
    public static void main(String[] args) {
//        interrupt() :-
//        It is a instance method.
//        It is used to interrupt a thread.
//        It sets the interrupt status of the target thread to true.
//        It does not necessarily stop the thread immediately.
//        Thread t = new Thread(() -> {
//            while (true) {
//                System.out.println("Thread is running...");
//            }
//        });

//        t.start();
//        t.interrupt(); // make interrupt status to true

//        isInterrupted() :-
//        It is a static method.
//        It checks whether a particular thread has been interrupted.
//        It returns true if the interrupt status is set.
//        It does NOT clear the interrupt status.

//        Thread t = new Thread(() -> {
//            while (!Thread.currentThread().isInterrupted()) {
//                System.out.println("Thread is running...");
//            }
//
//            System.out.println("Thread interrupted!");
//        });
//
//        t.start();
//        t.interrupt();

//        interrupted() :-
//        It is a static method.
//        It checks the interrupt status of the current thread.
//        It returns true if the current thread is interrupted.
//        Most importantly, it clears the interrupt status after checking it.
        Thread.currentThread().interrupt();

        System.out.println(Thread.interrupted()); // true
        System.out.println(Thread.interrupted()); // false
    }
}
