// Outer class (Non-Static)
class OuterClass {

    // Non-Static Inner class
    class NonStaticInnerClass {
        void display() {
            System.out.println("Non-Static Inner Class Display");
        }
    }

    // Static Inner class
    static class StaticInnerClass {
        void display() {
            System.out.println("Static Inner Class Display");
        }
    }

    // Non-Static Method
    void outerMethod() {
        System.out.println("Outer Method Display");
    }

    // Static Method
    static void staticOuterMethod() {
        System.out.println("Static Outer Method Display");
    }
}

// Driver Class
public class CODE_Class {
    public static void main(String[] args) {

        // Accessing Non-Static Inner class through an instance of Outer class
        OuterClass outerClass = new OuterClass();
        OuterClass.NonStaticInnerClass nonStaticInnerClass = outerClass.new NonStaticInnerClass();
        nonStaticInnerClass.display();

        // Accessing Static Inner class through Outer class
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.display();

        // Accessing Non-Static Method
        outerClass.outerMethod();

        // Accessing Static Method
        OuterClass.staticOuterMethod();
    }
}