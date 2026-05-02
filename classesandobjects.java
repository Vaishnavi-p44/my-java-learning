class Car {
    String color;

    void drive() {
        System.out.println("Car is driving");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();   // Object
        c.color = "Red";
        System.out.println(c.color);
        c.drive();
    }
}