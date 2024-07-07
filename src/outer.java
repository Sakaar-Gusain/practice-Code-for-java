class Outer{
    int outerX = 10;

    class Inner {
        int innerX = 5;

        void display() {
            System.out.println("Outer: " + outerX);
            System.out.println("Inner: " + innerX);
        }
    }

    static class StaticNested {
        int staticNestedX = 20;

        void display() {
            System.out.println("Static Nested: " + staticNestedX);
        }
    }
}

public class outer {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.display();

        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.display();
    }
}