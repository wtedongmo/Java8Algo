package com.twb.test;

public class Java8TesterDefaultM {
    public static void main(String args[]) {
        Vehicle vehicle = new Car();
        vehicle.print();

        Car bus1 = new Bus();
        bus1.print();
        Vehicle v2 = new Bus();
        v2.print();
    }
}

interface Vehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle/*, com.twb.test.FourWheeler*/ {

    public void print() {
        Vehicle.super.print();
//        com.twb.test.FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}

class Bus extends Car {

    @Override
    public void print() {
        System.out.println("I am a com.twb.test.Bus!");
    }
}
