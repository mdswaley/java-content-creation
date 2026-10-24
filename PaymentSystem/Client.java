package PaymentSystem;

public class Client {
    public static void main(String[] args) {
//        CreditCard creditCard = new CreditCard();
//        creditCard.pay();

        ProcessPayment processPayment = new ProcessPayment();
        processPayment.process(new CreditCard()); // Anonymous object

        processPayment.process(new UPI());
    }
}
