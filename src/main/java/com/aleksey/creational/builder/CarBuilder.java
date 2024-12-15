package com.aleksey.creational.builder;

public class CarBuilder implements Builder {
    private int wheels;
    private String type;
    private int horsePower;
    private int engineVolume;
    private String wheelDrive;
    private int capacity;

    @Override
    public Builder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public Builder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public Builder setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    @Override
    public Builder setEngineVolume(int volume) {
        this.engineVolume = volume;
        return this;
    }

    @Override
    public Builder setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
        return this;
    }

    @Override
    public Builder setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    @Override
    public Car build() {
        return new Car(wheels, type, horsePower, engineVolume, wheelDrive, capacity);
    }
}
