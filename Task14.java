//TASK 14 ACTIVITY (Create a subclass of the abstract class and implement the abstract method.)

abstract class abstractClass {
    abstract void abstractMethod();

    void concreteMethod() {
        System.out.println("This is a concrete method.\n");
    }
}

class B extends abstractClass {
    @Override
    void abstractMethod() {
        System.out.println("\nB's implementation of abstractMethod.");
    }
}

class C extends abstractClass {
    @Override
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}


public class Task14 {
    public static void main(String[] args) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();

        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
