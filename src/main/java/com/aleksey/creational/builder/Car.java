package com.aleksey.creational.builder;

public class Car {
    private int wheels;
    private String type;
    private int horsePower;
    private int engineVolume;
    private String wheelDrive;
    private int capacity;

    public Car(int wheels, String type, int horsePower, int engineVolume, String wheelDrive, int capacity) {
        this.wheels = wheels;
        this.type = type;
        this.horsePower = horsePower;
        this.engineVolume = engineVolume;
        this.wheelDrive = wheelDrive;
        this.capacity = capacity;
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public String getWheelDrive() {
        return wheelDrive;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", type='" + type + '\'' +
                ", horsePower=" + horsePower +
                ", engineVolume=" + engineVolume +
                ", wheelDrive='" + wheelDrive + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
