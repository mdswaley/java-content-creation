package Debugging;

class Main {
    public static void main(String[] args) {
        int price = 1000;
        int quantity = 2;

        System.out.println("Order started");

        int total = OnlineShopping.calculateTotal(price, quantity);

        double discount = OnlineShopping.calculateDiscount(total);

        double finalAmount = total - discount;

        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}
