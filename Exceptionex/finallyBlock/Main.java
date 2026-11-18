package Exceptionex.finallyBlock;

public class Main {
    public static void main(String[] args)
    {
        int amount = 100;
        int dis = discount(amount, 10);
        int res = amount - dis;

        System.out.println("Total discount : "+dis);
        System.out.println("Total Price : "+res);
    }

    private static int discount(int amount, int dis) {
        int finalDis = 0;

        try{
            System.out.println("Inside try block..");

            finalDis = amount * dis / 100;

            System.exit(0);
        }
        catch (Exception e) {
            System.out.println("some exception...");
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside finally block");
        }

        return finalDis;
    }
}

// The finally block always executes before the method actually completes,
// even if there is a return
// statement inside the try or catch block.
