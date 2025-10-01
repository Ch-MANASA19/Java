// Superkeyword Example
class A {
    int l, b;

    // Constructor for class A
    A() {
        l = 10; // Initialize l
        b = 20; // Initialize b
    }
}

class B extends A {
    int h;

    // Constructor for class B
    B() {
        super();   // Call parent class constructor
        h = 30;    // Initialize h
    }

    // Method to calculate volume
    int volume() {
        return l * b * h;
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B b1 = new B();
        int r = b1.volume();
        System.out.println("The volume is: " + r);
    }
}
