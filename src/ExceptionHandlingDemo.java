// FileName: ExceptionHandlingDemo.java
class CheckedException extends Exception {
    CheckedException(String s) {
        super(s);
    }
}

class UnCheckedException extends RuntimeException {
    UnCheckedException(String s) {
        super(s);
    }
}

class Example {
    void doSomething(int i) throws CheckedException {
        if (i > 10) {
            throw new CheckedException("Exception thrown in doSomething method.");
        }
        System.out.println("Rest of the code in doSomething method.");
    }

    void doAnotherThing(int i) {
        if (i > 20) {
            throw new UnCheckedException("Exception thrown in doAnotherThing method.");
        }
        System.out.println("Rest of the code in doAnotherThing method.");
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Example example = new Example();
        try {
            example.doSomething(15);
            example.doAnotherThing(25);
        } catch (CheckedException ce) {
            System.out.println("Caught checked exception.");
            ce.printStackTrace();
        } catch (UnCheckedException ue) {
            System.out.println("Caught unchecked exception.");
            ue.printStackTrace();
        } finally {
            System.out.println("This is finally block, it executes regardless of an exception occurs or not.");
        }
    }
}