package com.aleksey.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Parallelepiped cube = new Parallelepiped(10, 10, 10);
        ParallelepipedVersion version = new ParallelepipedVersion();
        System.out.println(cube);
        version.setParallelepiped(cube.save());
        System.out.println("Устанавливаем новые значения");
        cube.setNewSize(5, 15, 20);
        System.out.println(cube);
        System.out.println("Возвращаем старые значения");
        cube.load(version.getParallelepiped());
        System.out.println(cube);
    }
}
