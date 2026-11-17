package Exceptionex;

// try - catch
public class Main {
    public static void main(String[] args) {
        System.out.println("---Start---");

        try{
//            int amount = 100 / 0;
            doSomething(null);
        } catch (ArithmeticException e){
            System.out.println(" / by zero");
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("data is null...");
            e.printStackTrace();
        }

        System.out.println("---End---");
    }

    public static void doSomething(String name){
        System.out.println("name is : "+name);
        System.out.println(name.length());
        System.out.println("jhjhfs");
    }
}

// Exception :-
// An exception is an unexpected problem that
// occurs during program execution and interrupts
// the normal flow of the program.
