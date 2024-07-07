class Parent {
    public void publicMethod() {
        System.out.println("This is a public method in Parent class.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method in Parent class.");
    }

    void defaultMethod() {
        System.out.println("This is a default method in Parent class.");
    }
}

class Child extends Parent {
    public void accessAllMethods() {
        System.out.println("\nAccessing methods from Child class:");
        publicMethod();
        protectedMethod();
        defaultMethod();
    }
}

public class AC{
    public static void main(String[] args) {
        Child child = new Child();
        child.accessAllMethods();
    }
}