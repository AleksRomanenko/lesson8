package ru.geekbrains;

public class Wall implements Barrier{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void barrier(int distance) {
        if (distance <= height) {
            System.out.printf("Высота стены составляет %d м. Ура, стена успешно пройдена!\n\n", height);
        } else {
            System.out.printf("Высота стены составляет %d м. Стена слишком высока, чтобы ее перепрыгнуть.\n\n", height);
        }

    }
}
