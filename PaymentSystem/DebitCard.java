package PaymentSystem;

class DebitCard extends Payment{
    @Override
    void pay(){
        System.out.println("Payment using Debit Card");
    }
}
