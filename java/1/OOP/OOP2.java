public class OOP2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        p.show("Hello from Parent!");

        Child c = new Child();
        c.show();
        c.show("Hello from Child!");
    }
}

class Parent {
    void show() {
        System.out.println("Parent class: No parameters");
    }

    void show(String message) {
        System.out.println("Parent class: " + message);
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class: Overridden method");
    }

    @Override
    void show(String message) {
        System.out.println("Child class: " + message);
    }
}
