package com.aleksey.behavioral.memento;

public class Parallelepiped {
    private int x, y ,z;

    public Parallelepiped(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setNewSize(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Save save() {
        return new Save(this.x, this. y, this.z);
    }

    public void load(Save save) {
        this.x = save.x;
        this.y = save.y;
        this.z = save.z;
    }

    public class Save {
        private final int x, y, z;

        public Save(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    @Override
    public String toString() {
        return "Parallelepiped[\n" +
                "x=" + x +
                "\ny=" + y +
                "\nz=" + z +
                ']';
    }
}
