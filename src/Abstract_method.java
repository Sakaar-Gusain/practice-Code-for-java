abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void makeSound();

    // Non-abstract method
    void printName() {
        System.out.println("Name: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Barking...");
    }
}

public class Abstract_method {
    public static void main(String[] args) {
        Dog dog = new Dog("Bingo");
        dog.printName();
        dog.makeSound();
    }
}