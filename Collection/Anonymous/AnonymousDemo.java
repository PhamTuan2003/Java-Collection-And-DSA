package Collection.Anonymous;

interface Polygon {
    void display();
}

class AnonymousDemo {
    public void createClass() {

        // anonymous class implementing interface
        Polygon p1 = () -> System.out.println("Inside an anonymous class.");
        p1.display();
    }
}

class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}
