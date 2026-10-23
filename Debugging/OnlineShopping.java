package Debugging;

class OnlineShopping {

    static int calculateTotal(int price, int quantity) {

        int total = price * quantity;

        return total;
    }

    static double calculateDiscount(int total) {

        double discount = total * 0.10;

        return discount;
    }
}
