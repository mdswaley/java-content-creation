package PrimitiveWidening;

class Main {
//    Primitive widening means converting a smaller-range primitive data
//    type into a larger-range data type automatically.

//    byte (8-bit) → short (16-bit) → int (32-bit) → long (64-bit) →
//    float (32-bit) → double (64-bit)
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show(10);
        demo.show('A'); // 2 byte
        demo.show(2.5f); // 4 byte
    }
}
class Demo {
    void show(int a) { // 4 byte
        System.out.println("int");
    }

    void show(long a) { // 8 byte
        System.out.println("long");
    }

    void show(double a) { // 8 byte
        System.out.println("double");
    }
}
