package com.aleksey.builder;

public interface Builder {
    Builder setWheels(int wheels);
    Builder setType(String type);
    Builder setHorsePower(int horsePower);
    Builder setEngineVolume(int volume);
    Builder setWheelDrive(String wheelDrive);
    Builder setCapacity(int capacity);
    Car build();
}
