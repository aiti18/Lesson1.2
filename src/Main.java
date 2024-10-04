public class Main {
    public static Parent createObject(String className) {
        switch (className) {
            case "Child1":
                return new Child1("Alice", 25, "Painting");
            case "Child2":
                return new Child2("Bob", 30, "Harry Potter");
            case "Child3":
                return new Child3("Charlie", 20, "Basketball");
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        // f) Создание объектов с помощью метода createObject
        Parent object1 = createObject("Child1");
        Parent object2 = createObject("Child2");
        Parent object3 = createObject("Child3");

        // Добавление объектов в массив
        Printable[] objects = { (Printable) object1, (Printable) object2, (Printable) object3 };

        // j) Вызов метода print() через цикл
        for (Printable obj : objects) {
            obj.print();
        }
    }
}
