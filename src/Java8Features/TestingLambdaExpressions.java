package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
interface MyInterface{
    public String tryMethod();
}

@FunctionalInterface
interface I2{
    public int add(int x, int y);
}

class Car{
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
}

public class TestingLambdaExpressions {
    public static void main(String[] args) {
        MyInterface myInterface = () -> "Hi, I work!";
        System.out.println(myInterface.tryMethod());

        I2 i2 = (x,y)->x+y;
        System.out.println(i2.add(5,3));


        Car c1  = new Car("Maruti WagonR", "Grey");
        Car c2 = new Car("Honda City", "Blue");
        Car c3 = new Car("Maruti Switft Dezire", "Black");
        Car c4 = new Car("Ecosport", "white");

        List<Car> cars = Arrays.asList(c1,c2,c3,c4);

        //Filtering Maruti Cars
        Stream<Car> maruti_cars = cars.stream().filter(c->c.model.startsWith("Maruti "));

        maruti_cars.forEach(c -> System.out.println(c.model));
    }
}
