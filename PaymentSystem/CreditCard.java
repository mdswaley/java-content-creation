package PaymentSystem;

class CreditCard extends Payment{
    @Override
    void pay(){
        System.out.println("Payment using Credit Card");
    }

}
