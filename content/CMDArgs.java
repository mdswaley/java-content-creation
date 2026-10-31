package content;

public class CMDArgs {
    public static void main(String[] args) {
        String user = args[0];

        int age = Integer.parseInt(args[1]);

        System.out.println(user);
        System.out.println(age);
    }
}
//Command-Line Arguments in Java are the values we pass to a
//Java program when executing it from the command line, instead
//of asking the user to enter input while the program is running.


