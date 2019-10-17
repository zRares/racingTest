package org.fasttrackit.racinggame;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

public class Car {

    String name;
    String color;
    double mileage;
    double maxSpeed;
    int doorCount;
    boolean running;

    // "has-a" relationship
    Engine engine;



}
