package org.fasttrackit.racinggame;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.color = "grey";
        car.doorCount = 4;
        car.maxSpeed = 240;
        car.mileage = 10.5;
        car.running = true;

        Engine engine = new Engine();
        engine.manufacturer = "BavariaMotors";
        engine.cubicCentimeter = 3000;

        car.engine = engine;



        System.out.println("Car1: " + car.name);

        Car car2 = new Car();
        car2.name = "KIA";

        System.out.println("Car2: " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.doorCount);
        System.out.println(car2.running);


    }
}
