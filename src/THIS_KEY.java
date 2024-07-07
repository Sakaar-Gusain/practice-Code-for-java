class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class THIS_KEY {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30);
        employee.displayInfo();
    }
}