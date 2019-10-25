package org.fasttrackit.racinggame;

import java.sql.SQLOutput;

public class Vehicle {

    String name;
    String color;
    double mileage;
    double maxSpeed;
    boolean running;



    public double accelerate (double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " for " + durationInHours + " h.");
    }
}
