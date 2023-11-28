package org.example.nested_class.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    void method(){
        System.out.println(Engine.countOfObject);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }
    //внутри класса можем создать класс, интерфейс
    //Внутри  интерфейса можем создать интерфейс и класс

    public static class Engine{ //статичный нестед класс может быть использован, как обычный класс. Ведет себя, как обычный внешний класс, но находится внутри другого класса.
        //static nested class может содержать static и non-static элементы
        //static nested class может обращаться даже к private элементам внешнего класса, но только к static
        //Внешний класс может обращаться даже к private элементам static nested класса

        private int horsePower;
        static int countOfObject;

        public Engine(int horsePower) {
            System.out.println(a);

            this.horsePower = horsePower;
            countOfObject++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);//При создании объекта нестед класса указываем в каком классе находится наш нестед класс
        System.out.println(e);
        Car car = new Car("red",2,e);
        System.out.println(car);
    }
}
class Z extends Car.Engine{
    Z()(super(200);)

}
