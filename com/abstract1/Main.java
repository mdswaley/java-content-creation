package com.abstract1;

class Main {
    public static void main(String[] args) {
        ATM obj = new SBI();
        obj.withdraw();
    }
}
//Then highlight these points one by one:

// - Abstract method: Has no method body.
// - Concrete subclass: Must implement inherited abstract methods,
//unless the subclass is also abstract.
// - Concrete method: Can contain a normal
//implementation inside an abstract class.
