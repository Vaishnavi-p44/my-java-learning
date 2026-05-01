class Animal {
    String name;

    // Method (behavior)
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Inheritance
class Dog extends Animal {

    // Method overriding (Polymorphism)
    void sound() {
        System.out.println("Dog barks");
    }
}

class OOPDemo {
    public static void main(String[] args) {

        // Object creation
        Dog d = new Dog();
        d.name = "Tommy";

        System.out.println("Name: " + d.name);

        // Calling method
        d.sound();
    }
}
    
